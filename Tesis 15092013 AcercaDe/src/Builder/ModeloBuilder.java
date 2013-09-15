package Builder;

import Model.Field;
import Model.Entity;
import Model.Model;
import Model.Relation;
import Utilities.Conexion_BD;
import View.InfoDatabase;
import java.io.IOException;
import java.sql.*;

public class ModeloBuilder 
{
     public static String nameBD; 
    /*
     * Método que permite Cargar el      
     */
     //Metodo carga modelo
     
     
    public static Model cargarModelo(InfoDatabase i)throws IOException, SQLException
    {
        
        Conexion_BD database = new Conexion_BD(i);
        database.makeConnection();
        Model m = new Model();
        try 
        {
                    
            //Método para traer columnas, campos, tipo del campo, tablas etc        
            DatabaseMetaData metadata = database.connection.getMetaData(); //Método general de java para extraer metadata de la base de datos
            ResultSet resultSet2 = metadata.getColumns(null, null, null, null);//Método para obtener las columnas de los metadatos obtenidos
            ResultSet resultTables = database.query("SHOW TABLES");//Metodo para obtener las tablas de los metadatos obtenidos
           
            resultSet2.next();
            nameBD = resultSet2.getString("TABLE_CAT");// retorna el nombre de la BD
            m.setName(nameBD);
             while (resultTables.next()) {
                Entity ent = new Entity();
                String nameTables = resultTables.getString(1);//retorna las tablas de la BD
                ent.setName(nameTables);
           
           //Metodo para obtener los campos y tipo de dato de la tabla 
           ResultSet resultFields = database.query("SELECT column_name, data_type, column_key FROM INFORMATION_SCHEMA.COLUMNS \n" +
                                                    "WHERE table_schema = '" + nameBD + "'\n" +
                                                    "AND table_name = '" + nameTables + "'\n" +
                                                    "AND column_name IS NOT NULL");
                    while(resultFields.next()){
                            Field f = new Field();
                            String nameFields = resultFields.getString(1);//retorna los campos de las tablas
                            String nameTypes = resultFields.getString(2);//retorna los campos de las tablas
                            String namePrimary = resultFields.getString(3);//retorna los campos de las tablas
                            f.setNameFields(nameFields);
                            f.setTypes(nameTypes);
                            f.setPrimarys(namePrimary);
                            ent.getFields().add(f);
                 } 
                    
              //Metodo para obtener las llaves Foraneas y llaves primarias
              ResultSet resultKey = database.query("SELECT table_name, column_name, referenced_table_name, referenced_column_name \n" +
                                                        "FROM INFORMATION_SCHEMA.key_column_usage \n" +
                                                        "WHERE referenced_table_schema = '" + nameBD + "'\n" +
                                                        "AND referenced_table_name \n" +
                                                        "IS NOT NULL\n" +
                                                        "ORDER BY table_name, column_name");
                    while(resultKey.next()){
                            Relation r = new Relation();
                            String tabla_name = resultKey.getString(1);//retorna los campos de las tablas
                            String column_name = resultKey.getString(2);//retorna los campos de las tablas
                            String referenced_tabla_name = resultKey.getString(3);//retorna los campos de las tablas
                            String referenced_column_name = resultKey.getString(4);//retorna los campos de las tablas
                            r.setEntidadOrigen(tabla_name);
                            r.setCampoOrigen(column_name);
                            r.setEntidadDestino(referenced_tabla_name);
                            r.setCampoDestino(referenced_column_name);
                            ent.getRelations().add(r);
                
                    }
            
                    m.getEntities().add(ent);
               
            }
            }
        
        catch(Exception e){  
        }
        return m; 
    }

    public String Path(InfoDatabase i) 
    {
               
        String entrada = i.getPath();
        String prueba = entrada.replace('.', '/');
        
        

     
        
        return prueba;
    }
    


}

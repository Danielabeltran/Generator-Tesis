package co.edu.usbbog.tests.builder;

import co.edu.usbbog.model.Field;
import co.edu.usbbog.model.Entity;
import co.edu.usbbog.model.Model;
import co.edu.usbbog.model.Relation;
import co.edu.usbbog.utilities.Conexion_BD;
import java.io.IOException;
import java.sql.*;

public class ModeloBuilder {

    public static String nameBD;
    //Metodo carga modelo

    public static Model cargarModelo() throws IOException, SQLException {
        Conexion_BD database = new Conexion_BD();
        database.makeConnection();
        Model m = new Model();
        
  String path2 = System.getProperty("user.dir");
  System.out.println(path2);
        try {

            //Método para traer columnas, campos, tipo del campo, tablas etc        
            DatabaseMetaData metadata = database.connection.getMetaData(); //Método general de java para extraer metadata de la base de datos
            ResultSet resultSet2 = metadata.getColumns(null, null, null, null);//Método para obtener las columnas de los metadatos obtenidos
            ResultSet resultTables = database.query("SHOW TABLES");//Metodo para obtener las tablas de los metadatos obtenidos

            resultSet2.next();
            nameBD = resultSet2.getString("TABLE_CAT");// retorna el nombre de la BD
            m.setName(nameBD);
            while (resultTables.next()) {

                // Genera la entidad
                Entity ent = generateEntity(resultTables, database);

                // Genera las relaciones de la entidad
                generateRelationships(database, ent);

                // Agrega la entidad al modelo
                m.getEntities().add(ent);

            }
        } catch (Exception e) {
        }
        return m;
    }

    private static Entity generateEntity(ResultSet resultTables, Conexion_BD database) throws SQLException {
        Entity ent = new Entity();
        String nameTables = resultTables.getString(1).substring(0, 1).toUpperCase() + resultTables.getString(1).substring(1);//retorna las tablas de la BD
        ent.setName(nameTables);
        ResultSet resultFields = database.query("SELECT column_name, data_type, column_key, numeric_scale FROM INFORMATION_SCHEMA.COLUMNS \n"
                + "WHERE table_schema = '" + nameBD + "'\n"
                + "AND table_name = '" + nameTables + "'\n"
                + "AND column_name IS NOT NULL");//Metodo para obtener los campos de la tabla

        while (resultFields.next()) {
            Field f = new Field();
            String nameFields = resultFields.getString(1);//retorna los campos de las tablas
            String nameTypes = resultFields.getString(2);//retorna el tipo de los campos
            String namePrimary = resultFields.getString(3);//retorna true si el campo es llave Primaria
            String numericScale = resultFields.getString(4);//retorna los numeric_scale de los tipos
            f.setName(nameFields);
            f.setType(nameTypes);
            f.setPrimary(namePrimary);
            f.setnumericScale(numericScale);
            ent.getField().add(f);
        } 
        return ent;
    }

    private static void generateRelationships(Conexion_BD database, Entity ent) throws SQLException {
        /**
        * Query para obtener las llaves foraneas de la base de datos 
        */
        ResultSet resultForeign = database.query("SELECT DISTINCT\n"
                                                    + " k.table_name, \n"
                                                    + " k.column_name, \n"
                                                    + "        i.data_type, \n"
                                                    + "k.referenced_table_name, \n"
                                                    + "k.referenced_column_name \n"
                                                    + "FROM INFORMATION_SCHEMA.key_column_usage k, \n"
                                                    + "        INFORMATION_SCHEMA.COLUMNS i  \n"
                                                    + "WHERE k.column_name = i.column_name \n"
                                                    + " AND k.table_schema ='" + nameBD + "' \n"
                                                    //+ " AND k.table_name = '" + nameTables + "' \n"
                                                    + " AND referenced_table_name IS NOT NULL");

        while (resultForeign.next()) {
            Relation r = new Relation();
            String tabla_name = resultForeign.getString(1);//retorna los campos de las tablas
            String column_name = resultForeign.getString(2);//retorna los campos de las tablas
            String type_column_name = resultForeign.getString(3);//retorna los tipos de los campos de las tablas
            String referenced_tabla_name = resultForeign.getString(4);//retorna los campos de las tablas
            String referenced_column_name = resultForeign.getString(5);//retorna los campos de las tablas
            r.setEntidadOrigen(tabla_name);
            r.setCampoOrigen(column_name);
            r.setTypeCampoOrigen(type_column_name);
            r.setEntidadDestino(referenced_tabla_name);
            r.setCampoDestino(referenced_column_name);
            ent.getRelation().add(r);

        }
    }
}

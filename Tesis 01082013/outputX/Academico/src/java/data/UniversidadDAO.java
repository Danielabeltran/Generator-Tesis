 
package data;

import entity.Universidad;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
* @author Clase generada por Generator v1.0
*/

public class UniversidadDAO{
    
     /**
     * Obtiene la lista de Universidad
     * @return lista de Universidad
     */

public void create(Universidad u) {
        
        /**
        * Crea la conexion a la base de datos
        */
        ConexionDB database = new ConexionDB();
        database.makeConnection();

        try{
        /**
        * Genera la inserciÃ³n en la tabla
        */
        String format = "insert into Universidad( id,  nombre, ) values( ,'%s'  ,'%s' )";
        String sql = String.format(format, u.getId() , u.getNombre() );
        
        /**
        * Guarda los datos en la base de datos Academico
        */  
        database.nonQuery(sql);
            
        }catch(Exception ex){
            
        }
    }


    public List<Universidad> getAll(){

        /**
        * Crea la conexion a la base de datos
        */
        ConexionDB database = new ConexionDB();
        database.makeConnection();

        /**
        * Crea una lista de Universidad
        */
        List<Universidad> list = new ArrayList<Universidad>();
        
        try{
        /**
        * Crea una lista de Academico
        */
        ResultSet query = database.query("select * from Universidad");
        
        /**
        * Se recorre la consulta
        */
        while (query.next()){

        /**
        * Se obtiene los datos de Universidad
        */
        int id = query.getInt("id");
        String nombre = query.getString("nombre");
                
        /**
        * Crea una entidad Universidad
        */
        Universidad u = new Universidad();
        u.setId(id);
        u.setNombre(nombre);
                /**
        * Agrega la entidad a la lista
        */
        list.add(u);
        }
        }catch(Exception ex){
        }
        return list;
    }




        
    public void update(Universidad u) {

        /**
        * Crea la conexion a la base de datos
        */
        ConexionDB database = new ConexionDB();
        database.makeConnection();
        
        try{
        /**
        * Crea la sentencia de actualizacion en la tabla Universidad
        */
        String format = "update Universidad set, id = '%s', nombre = '%s' where id = '%s'}";
        String sql = String.format(format, u.getId(), u.getNombre());
        
        /**
        * Ejecuta la actualizaciÃ³n
        */
        database.nonQuery(sql);
        
        }
        
        catch(Exception ex){
        }
    }
    


        
    public void deleteUniversidad(int id){
        /**
        * Crea la conexion a la base de datos
        */
        ConexionDB database = new ConexionDB();
        database.makeConnection();
        
        try{

        /**
        * Crea la sentencia de eliminacion de la tabla de la base de datos
        */
        String format = "delete from Universidad where id = '%s'}";
        String sql = String.format(format, id);
        
        /**
        * Ejecuta la actualizaciÃ³n
        */
        database.nonQuery(sql);
        }
        catch(Exception ex){
        }
     }
    


  
   
public Universidad getById (int id){
        /**
        * Crea la conexion a la base de datos
        */
        ConexionDB database = new ConexionDB();
        database.makeConnection();
        
        try{

        /**
        * Ejecuta la consulta en la tabla Universidad
        */
        ResultSet query = database.query("select * from Universidad where id = " +  id);
     
        /**
        * Primer registro
        */
        query.first();
        
        /**
        * Se obtienen los campos de la tabla Universidad
        */
        Universidad u = new Universidad();
        u.setId(query.getInt("id"));
        u.setNombre(query.getString("nombre"));
                
        /**
        * retorna la entididad
        */
        return u;

       }
        catch(Exception ex){
        }
        return null;
    } 
  


  



}


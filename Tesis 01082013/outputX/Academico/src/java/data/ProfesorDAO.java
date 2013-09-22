 
package data;

import entity.Profesor;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
* @author Clase generada por Generator v1.0
*/

public class ProfesorDAO{
    
     /**
     * Obtiene la lista de Profesor
     * @return lista de Profesor
     */

public void create(Profesor p) {
        
        /**
        * Crea la conexion a la base de datos
        */
        ConexionDB database = new ConexionDB();
        database.makeConnection();

        try{
        /**
        * Genera la inserciÃ³n en la tabla
        */
        String format = "insert into Profesor( id,  nombre,  usuario,  clave,  email, ) values( ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s' )";
        String sql = String.format(format, p.getId() , p.getNombre() , p.getUsuario() , p.getClave() , p.getEmail() );
        
        /**
        * Guarda los datos en la base de datos Academico
        */  
        database.nonQuery(sql);
            
        }catch(Exception ex){
            
        }
    }


    public List<Profesor> getAll(){

        /**
        * Crea la conexion a la base de datos
        */
        ConexionDB database = new ConexionDB();
        database.makeConnection();

        /**
        * Crea una lista de Profesor
        */
        List<Profesor> list = new ArrayList<Profesor>();
        
        try{
        /**
        * Crea una lista de Academico
        */
        ResultSet query = database.query("select * from Profesor");
        
        /**
        * Se recorre la consulta
        */
        while (query.next()){

        /**
        * Se obtiene los datos de Profesor
        */
        int id = query.getInt("id");
        String nombre = query.getString("nombre");
        String usuario = query.getString("usuario");
        String clave = query.getString("clave");
        String email = query.getString("email");
                
        /**
        * Crea una entidad Profesor
        */
        Profesor p = new Profesor();
        p.setId(id);
        p.setNombre(nombre);
        p.setUsuario(usuario);
        p.setClave(clave);
        p.setEmail(email);
                /**
        * Agrega la entidad a la lista
        */
        list.add(p);
        }
        }catch(Exception ex){
        }
        return list;
    }




        
    public void update(Profesor p) {

        /**
        * Crea la conexion a la base de datos
        */
        ConexionDB database = new ConexionDB();
        database.makeConnection();
        
        try{
        /**
        * Crea la sentencia de actualizacion en la tabla Profesor
        */
        String format = "update Profesor set, id = '%s', nombre = '%s', usuario = '%s', clave = '%s', email = '%s' where id = '%s'}";
        String sql = String.format(format, p.getId(), p.getNombre(), p.getUsuario(), p.getClave(), p.getEmail());
        
        /**
        * Ejecuta la actualizaciÃ³n
        */
        database.nonQuery(sql);
        
        }
        
        catch(Exception ex){
        }
    }
                


        
    public void deleteProfesor(int id){
        /**
        * Crea la conexion a la base de datos
        */
        ConexionDB database = new ConexionDB();
        database.makeConnection();
        
        try{

        /**
        * Crea la sentencia de eliminacion de la tabla de la base de datos
        */
        String format = "delete from Profesor where id = '%s'}";
        String sql = String.format(format, id);
        
        /**
        * Ejecuta la actualizaciÃ³n
        */
        database.nonQuery(sql);
        }
        catch(Exception ex){
        }
     }
                


  
   
public Profesor getById (int id){
        /**
        * Crea la conexion a la base de datos
        */
        ConexionDB database = new ConexionDB();
        database.makeConnection();
        
        try{

        /**
        * Ejecuta la consulta en la tabla Profesor
        */
        ResultSet query = database.query("select * from Profesor where id = " +  id);
     
        /**
        * Primer registro
        */
        query.first();
        
        /**
        * Se obtienen los campos de la tabla Profesor
        */
        Profesor p = new Profesor();
        p.setId(query.getInt("id"));
        p.setNombre(query.getString("nombre"));
        p.setUsuario(query.getString("usuario"));
        p.setClave(query.getString("clave"));
        p.setEmail(query.getString("email"));
                
        /**
        * retorna la entididad
        */
        return p;

       }
        catch(Exception ex){
        }
        return null;
    } 
     


  



}


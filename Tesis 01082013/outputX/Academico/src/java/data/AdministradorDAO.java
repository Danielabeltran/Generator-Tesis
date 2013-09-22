 
package data;

import entity.Administrador;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
* @author Clase generada por Generator v1.0
*/

public class AdministradorDAO{
    
     /**
     * Obtiene la lista de Administrador
     * @return lista de Administrador
     */

public void create(Administrador a) {
        
        /**
        * Crea la conexion a la base de datos
        */
        ConexionDB database = new ConexionDB();
        database.makeConnection();

        try{
        /**
        * Genera la inserciÃ³n en la tabla
        */
        String format = "insert into Administrador( id,  nombre,  usuario,  clave, ) values( ,'%s'  ,'%s'  ,'%s'  ,'%s' )";
        String sql = String.format(format, a.getId() , a.getNombre() , a.getUsuario() , a.getClave() );
        
        /**
        * Guarda los datos en la base de datos Academico
        */  
        database.nonQuery(sql);
            
        }catch(Exception ex){
            
        }
    }


    public List<Administrador> getAll(){

        /**
        * Crea la conexion a la base de datos
        */
        ConexionDB database = new ConexionDB();
        database.makeConnection();

        /**
        * Crea una lista de Administrador
        */
        List<Administrador> list = new ArrayList<Administrador>();
        
        try{
        /**
        * Crea una lista de Academico
        */
        ResultSet query = database.query("select * from Administrador");
        
        /**
        * Se recorre la consulta
        */
        while (query.next()){

        /**
        * Se obtiene los datos de Administrador
        */
        int id = query.getInt("id");
        String nombre = query.getString("nombre");
        String usuario = query.getString("usuario");
        String clave = query.getString("clave");
                
        /**
        * Crea una entidad Administrador
        */
        Administrador a = new Administrador();
        a.setId(id);
        a.setNombre(nombre);
        a.setUsuario(usuario);
        a.setClave(clave);
                /**
        * Agrega la entidad a la lista
        */
        list.add(a);
        }
        }catch(Exception ex){
        }
        return list;
    }




        
    public void update(Administrador a) {

        /**
        * Crea la conexion a la base de datos
        */
        ConexionDB database = new ConexionDB();
        database.makeConnection();
        
        try{
        /**
        * Crea la sentencia de actualizacion en la tabla Administrador
        */
        String format = "update Administrador set, id = '%s', nombre = '%s', usuario = '%s', clave = '%s' where id = '%s'}";
        String sql = String.format(format, a.getId(), a.getNombre(), a.getUsuario(), a.getClave());
        
        /**
        * Ejecuta la actualizaciÃ³n
        */
        database.nonQuery(sql);
        
        }
        
        catch(Exception ex){
        }
    }
            


        
    public void deleteAdministrador(int id){
        /**
        * Crea la conexion a la base de datos
        */
        ConexionDB database = new ConexionDB();
        database.makeConnection();
        
        try{

        /**
        * Crea la sentencia de eliminacion de la tabla de la base de datos
        */
        String format = "delete from Administrador where id = '%s'}";
        String sql = String.format(format, id);
        
        /**
        * Ejecuta la actualizaciÃ³n
        */
        database.nonQuery(sql);
        }
        catch(Exception ex){
        }
     }
            


  
   
public Administrador getById (int id){
        /**
        * Crea la conexion a la base de datos
        */
        ConexionDB database = new ConexionDB();
        database.makeConnection();
        
        try{

        /**
        * Ejecuta la consulta en la tabla Administrador
        */
        ResultSet query = database.query("select * from Administrador where id = " +  id);
     
        /**
        * Primer registro
        */
        query.first();
        
        /**
        * Se obtienen los campos de la tabla Administrador
        */
        Administrador a = new Administrador();
        a.setId(query.getInt("id"));
        a.setNombre(query.getString("nombre"));
        a.setUsuario(query.getString("usuario"));
        a.setClave(query.getString("clave"));
                
        /**
        * retorna la entididad
        */
        return a;

       }
        catch(Exception ex){
        }
        return null;
    } 
    


  



}


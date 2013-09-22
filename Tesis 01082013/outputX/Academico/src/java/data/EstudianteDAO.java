 
package data;

import entity.Estudiante;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
* @author Clase generada por Generator v1.0
*/

public class EstudianteDAO{
    
     /**
     * Obtiene la lista de Estudiante
     * @return lista de Estudiante
     */

public void create(Estudiante e) {
        
        /**
        * Crea la conexion a la base de datos
        */
        ConexionDB database = new ConexionDB();
        database.makeConnection();

        try{
        /**
        * Genera la inserciÃ³n en la tabla
        */
        String format = "insert into Estudiante( id,  id_Universidad,  codigo,  nombre,  usuario,  clave,  email, ) values( ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s' )";
        String sql = String.format(format, e.getId() , e.getId_universidad() , e.getCodigo() , e.getNombre() , e.getUsuario() , e.getClave() , e.getEmail() );
        
        /**
        * Guarda los datos en la base de datos Academico
        */  
        database.nonQuery(sql);
            
        }catch(Exception ex){
            
        }
    }


    public List<Estudiante> getAll(){

        /**
        * Crea la conexion a la base de datos
        */
        ConexionDB database = new ConexionDB();
        database.makeConnection();

        /**
        * Crea una lista de Estudiante
        */
        List<Estudiante> list = new ArrayList<Estudiante>();
        
        try{
        /**
        * Crea una lista de Academico
        */
        ResultSet query = database.query("select * from Estudiante");
        
        /**
        * Se recorre la consulta
        */
        while (query.next()){

        /**
        * Se obtiene los datos de Estudiante
        */
        int id = query.getInt("id");
        int id_Universidad = query.getInt("id_Universidad");
        int codigo = query.getInt("codigo");
        String nombre = query.getString("nombre");
        String usuario = query.getString("usuario");
        String clave = query.getString("clave");
        String email = query.getString("email");
                
        /**
        * Crea una entidad Estudiante
        */
        Estudiante e = new Estudiante();
        e.setId(id);
        e.setId_universidad(id_Universidad);
        e.setCodigo(codigo);
        e.setNombre(nombre);
        e.setUsuario(usuario);
        e.setClave(clave);
        e.setEmail(email);
                /**
        * Agrega la entidad a la lista
        */
        list.add(e);
        }
        }catch(Exception ex){
        }
        return list;
    }




        
    public void update(Estudiante e) {

        /**
        * Crea la conexion a la base de datos
        */
        ConexionDB database = new ConexionDB();
        database.makeConnection();
        
        try{
        /**
        * Crea la sentencia de actualizacion en la tabla Estudiante
        */
        String format = "update Estudiante set, id = '%s', id_Universidad = '%s', codigo = '%s', nombre = '%s', usuario = '%s', clave = '%s', email = '%s' where id = '%s'}";
        String sql = String.format(format, e.getId(), e.getId_universidad(), e.getCodigo(), e.getNombre(), e.getUsuario(), e.getClave(), e.getEmail());
        
        /**
        * Ejecuta la actualizaciÃ³n
        */
        database.nonQuery(sql);
        
        }
        
        catch(Exception ex){
        }
    }
                        


        
    public void deleteEstudiante(int id){
        /**
        * Crea la conexion a la base de datos
        */
        ConexionDB database = new ConexionDB();
        database.makeConnection();
        
        try{

        /**
        * Crea la sentencia de eliminacion de la tabla de la base de datos
        */
        String format = "delete from Estudiante where id = '%s'}";
        String sql = String.format(format, id);
        
        /**
        * Ejecuta la actualizaciÃ³n
        */
        database.nonQuery(sql);
        }
        catch(Exception ex){
        }
     }
                        


  
   
public Estudiante getById (int id){
        /**
        * Crea la conexion a la base de datos
        */
        ConexionDB database = new ConexionDB();
        database.makeConnection();
        
        try{

        /**
        * Ejecuta la consulta en la tabla Estudiante
        */
        ResultSet query = database.query("select * from Estudiante where id = " +  id);
     
        /**
        * Primer registro
        */
        query.first();
        
        /**
        * Se obtienen los campos de la tabla Estudiante
        */
        Estudiante e = new Estudiante();
        e.setId(query.getInt("id"));
        e.setId_universidad(query.getInt("id_Universidad"));
        e.setCodigo(query.getInt("codigo"));
        e.setNombre(query.getString("nombre"));
        e.setUsuario(query.getString("usuario"));
        e.setClave(query.getString("clave"));
        e.setEmail(query.getString("email"));
                
        /**
        * retorna la entididad
        */
        return e;

       }
        catch(Exception ex){
        }
        return null;
    } 
       


  

public List<Estudiante> EstudiantedeUniversidad(int id_Universidad ){
        
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}


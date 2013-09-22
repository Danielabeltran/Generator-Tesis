 
package data;

import entity.Curso;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
* @author Clase generada por Generator v1.0
*/

public class CursoDAO{
    
     /**
     * Obtiene la lista de Curso
     * @return lista de Curso
     */

public void create(Curso c) {
        
        /**
        * Crea la conexion a la base de datos
        */
        ConexionDB database = new ConexionDB();
        database.makeConnection();

        try{
        /**
        * Genera la inserciÃ³n en la tabla
        */
        String format = "insert into Curso( id,  id_Profesor,  id_Universidad,  asignatura,  grupo,  horario, ) values( ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s' )";
        String sql = String.format(format, c.getId() , c.getId_profesor() , c.getId_universidad() , c.getAsignatura() , c.getGrupo() , c.getHorario() );
        
        /**
        * Guarda los datos en la base de datos Academico
        */  
        database.nonQuery(sql);
            
        }catch(Exception ex){
            
        }
    }


    public List<Curso> getAll(){

        /**
        * Crea la conexion a la base de datos
        */
        ConexionDB database = new ConexionDB();
        database.makeConnection();

        /**
        * Crea una lista de Curso
        */
        List<Curso> list = new ArrayList<Curso>();
        
        try{
        /**
        * Crea una lista de Academico
        */
        ResultSet query = database.query("select * from Curso");
        
        /**
        * Se recorre la consulta
        */
        while (query.next()){

        /**
        * Se obtiene los datos de Curso
        */
        int id = query.getInt("id");
        int id_Profesor = query.getInt("id_Profesor");
        int id_Universidad = query.getInt("id_Universidad");
        String asignatura = query.getString("asignatura");
        String grupo = query.getString("grupo");
        String horario = query.getString("horario");
                
        /**
        * Crea una entidad Curso
        */
        Curso c = new Curso();
        c.setId(id);
        c.setId_profesor(id_Profesor);
        c.setId_universidad(id_Universidad);
        c.setAsignatura(asignatura);
        c.setGrupo(grupo);
        c.setHorario(horario);
                /**
        * Agrega la entidad a la lista
        */
        list.add(c);
        }
        }catch(Exception ex){
        }
        return list;
    }




        
    public void update(Curso c) {

        /**
        * Crea la conexion a la base de datos
        */
        ConexionDB database = new ConexionDB();
        database.makeConnection();
        
        try{
        /**
        * Crea la sentencia de actualizacion en la tabla Curso
        */
        String format = "update Curso set, id = '%s', id_Profesor = '%s', id_Universidad = '%s', asignatura = '%s', grupo = '%s', horario = '%s' where id = '%s'}";
        String sql = String.format(format, c.getId(), c.getId_profesor(), c.getId_universidad(), c.getAsignatura(), c.getGrupo(), c.getHorario());
        
        /**
        * Ejecuta la actualizaciÃ³n
        */
        database.nonQuery(sql);
        
        }
        
        catch(Exception ex){
        }
    }
                    


        
    public void deleteCurso(int id){
        /**
        * Crea la conexion a la base de datos
        */
        ConexionDB database = new ConexionDB();
        database.makeConnection();
        
        try{

        /**
        * Crea la sentencia de eliminacion de la tabla de la base de datos
        */
        String format = "delete from Curso where id = '%s'}";
        String sql = String.format(format, id);
        
        /**
        * Ejecuta la actualizaciÃ³n
        */
        database.nonQuery(sql);
        }
        catch(Exception ex){
        }
     }
                    


  
   
public Curso getById (int id){
        /**
        * Crea la conexion a la base de datos
        */
        ConexionDB database = new ConexionDB();
        database.makeConnection();
        
        try{

        /**
        * Ejecuta la consulta en la tabla Curso
        */
        ResultSet query = database.query("select * from Curso where id = " +  id);
     
        /**
        * Primer registro
        */
        query.first();
        
        /**
        * Se obtienen los campos de la tabla Curso
        */
        Curso c = new Curso();
        c.setId(query.getInt("id"));
        c.setId_profesor(query.getInt("id_Profesor"));
        c.setId_universidad(query.getInt("id_Universidad"));
        c.setAsignatura(query.getString("asignatura"));
        c.setGrupo(query.getString("grupo"));
        c.setHorario(query.getString("horario"));
                
        /**
        * retorna la entididad
        */
        return c;

       }
        catch(Exception ex){
        }
        return null;
    } 
      


  

public List<Curso> CursodeProfesor(int id_Profesor ){
        
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public List<Curso> CursodeUniversidad(int id_Universidad ){
        
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}


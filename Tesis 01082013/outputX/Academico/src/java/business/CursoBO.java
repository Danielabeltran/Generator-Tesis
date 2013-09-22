
package business;

import data.TIPOSDAO;
import data.AdministradorDAO;
import data.CursoDAO;
import data.EstudianteDAO;
import data.NotaDAO;
import data.ProfesorDAO;
import data.UniversidadDAO;
import entity.TIPOS;
import entity.Administrador;
import entity.Curso;
import entity.Estudiante;
import entity.Nota;
import entity.Profesor;
import entity.Universidad;
import java.util.List;

/**
* @author Clase generada por Generator v1.0
*/

public class CursoBO {

     /**
     * Crea un Curso en el sistema
     * @param c Curso a crear
     */

    public void create(Curso c){
        /**
        * Crea un objeto de datos
        */ 
        CursoDAO object = new CursoDAO();
        /**
        * Crea la entidad en la base de datos
        */ 
        object.create(c); 
    }

     /**
     * Obtiene la lista de Curso
     * @return lista de Curso
     */
    public List<Curso> getAll(){
        /**
        * Crea un objeto de datos
        */   
        CursoDAO object = new CursoDAO();
        /**
        * Obtiene la lista de Curso
        */   
        List<Curso> list = object.getAll();
        /**
        *@return list 
        */ 
        return list;
    }

     /**
     * Actualiza  Curso
     * @param c Curso a Actualizar
     */
    public void updateCurso(Curso c){
     
       new CursoDAO().update(c);
    }



             /**
     * Elimina  Curso
     * @param c Curso a Eliminar
     */
    public void deleteCurso(int id){
     
       new CursoDAO().deleteCurso(id);
    }

    /**
     * Obtiene la llave primaria de  Curso
     * @param c Curso de la tabla a obtener la llave primaria
     */
    public Curso getById (int id){
     
       return new CursoDAO().getById (id);
    }
                    

  

public List<Curso> getAllCursodeProfesor(int id_Profesor ){
        
       CursoDAO object = new CursoDAO();
       List<Curso> list = object.CursodeProfesor(id_Profesor);
       return list;
    }

public List<Curso> getAllCursodeUniversidad(int id_Universidad ){
        
       CursoDAO object = new CursoDAO();
       List<Curso> list = object.CursodeUniversidad(id_Universidad);
       return list;
    }

   

//EntidadOrigen/CampoOrigen/typeCampoOrigen -> EntidadDestino/CampoDestino
    //curso, id_Profesor, int -> profesor, id
    //curso, id_Universidad, int -> universidad, id
    //estudiante, id_Universidad, int -> universidad, id
    //nota, id_Estudiante, int -> estudiante, id
    //nota, id_Curso, int -> curso, id
}
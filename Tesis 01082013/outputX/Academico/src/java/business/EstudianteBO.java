
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

public class EstudianteBO {

     /**
     * Crea un Estudiante en el sistema
     * @param e Estudiante a crear
     */

    public void create(Estudiante e){
        /**
        * Crea un objeto de datos
        */ 
        EstudianteDAO object = new EstudianteDAO();
        /**
        * Crea la entidad en la base de datos
        */ 
        object.create(e); 
    }

     /**
     * Obtiene la lista de Estudiante
     * @return lista de Estudiante
     */
    public List<Estudiante> getAll(){
        /**
        * Crea un objeto de datos
        */   
        EstudianteDAO object = new EstudianteDAO();
        /**
        * Obtiene la lista de Estudiante
        */   
        List<Estudiante> list = object.getAll();
        /**
        *@return list 
        */ 
        return list;
    }

     /**
     * Actualiza  Estudiante
     * @param e Estudiante a Actualizar
     */
    public void updateEstudiante(Estudiante e){
     
       new EstudianteDAO().update(e);
    }



             /**
     * Elimina  Estudiante
     * @param e Estudiante a Eliminar
     */
    public void deleteEstudiante(int id){
     
       new EstudianteDAO().deleteEstudiante(id);
    }

    /**
     * Obtiene la llave primaria de  Estudiante
     * @param e Estudiante de la tabla a obtener la llave primaria
     */
    public Estudiante getById (int id){
     
       return new EstudianteDAO().getById (id);
    }
                        

  

public List<Estudiante> getAllEstudiantedeUniversidad(int id_Universidad ){
        
       EstudianteDAO object = new EstudianteDAO();
       List<Estudiante> list = object.EstudiantedeUniversidad(id_Universidad);
       return list;
    }

   

//EntidadOrigen/CampoOrigen/typeCampoOrigen -> EntidadDestino/CampoDestino
    //curso, id_Profesor, int -> profesor, id
    //curso, id_Universidad, int -> universidad, id
    //estudiante, id_Universidad, int -> universidad, id
    //nota, id_Estudiante, int -> estudiante, id
    //nota, id_Curso, int -> curso, id
}
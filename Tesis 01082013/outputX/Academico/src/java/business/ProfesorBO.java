
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

public class ProfesorBO {

     /**
     * Crea un Profesor en el sistema
     * @param p Profesor a crear
     */

    public void create(Profesor p){
        /**
        * Crea un objeto de datos
        */ 
        ProfesorDAO object = new ProfesorDAO();
        /**
        * Crea la entidad en la base de datos
        */ 
        object.create(p); 
    }

     /**
     * Obtiene la lista de Profesor
     * @return lista de Profesor
     */
    public List<Profesor> getAll(){
        /**
        * Crea un objeto de datos
        */   
        ProfesorDAO object = new ProfesorDAO();
        /**
        * Obtiene la lista de Profesor
        */   
        List<Profesor> list = object.getAll();
        /**
        *@return list 
        */ 
        return list;
    }

     /**
     * Actualiza  Profesor
     * @param p Profesor a Actualizar
     */
    public void updateProfesor(Profesor p){
     
       new ProfesorDAO().update(p);
    }



             /**
     * Elimina  Profesor
     * @param p Profesor a Eliminar
     */
    public void deleteProfesor(int id){
     
       new ProfesorDAO().deleteProfesor(id);
    }

    /**
     * Obtiene la llave primaria de  Profesor
     * @param p Profesor de la tabla a obtener la llave primaria
     */
    public Profesor getById (int id){
     
       return new ProfesorDAO().getById (id);
    }
                

  

   

//EntidadOrigen/CampoOrigen/typeCampoOrigen -> EntidadDestino/CampoDestino
    //curso, id_Profesor, int -> profesor, id
    //curso, id_Universidad, int -> universidad, id
    //estudiante, id_Universidad, int -> universidad, id
    //nota, id_Estudiante, int -> estudiante, id
    //nota, id_Curso, int -> curso, id
}
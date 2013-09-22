
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

public class UniversidadBO {

     /**
     * Crea un Universidad en el sistema
     * @param u Universidad a crear
     */

    public void create(Universidad u){
        /**
        * Crea un objeto de datos
        */ 
        UniversidadDAO object = new UniversidadDAO();
        /**
        * Crea la entidad en la base de datos
        */ 
        object.create(u); 
    }

     /**
     * Obtiene la lista de Universidad
     * @return lista de Universidad
     */
    public List<Universidad> getAll(){
        /**
        * Crea un objeto de datos
        */   
        UniversidadDAO object = new UniversidadDAO();
        /**
        * Obtiene la lista de Universidad
        */   
        List<Universidad> list = object.getAll();
        /**
        *@return list 
        */ 
        return list;
    }

     /**
     * Actualiza  Universidad
     * @param u Universidad a Actualizar
     */
    public void updateUniversidad(Universidad u){
     
       new UniversidadDAO().update(u);
    }



             /**
     * Elimina  Universidad
     * @param u Universidad a Eliminar
     */
    public void deleteUniversidad(int id){
     
       new UniversidadDAO().deleteUniversidad(id);
    }

    /**
     * Obtiene la llave primaria de  Universidad
     * @param u Universidad de la tabla a obtener la llave primaria
     */
    public Universidad getById (int id){
     
       return new UniversidadDAO().getById (id);
    }
    

  

   

//EntidadOrigen/CampoOrigen/typeCampoOrigen -> EntidadDestino/CampoDestino
    //curso, id_Profesor, int -> profesor, id
    //curso, id_Universidad, int -> universidad, id
    //estudiante, id_Universidad, int -> universidad, id
    //nota, id_Estudiante, int -> estudiante, id
    //nota, id_Curso, int -> curso, id
}
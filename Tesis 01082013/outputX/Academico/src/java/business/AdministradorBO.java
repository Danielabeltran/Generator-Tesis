
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

public class AdministradorBO {

     /**
     * Crea un Administrador en el sistema
     * @param a Administrador a crear
     */

    public void create(Administrador a){
        /**
        * Crea un objeto de datos
        */ 
        AdministradorDAO object = new AdministradorDAO();
        /**
        * Crea la entidad en la base de datos
        */ 
        object.create(a); 
    }

     /**
     * Obtiene la lista de Administrador
     * @return lista de Administrador
     */
    public List<Administrador> getAll(){
        /**
        * Crea un objeto de datos
        */   
        AdministradorDAO object = new AdministradorDAO();
        /**
        * Obtiene la lista de Administrador
        */   
        List<Administrador> list = object.getAll();
        /**
        *@return list 
        */ 
        return list;
    }

     /**
     * Actualiza  Administrador
     * @param a Administrador a Actualizar
     */
    public void updateAdministrador(Administrador a){
     
       new AdministradorDAO().update(a);
    }



             /**
     * Elimina  Administrador
     * @param a Administrador a Eliminar
     */
    public void deleteAdministrador(int id){
     
       new AdministradorDAO().deleteAdministrador(id);
    }

    /**
     * Obtiene la llave primaria de  Administrador
     * @param a Administrador de la tabla a obtener la llave primaria
     */
    public Administrador getById (int id){
     
       return new AdministradorDAO().getById (id);
    }
            

  

   

//EntidadOrigen/CampoOrigen/typeCampoOrigen -> EntidadDestino/CampoDestino
    //curso, id_Profesor, int -> profesor, id
    //curso, id_Universidad, int -> universidad, id
    //estudiante, id_Universidad, int -> universidad, id
    //nota, id_Estudiante, int -> estudiante, id
    //nota, id_Curso, int -> curso, id
}
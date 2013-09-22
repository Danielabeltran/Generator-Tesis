
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
import java.sql.Date;
import java.sql.Date;

/**
* @author Clase generada por Generator v1.0
*/

public class TIPOSBO {

     /**
     * Crea un TIPOS en el sistema
     * @param t TIPOS a crear
     */

    public void create(TIPOS t){
        /**
        * Crea un objeto de datos
        */ 
        TIPOSDAO object = new TIPOSDAO();
        /**
        * Crea la entidad en la base de datos
        */ 
        object.create(t); 
    }

     /**
     * Obtiene la lista de TIPOS
     * @return lista de TIPOS
     */
    public List<TIPOS> getAll(){
        /**
        * Crea un objeto de datos
        */   
        TIPOSDAO object = new TIPOSDAO();
        /**
        * Obtiene la lista de TIPOS
        */   
        List<TIPOS> list = object.getAll();
        /**
        *@return list 
        */ 
        return list;
    }

     /**
     * Actualiza  TIPOS
     * @param t TIPOS a Actualizar
     */
    public void updateTIPOS(TIPOS t){
     
       new TIPOSDAO().update(t);
    }



                                                                                                                                                        

  

   

//EntidadOrigen/CampoOrigen/typeCampoOrigen -> EntidadDestino/CampoDestino
    //curso, id_Profesor, int -> profesor, id
    //curso, id_Universidad, int -> universidad, id
    //estudiante, id_Universidad, int -> universidad, id
    //nota, id_Estudiante, int -> estudiante, id
    //nota, id_Curso, int -> curso, id
}
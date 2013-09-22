
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

public class NotaBO {

     /**
     * Crea un Nota en el sistema
     * @param n Nota a crear
     */

    public void create(Nota n){
        /**
        * Crea un objeto de datos
        */ 
        NotaDAO object = new NotaDAO();
        /**
        * Crea la entidad en la base de datos
        */ 
        object.create(n); 
    }

     /**
     * Obtiene la lista de Nota
     * @return lista de Nota
     */
    public List<Nota> getAll(){
        /**
        * Crea un objeto de datos
        */   
        NotaDAO object = new NotaDAO();
        /**
        * Obtiene la lista de Nota
        */   
        List<Nota> list = object.getAll();
        /**
        *@return list 
        */ 
        return list;
    }

     /**
     * Actualiza  Nota
     * @param n Nota a Actualizar
     */
    public void updateNota(Nota n){
     
       new NotaDAO().update(n);
    }



                        

  

public List<Nota> getAllNotadeEstudiante(int id_Estudiante ){
        
       NotaDAO object = new NotaDAO();
       List<Nota> list = object.NotadeEstudiante(id_Estudiante);
       return list;
    }

public List<Nota> getAllNotadeCurso(int id_Curso ){
        
       NotaDAO object = new NotaDAO();
       List<Nota> list = object.NotadeCurso(id_Curso);
       return list;
    }

   

//EntidadOrigen/CampoOrigen/typeCampoOrigen -> EntidadDestino/CampoDestino
    //curso, id_Profesor, int -> profesor, id
    //curso, id_Universidad, int -> universidad, id
    //estudiante, id_Universidad, int -> universidad, id
    //nota, id_Estudiante, int -> estudiante, id
    //nota, id_Curso, int -> curso, id
}
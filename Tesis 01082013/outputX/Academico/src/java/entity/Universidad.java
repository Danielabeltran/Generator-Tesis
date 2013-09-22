
package entity;



/**
* @author Clase generada por Generator v1.0
*/
public class Universidad{

    private int id;
    private String nombre;

    private List<Curso> curso;
    private List<Estudiante> estudiante;

public Universidad(){


    this.id = 0;
    this.nombre = "";


    this.curso = new ArrayList<Curso>();
    this.estudiante = new ArrayList<Estudiante>();
}


    /**
    * Get the value of id
    *
    * @return the value of id
    */
    public int getId(){
    return id;
    }

    /**
    * Set the value of id
    *
    * @return the value of id
    */
    public void setId(int id){
        this.id = id;
    }

    /**
    * Get the value of nombre
    *
    * @return the value of nombre
    */
    public String getNombre(){
    return nombre;
    }

    /**
    * Set the value of nombre
    *
    * @return the value of nombre
    */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }



    /**
    * Get the value of curso
    *
    * @return the value of curso
    */
    public List<Curso> getCurso() {
    return curso;
    }

    /**
    * Set the value of curso
    *
    * @return the value of curso
    */
    public void setCurso(List<Curso> curso){
        this.curso = curso;
    }
    /**
    * Get the value of estudiante
    *
    * @return the value of estudiante
    */
    public List<Estudiante> getEstudiante() {
    return estudiante;
    }

    /**
    * Set the value of estudiante
    *
    * @return the value of estudiante
    */
    public void setEstudiante(List<Estudiante> estudiante){
        this.estudiante = estudiante;
    }

}
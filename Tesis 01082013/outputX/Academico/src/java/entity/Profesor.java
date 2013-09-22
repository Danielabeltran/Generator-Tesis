
package entity;



/**
* @author Clase generada por Generator v1.0
*/
public class Profesor{

    private int id;
    private String nombre;
    private String usuario;
    private String clave;
    private String email;

    private List<Curso> curso;

public Profesor(){


    this.id = 0;
    this.nombre = "";
    this.usuario = "";
    this.clave = "";
    this.email = "";


    this.curso = new ArrayList<Curso>();
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
    * Get the value of usuario
    *
    * @return the value of usuario
    */
    public String getUsuario(){
    return usuario;
    }

    /**
    * Set the value of usuario
    *
    * @return the value of usuario
    */
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    /**
    * Get the value of clave
    *
    * @return the value of clave
    */
    public String getClave(){
    return clave;
    }

    /**
    * Set the value of clave
    *
    * @return the value of clave
    */
    public void setClave(String clave){
        this.clave = clave;
    }

    /**
    * Get the value of email
    *
    * @return the value of email
    */
    public String getEmail(){
    return email;
    }

    /**
    * Set the value of email
    *
    * @return the value of email
    */
    public void setEmail(String email){
        this.email = email;
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

}
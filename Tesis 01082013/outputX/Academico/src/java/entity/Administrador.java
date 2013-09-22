
package entity;



/**
* @author Clase generada por Generator v1.0
*/
public class Administrador{

    private int id;
    private String nombre;
    private String usuario;
    private String clave;


public Administrador(){


    this.id = 0;
    this.nombre = "";
    this.usuario = "";
    this.clave = "";


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




}
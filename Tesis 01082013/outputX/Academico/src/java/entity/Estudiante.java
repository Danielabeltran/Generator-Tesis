
package entity;



/**
* @author Clase generada por Generator v1.0
*/
public class Estudiante{

    private int id;
    private int id_Universidad;
    private int codigo;
    private String nombre;
    private String usuario;
    private String clave;
    private String email;

    private List<Nota> nota;

public Estudiante(){


    this.id = 0;
    this.id_Universidad = 0;
    this.codigo = 0;
    this.nombre = "";
    this.usuario = "";
    this.clave = "";
    this.email = "";


    this.nota = new ArrayList<Nota>();
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
    * Get the value of id_Universidad
    *
    * @return the value of id_Universidad
    */
    public int getId_universidad(){
    return id_Universidad;
    }

    /**
    * Set the value of id_Universidad
    *
    * @return the value of id_Universidad
    */
    public void setId_universidad(int id_Universidad){
        this.id_Universidad = id_Universidad;
    }

    /**
    * Get the value of codigo
    *
    * @return the value of codigo
    */
    public int getCodigo(){
    return codigo;
    }

    /**
    * Set the value of codigo
    *
    * @return the value of codigo
    */
    public void setCodigo(int codigo){
        this.codigo = codigo;
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
    * Get the value of nota
    *
    * @return the value of nota
    */
    public List<Nota> getNota() {
    return nota;
    }

    /**
    * Set the value of nota
    *
    * @return the value of nota
    */
    public void setNota(List<Nota> nota){
        this.nota = nota;
    }

}
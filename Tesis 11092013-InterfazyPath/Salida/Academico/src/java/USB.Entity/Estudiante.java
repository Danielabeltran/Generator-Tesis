package USBBOG.Entity;



[Model.Field@1bbfd3a, Model.Field@ee003d, Model.Field@151e0c4, Model.Field@7b7f35, Model.Field@1dc7a0d, Model.Field@1d121c7, Model.Field@10094da]
horario
Estudiante



      



public class Estudiante {
    
    
    private int id;
    private String nombres;
    private String usuario;
    private String clave;

    public Estudiante() {
        this.id = 0;
        this.nombres = "";
        this.usuario = "";
        this.clave = "";
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    

    
    
    
}

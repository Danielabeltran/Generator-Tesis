package USBBOG.Entity;



[Model.Field@13dff89, Model.Field@153b574, Model.Field@ade1b6, Model.Field@1bda657, Model.Field@1f39cb2, Model.Field@b49e68, Model.Field@bed64]
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

package USBBOG.Entity;



[Model.Field@16607fb, Model.Field@1962cfa, Model.Field@62f7da, Model.Field@17e42da, Model.Field@57306c, Model.Field@2c0ef0, Model.Field@88b0b3]
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

package USBBOG.Entity;



[Model.Field@187ce531, Model.Field@2fab0086, Model.Field@3af75dd, Model.Field@7463020e, Model.Field@101c20d4, Model.Field@26af468f, Model.Field@3d416a20]
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

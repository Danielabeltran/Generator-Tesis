package USBBOG.Entity;



[Model.Field@1e5fc9d, Model.Field@2bc102, Model.Field@8ca4dd, Model.Field@19bb4bb, Model.Field@176982e, Model.Field@1011281]
Population
Curso



      



public class Curso {
    
    
    private int id;
    private String nombres;
    private String usuario;
    private String clave;

    public Curso() {
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

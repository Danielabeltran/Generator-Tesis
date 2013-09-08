package USBBOG.Entity;



[Model.Field@1f897a7, Model.Field@1ac8210, Model.Field@8ee94b, Model.Field@766e80]
${fi.getNameFields()}
Administrador



      



public class Administrador {
    
    
    private int id;
    private String nombres;
    private String usuario;
    private String clave;

    public Administrador() {
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

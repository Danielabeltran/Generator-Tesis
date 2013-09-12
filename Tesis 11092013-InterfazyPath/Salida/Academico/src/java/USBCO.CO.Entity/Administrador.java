package USBBOG.Entity;



[Model.Field@1f38d7d, Model.Field@ce3393, Model.Field@19c1f49, Model.Field@ca2df1]
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

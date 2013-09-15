package USBBOG.Entity;



[Model.Field@1d9c289, Model.Field@172e395, Model.Field@1bb8356, Model.Field@1ab8c32, Model.Field@1813e0a]
clave
City



      



public class City {
    
    
    private int id;
    private String nombres;
    private String usuario;
    private String clave;

    public City() {
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

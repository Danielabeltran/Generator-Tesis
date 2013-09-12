package USBBOG.Entity;



[Model.Field@1a709f1, Model.Field@17db74b, Model.Field@8cbb70, Model.Field@165d417, Model.Field@476a1d]
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

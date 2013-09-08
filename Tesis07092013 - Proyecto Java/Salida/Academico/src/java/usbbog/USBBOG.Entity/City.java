package USBBOG.Entity;



[Model.Field@450fe6, Model.Field@16c634, Model.Field@12e8204, Model.Field@5a0faf, Model.Field@bbe4cf]
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

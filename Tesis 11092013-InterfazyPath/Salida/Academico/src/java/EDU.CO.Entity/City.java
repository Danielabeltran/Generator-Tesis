package USBBOG.Entity;



[Model.Field@ce3393, Model.Field@19c1f49, Model.Field@ca2df1, Model.Field@18e58ce, Model.Field@686c5e]
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

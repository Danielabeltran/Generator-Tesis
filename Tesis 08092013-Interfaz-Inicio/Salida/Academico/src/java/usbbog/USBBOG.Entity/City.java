package USBBOG.Entity;



[Model.Field@4c4aa, Model.Field@10bb37b, Model.Field@13478c8, Model.Field@1e59730, Model.Field@28fb58]
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

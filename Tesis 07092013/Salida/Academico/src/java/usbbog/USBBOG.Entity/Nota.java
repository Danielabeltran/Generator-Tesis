package USBBOG.Entity;



[Model.Field@119e7a4b, Model.Field@3b6edaf6, Model.Field@6ae96af5, Model.Field@26d31a9, Model.Field@4ed74f7d]
email
Nota



      



public class Nota {
    
    
    private int id;
    private String nombres;
    private String usuario;
    private String clave;

    public Nota() {
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

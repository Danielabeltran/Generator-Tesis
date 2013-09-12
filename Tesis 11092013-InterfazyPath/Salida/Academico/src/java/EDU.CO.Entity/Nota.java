package USBBOG.Entity;



[Model.Field@1363ff, Model.Field@10a1b36, Model.Field@80937b, Model.Field@1529466, Model.Field@8cc6a8]
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

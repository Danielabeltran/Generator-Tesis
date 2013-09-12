package USBBOG.Entity;



[Model.Field@12c74b9, Model.Field@1a34544, Model.Field@18849c, Model.Field@1aa5221, Model.Field@f61f70]
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

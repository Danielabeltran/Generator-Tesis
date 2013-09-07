package USBBOG.Entity;



[Model.Field@68237947, Model.Field@70ef59ba, Model.Field@71ebfc42, Model.Field@3bfe8b7c, Model.Field@447798a9, Model.Field@7c7a25d]
clave
Curso



      



public class Curso {
    
    
    private int id;
    private String nombres;
    private String usuario;
    private String clave;

    public Curso() {
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

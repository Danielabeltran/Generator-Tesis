package USBBOG.Entity;



[Model.Field@5bdce3, Model.Field@102c065, Model.Field@1a531a9, Model.Field@5f8368, Model.Field@ac2837]
corte3
Profesor



      



public class Profesor {
    
    
    private int id;
    private String nombres;
    private String usuario;
    private String clave;

    public Profesor() {
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

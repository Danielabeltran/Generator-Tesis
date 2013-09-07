package USBBOG.Entity;



[Model.Field@19a3bffb, Model.Field@4d9104e3, Model.Field@6bd7fadd, Model.Field@3096fa7b, Model.Field@816ba29]
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

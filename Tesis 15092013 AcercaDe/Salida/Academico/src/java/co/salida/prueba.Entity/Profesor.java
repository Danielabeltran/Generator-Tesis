package USBBOG.Entity;



[Model.Field@dbfa4, Model.Field@a0c7cf, Model.Field@19e24e8, Model.Field@188fd33, Model.Field@a72115]
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

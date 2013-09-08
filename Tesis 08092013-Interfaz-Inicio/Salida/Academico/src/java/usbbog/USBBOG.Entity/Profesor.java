package USBBOG.Entity;



[Model.Field@57f993, Model.Field@1c2534f, Model.Field@eb8007, Model.Field@1228caa, Model.Field@140f8c3]
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

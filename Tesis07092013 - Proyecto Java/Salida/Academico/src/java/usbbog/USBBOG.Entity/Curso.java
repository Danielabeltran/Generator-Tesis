package USBBOG.Entity;



[Model.Field@1618248, Model.Field@b05409, Model.Field@5d529e, Model.Field@db19d3, Model.Field@7c7d85, Model.Field@114d739]
Population
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

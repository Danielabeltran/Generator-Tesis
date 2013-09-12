package USBBOG.Entity;



[Model.Field@146b111, Model.Field@130e37, Model.Field@10a5068, Model.Field@24f2f2, Model.Field@1c9edf0, Model.Field@246607]
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

package USBBOG.Entity;



[Model.Field@10306e, Model.Field@dba076, Model.Field@103aca6, Model.Field@3bcf04, Model.Field@9413d5, Model.Field@1a20c6d]
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

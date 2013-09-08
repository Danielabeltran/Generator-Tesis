package USBBOG.Entity;



[Model.Field@10e6c5e, Model.Field@1eca460, Model.Field@11bd50e, Model.Field@40bf04, Model.Field@bccad2]
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

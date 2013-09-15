/*
 * Clase de get y set´s para obtención de los
 * datos de la interfaz del generador
 */
package View;

/**
 *
 * @author .....
 */

public class InfoDatabase 
{
    public String ip;
    public String puerto;
    public String nombrebd;
    public String user;
    public String password;
    public String path;
    public String generarproyecto;

    
    public String getGenerarproyecto() {
        
        return generarproyecto;
    }

    public void setGenerarproyecto(String generarproyecto) {
        this.generarproyecto = generarproyecto;
        //System.out.println(this.generarproyecto);
    }

    public String getPath() {
       
        return path;
    }

    public void setPath(String path) {
        this.path = path;
        
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNombrebd() {
        
       
        return nombrebd;
    }

    public void setNombrebd(String nombrebd) {
        this.nombrebd = nombrebd;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
}

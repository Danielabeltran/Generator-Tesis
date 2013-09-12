/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author daniela.beltran
 */

public class InfoDatabase 
{
    public String ip;
    public int puerto;
    public String nombrebd;
    public String user;
    public String password;

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

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
}

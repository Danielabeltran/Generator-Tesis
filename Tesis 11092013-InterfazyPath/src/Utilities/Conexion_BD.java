package Utilities;

import View.InfoDatabase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion_BD 
{
    private String driver = "com.mysql.jdbc.Driver";
    private String url ;
    private String user ;
    private String ip;
    private int puerto;
    private String nombrebd;
    private String password;
    public  Connection connection;
    private ResultSet rs;
    private Statement statement;
    private String error;
    
    /**
     * Obtiene una conexión con el nombre del driver especificado
     * @return connection Conexión con la base de datos.
     */
    
    public Conexion_BD(InfoDatabase i)
    {
        this.user = i.getUser();
        this.password = i.getPassword();
        this.ip = i.getIp();
        this.puerto = i.getPuerto();
        this.nombrebd = i.getNombrebd();
        this.url = "jdbc:mysql://localhost:3306/"+this.nombrebd+"?characterEncoding=latin1";
    }
    public Connection makeConnection()
    { 
         try 
        {
            this.connection = DriverManager.getConnection(this.url, this.user, this.password);
        } 
        catch (SQLException sql) 
        {
            return null;
        }
        return this.connection;
    }


    /**
     * Cierra la conexión.
     * @return boolean Retorna true si la conexión fue cerrada con exito.
     */
    public boolean closeConnection() 
    {
        try 
        {
            connection.close();
        } catch (SQLException sql) 
        {
            return false;
        }
        return true;
    }
    
     /**
     * Utilizada para INSERT, UPDATE, o DELETE.
     * @param  sql
     * @return reg Número de registros afectados.
     */
    
    public int nonQuery(String sql) throws SQLException 
    {
        try 
        {
            this.statement = this.connection.createStatement();
            return statement.executeUpdate(sql);
        }
        catch (SQLException e) 
        { 
            error = "Error en update: " + e.getMessage();
        }
        return -1;
    }

    
   /**
     * Retorna el resultado de la consulta ejecutada.
     * @param  sql Consulta a realizar.
     * @return rst Resultado de la consulta
     */
    
    public ResultSet query(String sql) throws SQLException 
    {
        try 
        {
            this.statement = this.connection.createStatement();
            this.rs = statement.executeQuery(sql);
        }
        catch(SQLException e)
        {
            Logger.getLogger(Conexion_BD.class.getName()).log(Level.INFO, null, e);
        }
        
        return this.rs;
    }   
}
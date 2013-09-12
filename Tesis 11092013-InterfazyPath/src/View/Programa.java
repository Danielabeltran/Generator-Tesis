package View;


import Builder.ModeloBuilder;
import Generator.GeneratorCode;
import Generator.GeneratorEntities;
import Model.Model;
import Utilities.Conexion_BD;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Programa extends JFrame implements ActionListener 
{
    private JLabel Titulo;
    private JTextField cajonnombreBD;
    private JTextField cajonusuarioBD;
    private JPasswordField cajonpasswordBD;
    private JTextField cajongenerarproyecto;
    private JFileChooser chooser = new JFileChooser();
    private JLabel Nombre_BD;
    private JLabel Usuario_BD;
    private JLabel Contraseña_BD;
    private JLabel Generar_Proyecto;
    private JButton Generar;
    private JButton Seleccionar;
    private JButton Salir;
    
    
    
    private JFrame frame;
    public Programa(JFrame frame)
    {
    this.frame = frame;
    }
    
    public Programa() 
    {
        setLayout(null);
        
        Titulo =new JLabel(".. BIENVENIDO A EL GENERADOR DE APLICACIONES WEB ..");
        Titulo.setBounds(65,10,400,30);
        add(Titulo);
        
        Nombre_BD=new JLabel("Nombre Base Datos: ");
        Nombre_BD.setBounds(68,40,120,30);
        add(Nombre_BD);
        cajonnombreBD=new JTextField();
        cajonnombreBD.setBounds(220,40,150,20);
        add(cajonnombreBD);
        
        Usuario_BD=new JLabel("Usuario Base Datos: ");
        Usuario_BD.setBounds(68,70,120,30);
        add(Usuario_BD);
        cajonusuarioBD=new JTextField();
        cajonusuarioBD.setBounds(220,70,150,20);
        add(cajonusuarioBD);
        
        Contraseña_BD=new JLabel("Contraseña Base Datos: ");
        Contraseña_BD.setBounds(68,100,140,30);
        add(Contraseña_BD);
        cajonpasswordBD=new JPasswordField();
        cajonpasswordBD.setBounds(220,100,150,20);
        add(cajonpasswordBD);
        
        Generar_Proyecto=new JLabel("Ubicación a Generar: ");
        Generar_Proyecto.setBounds(68,130,180,30);
        add(Generar_Proyecto);
        cajongenerarproyecto=new JTextField();
        cajongenerarproyecto.setBounds(220,130,150,20);
        add(cajongenerarproyecto);
        
        Generar=new JButton("GENERAR");
        Generar.setBounds(120,180,100,30);
        add(Generar);
        Generar.addActionListener(this);
        
        Salir=new JButton("SALIR");
        Salir.setBounds(220,180,100,30);
        add(Salir);
        Salir.addActionListener(this);
        
        Seleccionar=new JButton("ABRIR");
        Seleccionar.setBounds(380,130,75,20);
        add(Seleccionar);
        Seleccionar.addActionListener(this);
    }
    
    
           
    
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource()==Salir) 
        {
            int eleccion = JOptionPane.showConfirmDialog(null, " ¿ Desea Salir ? ");
            if ( eleccion == 0) 
            {
                System.exit(0);
            } 
       }

        if (e.getSource()==Seleccionar) 
        {
            int sel = chooser.showOpenDialog(frame);
            if (sel == JFileChooser.APPROVE_OPTION)
            {
                File selectedFile = chooser.getSelectedFile();
                selectedFile.getAbsolutePath();
                cajongenerarproyecto.setText(String.valueOf(selectedFile));
            }
            else
            {
                return;
            }
        }
        if (e.getSource()==Generar) 
        {
            String nombreBD =cajonnombreBD.getText();
            String usuarioBD =cajonusuarioBD.getText();
            String passwordBD =cajonpasswordBD.getText();
            String generarproy =cajongenerarproyecto.getText();
            InfoDatabase i = new InfoDatabase();
            i.setUser(usuarioBD);
            i.setPassword(passwordBD);
            i.setNombrebd(nombreBD);
            

                
            
            
            
          //-------------------------------------------------------//  
            
             Model m;

         try 
         {
        
            m = ModeloBuilder.cargarModelo(i);
            GeneratorCode.generarCodigo(m);
            //GeneratorData.generarCodigo(m);
            GeneratorEntities.generarCodigo(m);
            //ModeloGeneratorBusiness.generarCodigo(m);
         }  catch (IOException ex) {
                Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
            }
         catch (ClassCastException ex){
         Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
         }
              
            
        }
    }
    
    public static void main(String[] ar) throws IOException, SQLException 
    {
        Programa formulario1=new Programa();
        formulario1.setBounds(0,0,500,300);
        formulario1.setVisible(true);
        
      
        
    }
}
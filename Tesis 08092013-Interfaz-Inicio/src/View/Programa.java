package View;


import Builder.ModeloBuilder;
import Generator.GeneratorCode;
import Generator.GeneratorEntities;
import Model.Model;
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
    private JTextField Cajon_Nombre_BD;
    private JTextField Cajon_Usuario_BD;
    private JPasswordField Cajon_Contraseña_BD;
    private JTextField Cajon_Generar_Proyecto;
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
        Cajon_Nombre_BD=new JTextField();
        Cajon_Nombre_BD.setBounds(220,40,150,20);
        add(Cajon_Nombre_BD);
        
        Usuario_BD=new JLabel("Usuario Base Datos: ");
        Usuario_BD.setBounds(68,70,120,30);
        add(Usuario_BD);
        Cajon_Usuario_BD=new JTextField();
        Cajon_Usuario_BD.setBounds(220,70,150,20);
        add(Cajon_Usuario_BD);
        
        Contraseña_BD=new JLabel("Contraseña Base Datos: ");
        Contraseña_BD.setBounds(68,100,140,30);
        add(Contraseña_BD);
        Cajon_Contraseña_BD=new JPasswordField();
        Cajon_Contraseña_BD.setBounds(220,100,150,20);
        add(Cajon_Contraseña_BD);
        
        Generar_Proyecto=new JLabel("Ubicación a Generar: ");
        Generar_Proyecto.setBounds(68,130,180,30);
        add(Generar_Proyecto);
        Cajon_Generar_Proyecto=new JTextField();
        Cajon_Generar_Proyecto.setBounds(220,130,150,20);
        add(Cajon_Generar_Proyecto);
        
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
                System.out.println(selectedFile.getAbsolutePath());
            }
            else
            {
                return;
            }
        }
        if (e.getSource()==Generar) 
        {
            String Nombre_BD =Cajon_Nombre_BD.getText();
            System.out.println(Nombre_BD);   
            String Usuario_BD = Cajon_Usuario_BD.getText();
            System.out.println(Usuario_BD); 
            String Contraseña_BD = Cajon_Contraseña_BD.getText();
            System.out.println(Contraseña_BD); 
            
            if(Cajon_Nombre_BD.getText().trim().length()==0 || Cajon_Usuario_BD.getText().trim().length()==0 || Cajon_Contraseña_BD.getText().trim().length()==0 || Cajon_Generar_Proyecto.getText().trim().length()==0)
            {
                 JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
            }
            else
            {
            
             Model m;

         try 
         {
        
            m = ModeloBuilder.cargarModelo();
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
    }
    
    public static void main(String[] ar) throws IOException, SQLException 
    {
        Programa formulario1=new Programa();
        formulario1.setBounds(0,0,500,300);
        formulario1.setVisible(true);
        
      
        
    }
}
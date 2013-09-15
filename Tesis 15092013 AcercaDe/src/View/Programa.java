/*
 * Clase interfaz del generador
 * 
 */

package View;

/**
 *
 * @author .....
 */

import Builder.ModeloBuilder;
import Generator.GeneratorCode;
import Generator.GeneratorEntities;
import Model.Model;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Programa extends JFrame implements ActionListener 
{
    
    JMenuBar menubarra=new JMenuBar();
    JMenu menuarchivo=new JMenu("Archivo");
    JMenuItem menusalir=new JMenuItem("Salir"); 
    JMenu menuedicion=new JMenu("Edicion");
    JMenuItem menucopiar=new JMenuItem("Copiar");
    JMenuItem menupegar=new JMenuItem("Pegar");
    JMenu menuayuda=new JMenu("Ayuda");
    JMenuItem menuacercade =new JMenuItem("Acerca de");
    
    private JLabel titulo;
    private JTextField cajonnombreBD;
    private JTextField cajonusuarioBD;
    private JPasswordField cajonpasswordBD;
    private JTextField cajongenerarproyecto;
    private JTextField cajonip;
    private JTextField cajonpuerto;
    private JTextField cajonpath;
        
    private JFileChooser chooser = new JFileChooser();
    private JLabel nombreBD;
    private JLabel usuarioBD;
    private JLabel passwordBD;
    private JLabel generarProyecto;
    private JLabel labelip;
    private JLabel labelpuerto;
    private JLabel labelpath;
    
    JProgressBar current;
    private JButton generar;
    private JButton seleccionar;
    private JButton salir;
    
    private JFrame frame;
   
    public Programa(JFrame frame)
    {
        this.frame = frame;
    }
    
    public Programa() 
    {
        /*int num = 0;
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pane = new JPanel();
        pane.setLayout(new FlowLayout());
        current = new JProgressBar(0, 2000);
        current.setValue(0);
        current.setStringPainted(true);
        pane.add(current);
        setContentPane(pane);
        
        
        while (num < 2000) {
            current.setValue(num);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) { }
            num += 95;
        }*/
    
        
        
        
        
        menusalir.setMnemonic( KeyEvent.VK_A );
        menusalir.addActionListener(new ActionListener() 
        {
            public void actionPerformed( ActionEvent evento )
            {
                int pregunta=JOptionPane.showConfirmDialog(null,"Realmente desea salir?","EXIT",JOptionPane.YES_NO_OPTION);
		if(pregunta==0)
                {
                    System.exit (0);
                }
		else
                {
                    return;
                }
              
           }
         } 
      );
        menuacercade.addActionListener(new ActionListener() 
        {
            public void actionPerformed( ActionEvent evento )
            {
                AcercaDe panel=new AcercaDe();
     		JFrame.setDefaultLookAndFeelDecorated(true);  
    		
    		panel.setTitle("Acerca De...");
           }
         } 
      );
    
        menuarchivo.add(menusalir);
        menusalir.addActionListener(this);
        menuarchivo.addSeparator();
        menuarchivo.add(menusalir);
        menuedicion.add(menucopiar);
        menuedicion.add(menupegar);
        menuayuda.add(menuacercade);
        menubarra.add(menuarchivo);
        menubarra.add(menuedicion);
        menubarra.add(menuayuda);
        setJMenuBar(menubarra);

        setTitle("GENERADOR DE APLICACIONES WEB"); 
            
        setVisible(true); 
        setLayout(null);

        titulo =new JLabel(".. BIENVENIDO A EL GENERADOR DE APLICACIONES WEB ..");
        titulo.setBounds(130,10,400,20);
        add(titulo);
        
        nombreBD=new JLabel("Digite el Nombre de la Base Datos: ");
        nombreBD.setBounds(65,70,200,30);
        add(nombreBD);
        cajonnombreBD=new JTextField();
        cajonnombreBD.setBounds(325,70,150,20);
        add(cajonnombreBD);
        
        labelip=new JLabel("Digite la IP de conexión a la Base de Datos: ");
        labelip.setBounds(68,120,250,30);
        add(labelip);
        cajonip=new JTextField();
        cajonip.setBounds(325,120,150,20);
        add(cajonip);
        
        labelpuerto=new JLabel("Digite el Puerto de la Base de Datos: ");
        labelpuerto.setBounds(68,170,290,30);
        add(labelpuerto);
        cajonpuerto=new JTextField();
        cajonpuerto.setBounds(325,170,150,20);
        add(cajonpuerto);
        
        labelpath=new JLabel("Digite el Path (Nombre Carpetas Proyecto): ");
        labelpath.setBounds(68,230,290,30);
        add(labelpath);
        cajonpath=new JTextField();
        cajonpath.setBounds(325,230,150,20);
        add(cajonpath);
        
        usuarioBD=new JLabel("Digite el Usuario de la Base Datos: ");
        usuarioBD.setBounds(68,280,290,30);
        add(usuarioBD);
        cajonusuarioBD=new JTextField();
        cajonusuarioBD.setBounds(325,280,150,20);
        add(cajonusuarioBD);
        
        passwordBD=new JLabel("Digite la Contraseña de la Base Datos: ");
        passwordBD.setBounds(68,330,290,30);
        add(passwordBD);
        cajonpasswordBD=new JPasswordField();
        cajonpasswordBD.setBounds(325,330,150,20);
        add(cajonpasswordBD);
        
        generarProyecto=new JLabel("Digite la Ubicación en el disco a Generar: ");
        generarProyecto.setBounds(68,380,350,30);
        add(generarProyecto);
        cajongenerarproyecto=new JTextField();
        cajongenerarproyecto.setBounds(325,380,150,20);
        add(cajongenerarproyecto);
        
        generar=new JButton("GENERAR");
        generar.setBounds(135,430,150,30);
        add(generar);
        generar.addActionListener(this);
        
        salir=new JButton("SALIR");
        salir.setBounds(295,430,150,30);
        add(salir);
        salir.addActionListener(this);
        
        seleccionar=new JButton("ABRIR");
        seleccionar.setBounds(490,380,75,20);
        add(seleccionar);
        seleccionar.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource()==salir) 
        {
            int eleccion = JOptionPane.showConfirmDialog(null, " ¿ Desea Salir ? ");
            if ( eleccion == 0) 
            {
                System.exit(0);
            } 
       }

        if (e.getSource()==seleccionar) 
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
        if (e.getSource()==generar) 
        {
            String nombreBD =cajonnombreBD.getText();
            String usuarioBD =cajonusuarioBD.getText();
            String passwordBD =cajonpasswordBD.getText();
            String generarproy =cajongenerarproyecto.getText();
            String ip = cajonip.getText();
            String puerto = cajonpuerto.getText();
            String path = cajonpath.getText();
            InfoDatabase i = new InfoDatabase();
            i.setUser(usuarioBD);
            i.setPassword(passwordBD);
            i.setNombrebd(nombreBD);
            i.setIp(ip);
            i.setPuerto(puerto);
            i.setPath(path);
            i.setGenerarproyecto(generarproy);
            
            if(cajonnombreBD.getText().trim().length()==0 || cajonusuarioBD.getText().trim().length()==0 || cajonpasswordBD.getText().trim().length()==0 || cajongenerarproyecto.getText().trim().length()==0 || cajonip.getText().trim().length()==0 || cajonpuerto.getText().trim().length()==0 || cajonpath.getText().trim().length()==0)
            {
                 JOptionPane.showMessageDialog(this, "DEBE LLENAR TODOS LOS CAMPOS");
            }
            else
            {
                Model m;
                try 
                {
                    m = ModeloBuilder.cargarModelo(i);
                    GeneratorCode.generarCodigo(m,i);
                    //GeneratorData.generarCodigo(m);
                    GeneratorEntities.generarCodigo(m,i);
                    //ModeloGeneratorBusiness.generarCodigo(m);
                }  
                catch (IOException ex) 
                {
                        Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
                } 
                catch (SQLException ex) 
                {
                        Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
                }
                catch (ClassCastException ex)
                {
                        Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }  
        }
    }
    
    public static void main(String[] ar) throws IOException, SQLException 
    {
        Programa formulario1=new Programa();
        formulario1.setBounds(450,60,600,600);
        formulario1.setVisible(true);
        formulario1.setIconImage (new ImageIcon("C:/Users/daniela.beltran/Documents/Tesis 09092013 -2 - copia/src/Images/icon.png").getImage());
        formulario1.setResizable(false);
	
	
    }
}
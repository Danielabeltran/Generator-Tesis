/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.*;
import javax.swing.*;

public class AcercaDe extends JFrame {
	private ImageIcon acercade;
	private JTextArea info;
	
	public AcercaDe(){
		setLayout( new GridLayout( 1,2 ) );
		
		acercade = new ImageIcon( "C:/Users/daniela.beltran/Documents/Tesis 09092013 -2 - copia/src/Images/generatorimage.jpg ");
		javax.swing.JLabel imageLabel = new javax.swing.JLabel();
		imageLabel.setIcon(acercade); // NOI18N
		imageLabel.setName("imageLabel");
		
		info = new JTextArea("\nUNIVERSIDAD DE SAN BUENAVENTURA\n" +
				"FACULTAD DE INGENIERÍA\n\n"+
                                "PROYECTO DE GRADO\n\n"+
                                "Ingeniería de Sistemas"+
				"Aplicacion diseñada \npara generar aplicativos web \nde una manera más rápida" +
				"y \nminimizando el trabajo \nde un desarrollador. \n\n"+
				"TM. Yesica Daniela Beltrán - \n         Jeison Vargas Martinez");
		info.setEditable(false);
		info.setFont(new Font("Papyrus",Font.BOLD,12));
		
		add(imageLabel);
		add(info);       
		
		setResizable(false);
		setSize(730, 350 );
		setVisible(true);
                
               
	}
	


}


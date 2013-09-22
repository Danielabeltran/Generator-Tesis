package co.edu.usbbog.generator;

import co.edu.usbbog.model.Entity;
import co.edu.usbbog.model.Model;
import co.edu.usbbog.utilities.Functions;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
        
        /**
        * @author Clase Generador de Business
        */

public class GeneratorBusiness {

    public static void generarCodigo(Model model) throws IOException, SQLException {
        /**
        * Inicializacion del motor Velocity
        */
        VelocityContext contexto = new VelocityContext();
        Velocity.init();
        
        /**
        * Invocación de funciones de la clase Functions en el Package: co.edu.usbbog.utilities 
        */
        Functions g = new Functions();
        File f = new File(g.myFolder() + model.getName());
        f.mkdir();
        
        /**
        * Declaracion de variables para Velocity
        */
        contexto.put("m", model);
        contexto.put("g", g);
        
        /**
        * Declaracion de variables de tipo Template
        */
        Template ModeloGeneratorBusiness = null;
        
        try {
            ModeloGeneratorBusiness = Velocity.getTemplate("TemplatesClass/TBusiness.vsl");
        } catch (Exception e) {
            System.out.println("Error creating template");
        }

        if (ModeloGeneratorBusiness != null) {
            try {

                for (Entity e : model.getEntities()) {
                    contexto.put("entidad", e);
                    BufferedWriter escritor = new BufferedWriter(new FileWriter(g.myFolder() + model.getName() + "/src/java/business/" + e.getName() + "BO.java"));
                    ModeloGeneratorBusiness.merge(contexto, escritor);
                    escritor.flush();
                    escritor.close();
                }
                


            } catch (IOException ex) {
                System.out.println("Plantillas Business no creadas");
            }
        }

    }
}
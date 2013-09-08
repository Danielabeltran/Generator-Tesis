package Generator;

import Model.Entity;
import Model.Field;
import Model.Model;
import Model.Relation;
import Utilities.Functions;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

public class GeneratorEntities 
{
      public static void generarCodigo(Model m) throws IOException, SQLException 
      {
           
        VelocityContext contexto = new VelocityContext();
        Velocity.init();//inicializa el motor velocity    
        
        String myfolder = "Salida/";
        contexto.put("m", m);
        
        
        String nameDB = m.getName();
        List<Entity> entities = m.getEntities();

        Functions g = new Functions();
        File f = new File(myfolder + nameDB);
        String Path = g.path();
        String PathMay = g.pathMay();
        f.mkdir();
        
        Template ModeloGeneratorEntity = null;
         try {
           ModeloGeneratorEntity=Velocity.getTemplate("TemplatesClass/TEntities.vsl");
         }
        catch (Exception e){
            System.out.println("Error creating template");
        }
         
        if(ModeloGeneratorEntity != null){
            try {
                 for(Entity e:entities){
                String ent = e.getName().substring(0, 1).toUpperCase() + e.getName().substring(1);
                contexto.put("entity", ent);
                contexto.put("e", e);
               
                
                BufferedWriter escritor = new BufferedWriter(new FileWriter(myfolder + nameDB + "/src/java/" + Path + "/" + PathMay + ".Entity/" + ent +  ".java"));
                ModeloGeneratorEntity.merge(contexto, escritor);
                escritor.flush();
                escritor.close();
                ArrayList<Field> nameFields = e.getFields();
                
                for(Field fi:nameFields){
                String fie = fi.getNameFields();
                contexto.put("fi", fi) ;
              
                System.out.println(fie + ent);
            }
                 }
            }
            catch (IOException ex){
                    System.out.println("Plantillas entity no creadas");
                }
        }
        
      } 
      
                   
                    
}
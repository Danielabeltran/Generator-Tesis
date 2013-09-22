package co.edu.usbbog.view;


import co.edu.usbbog.generator.GeneratorBusiness;
import co.edu.usbbog.tests.builder.ModeloBuilder;
import co.edu.usbbog.model.Model;
import co.edu.usbbog.generator.GeneratorCode;
import co.edu.usbbog.generator.GeneratorControllers;
import co.edu.usbbog.generator.GeneratorData;
import co.edu.usbbog.generator.GeneratorEntities;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Programa 
{

     public static void main(String[] args) throws IOException, SQLException 
     {
        
        Model m;

         try 
         {
        
            m = ModeloBuilder.cargarModelo();
            GeneratorCode.generarCodigo(m);
            GeneratorData.generarCodigo(m);
            GeneratorEntities.generarCodigo(m);
            GeneratorBusiness.generarCodigo(m);
            GeneratorControllers.generarCodigo(m);
         } 
         catch (ClassCastException ex){
         Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
         }
      }
}
package View;


import Builder.ModeloBuilder;
import Model.Model;
import Generator.GeneratorCode;
//import Generator.ModeloGeneratorBusiness;
//import Generator.GeneratorData;
//import ModeloGenerator.Entidad;
import Generator.GeneratorEntities;
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
            //GeneratorData.generarCodigo(m);
            GeneratorEntities.generarCodigo(m);
            //ModeloGeneratorBusiness.generarCodigo(m);
         } 
         catch (ClassCastException ex){
         Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
         }
         
        
        
     }
}
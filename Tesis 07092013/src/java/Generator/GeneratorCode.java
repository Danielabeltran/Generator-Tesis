
package Generator;


import Model.Model;
import Utilities.Functions;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

public class GeneratorCode 
{ 
    //public static String path = "usbbog";
      public static void generarCodigo(Model m) throws IOException, SQLException 
      {
         
                    VelocityContext contexto = new VelocityContext();
                    Velocity.init();//inicializa el motor velocity 
        

                    String NameDB = m.getName();

                    String myfolder = "Salida/";
                    
                    
                   
                    Functions g = new Functions();
                    File a = new File(myfolder + NameDB);
                    String Path = g.path();
                    String PathMay = g.pathMay();
                    
                    // String path2 = Path.toUpperCase();
                    contexto.put("database", m);

                    a.mkdir();
                   
        
                    for (int i=1; i<=2; i++)
                    {

                        g.ldir ( a + "/nbproject");    
                        g.ldir ( a + "/nbproject/private");    
                        g.ldir ( a + "/src");
                        g.ldir ( a + "/src/conf");
                        g.ldir ( a + "/src/java/");
                        g.ldir ( a + "/src/java/" + Path);
                        g.ldir ( a + "/src/java/" + Path + "/" + PathMay + ".Data");
                        g.ldir ( a + "/src/java/" + Path + "/" + PathMay + ".Entity");
                        g.ldir ( a + "/src/java/" + Path + "/" + PathMay + ".Business");
                        g.ldir ( a + "/src/java/" + Path + "/" + PathMay + ".Presentation");
                        g.ldir ( a + "/web");
                        g.ldir ( a + "/web/WEB-INF");
                    }
        
                        Template build = null;
                        Template index = null;
                        Template ant_deploy = null;
                        Template build_impl = null;
                        Template genfiles_properties = null;
                        Template project = null;
                        Template project_properties = null;
                        Template private_properties = null;
                        Template MANIFEST = null;
                        Template ConexionDB = null;
                        

                    try 
                    {
                        build = Velocity.getTemplate("Templates/Tbuild.vsl");  
                        build = Velocity.getTemplate("Templates/Tbuild.vsl");
                        index = Velocity.getTemplate("Templates/Tindex.vsl");
                        ant_deploy = Velocity.getTemplate("Templates/Tant_deploy.vsl"); 
                        build_impl = Velocity.getTemplate("Templates/Tbuild_impl.vsl");
                        genfiles_properties = Velocity.getTemplate("Templates/Tgenfiles_properties.vsl");
                        project = Velocity.getTemplate("Templates/Tproject.vsl");
                        project_properties = Velocity.getTemplate("Templates/Tproject_properties.vsl");
                        private_properties = Velocity.getTemplate("Templates/Tprivate_properties.vsl");
                        MANIFEST = Velocity.getTemplate("Templates/TMANIFEST.vsl");
                        ConexionDB = Velocity.getTemplate("Templates/TConection.vsl");
                    }
                    catch (Exception e) 
                    {
                    System.out.println("Error creating template");
                    }
        
                   
                   if (build != null)
                    {
                            try 
                            {
                                BufferedWriter escritor = new BufferedWriter(new FileWriter(myfolder + NameDB + "/build.xml"));
                                build.merge(contexto, escritor);
                                    escritor.flush();
                                    escritor.close(); 
                            } 
                            catch (IOException ex) 
                            {
                                System.out.println("Plantilla build.xml no creada");
                            }
                    }
                    if (index != null)
                    {
                            try 
                            {
                                BufferedWriter escritor = new BufferedWriter(new FileWriter(myfolder + NameDB + "/web/index.jsp"));

                                index.merge(contexto, escritor);
                                    escritor.flush();
                                    escritor.close();
                            } 
                            catch (IOException ex) 
                            {
                                System.out.println("Plantilla index.jsp no creada");
                            }
                    }
                    if (ant_deploy!= null)
                    {
                            try 
                            {
                                BufferedWriter escritor = new BufferedWriter(new FileWriter(myfolder + NameDB + "/nbproject/ant-deploy.xml"));

                                ant_deploy.merge(contexto, escritor);
                                    escritor.flush();
                                    escritor.close(); 
                            } 
                            catch (IOException ex) 
                            {
                                System.out.println("Plantilla ant-deploy.xml no creada");
                            }
                    }
                    if (build_impl!= null)
                    {
                            try 
                            {
                                BufferedWriter escritor = new BufferedWriter(new FileWriter(myfolder + NameDB + "/nbproject/build-impl.xml"));

                                build_impl.merge(contexto, escritor);
                                    escritor.flush();
                                    escritor.close();
                            } 
                            catch (IOException ex) 
                            {
                                System.out.println("Plantilla build-impl.xml no creada");
                            }
                    }
                    if (genfiles_properties!= null)
                    {
                            try 
                            {
                                BufferedWriter escritor = new BufferedWriter(new FileWriter(myfolder + NameDB + "/nbproject/genfiles.properties"));

                                genfiles_properties.merge(contexto, escritor);
                                    escritor.flush();
                                    escritor.close(); 
                            } 
                            catch (IOException ex) 
                            {
                                System.out.println("Plantilla genfiles.properties no creada");
                            }
                    }
                    if (project!= null)
                    {
                            try 
                            {
                                BufferedWriter escritor = new BufferedWriter(new FileWriter(myfolder + NameDB + "/nbproject/project.xml"));

                                project.merge(contexto, escritor);
                                    escritor.flush();
                                    escritor.close();
                            } 
                            catch (IOException ex) 
                            {
                                System.out.println("Plantilla project.xml no creada");
                            }
                    }
                    if (project_properties!= null)
                    {
                            try 
                            {
                                BufferedWriter escritor = new BufferedWriter(new FileWriter(myfolder + NameDB + "/nbproject/project.properties"));

                                project_properties.merge(contexto, escritor);
                                    escritor.flush();
                                    escritor.close();  
                            } 
                            catch (IOException ex) 
                            {
                                System.out.println("Plantilla project.properties no creada");
                            }
                    }
                    if (private_properties!= null)
                    {
                            try 
                            {
                                BufferedWriter escritor = new BufferedWriter(new FileWriter(myfolder + NameDB + "/nbproject/private/private.properties"));

                                private_properties.merge(contexto, escritor);
                                    escritor.flush();
                                    escritor.close(); 
                            } 
                            catch (IOException ex) 
                            {
                                System.out.println("Plantilla private.properties no creada");
                            }
                    }
                    if (MANIFEST!= null)
                    {
                            try 
                            {
                                BufferedWriter escritor = new BufferedWriter(new FileWriter(myfolder + NameDB + "/src/conf/MANIFEST.MF"));

                                MANIFEST.merge(contexto, escritor);
                                    escritor.flush();
                                    escritor.close(); 
                            } 
                            catch (IOException ex) 
                            {
                                System.out.println("Plantilla MANIFEST.MF no creada");
                            }
                    }
                    if (ConexionDB != null)
                    {
                            try 
                            {
                                BufferedWriter escritor = new BufferedWriter(new FileWriter(myfolder + NameDB + "/src/java/" + Path + "/" + PathMay + ".Data/"  +  "ConexionDB.java"));
                                ConexionDB.merge(contexto, escritor);
                                    escritor.flush();
                                    escritor.close();
                            } 
                            catch (IOException ex) 
                            {
                                System.out.println("Plantilla ConexionDB.xml no creada");
                            }
                    }
                    
                   //copyFolder(f,destinof);
                    
         
    }
      public static void copyFolder(File scr, File dest)
    	throws IOException
         {
             System.out.println("directorio copiado");
         }
}


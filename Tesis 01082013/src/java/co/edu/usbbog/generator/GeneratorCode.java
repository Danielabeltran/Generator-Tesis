package co.edu.usbbog.generator;


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

public class GeneratorCode {

    public static void generarCodigo(Model model) throws IOException, SQLException {

        VelocityContext contexto = new VelocityContext();
        Velocity.init();//inicializa el motor velocity 

        Functions g = new Functions();
        File a = new File(g.myFolder() + model.getName());
        String Path = g.path();
        String PathMay = g.pathMay();
        
        contexto.put("m", model);
        contexto.put("g", g);
        a.mkdir();


        for (int i = 1; i <= 2; i++) {

            g.ldir(a + "/nbproject");
            g.ldir(a + "/nbproject/private");
            g.ldir(a + "/src");
            g.ldir(a + "/src/conf");
            g.ldir(a + "/src/java");
            g.ldir(a + "/src/java/data");
            g.ldir(a + "/src/java/entity");
            g.ldir(a + "/src/java/business");
            g.ldir(a + "/src/java/controllers");
            g.ldir(a + "/web");
            g.ldir(a + "/web/WEB-INF");
        }
       /* for (int i = 1; i <= 2; i++) {

            g.ldir(a + "/nbproject");
            g.ldir(a + "/nbproject/private");
            g.ldir(a + "/src");
            g.ldir(a + "/src/conf");
            g.ldir(a + "/src/java/");
            g.ldir(a + "/src/java/" + PathMay);
            g.ldir(a + "/src/java/" + PathMay + ".data");
            g.ldir(a + "/src/java/" + PathMay + ".entity");
            g.ldir(a + "/src/java/" + PathMay + ".business");
            g.ldir(a + "/src/java/" + PathMay + ".presentation");
            g.ldir(a + "/web");
            g.ldir(a + "/web/WEB-INF");
        }*/

        Template build = null;
        Template index = null;
        Template ant_deploy = null;
        Template build_impl = null;
        Template genfiles_properties = null;
        Template project = null;
        Template project_properties = null;
        Template private_properties = null;
        Template MANIFEST = null;
        Template beans = null;
        Template ConexionDB = null;


        try {
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
            beans = Velocity.getTemplate("Templates/Tbeans.vsl");
            ConexionDB = Velocity.getTemplate("Templates/TConection.vsl");
        } catch (Exception e) {
            System.out.println("Error creating template");
        }


        if (build != null) {
            try {
                BufferedWriter escritor = new BufferedWriter(new FileWriter(g.myFolder() + model.getName() + "/build.xml"));
                build.merge(contexto, escritor);
                escritor.flush();
                escritor.close();
            } catch (IOException ex) {
                System.out.println("Plantilla build.xml no creada");
            }
        }
        if (index != null) {
            try {
                BufferedWriter escritor = new BufferedWriter(new FileWriter(g.myFolder() + model.getName() + "/web/index.jsp"));

                index.merge(contexto, escritor);
                escritor.flush();
                escritor.close();
            } catch (IOException ex) {
                System.out.println("Plantilla index.jsp no creada");
            }
        }
        if (ant_deploy != null) {
            try {
                BufferedWriter escritor = new BufferedWriter(new FileWriter(g.myFolder() + model.getName() + "/nbproject/ant-deploy.xml"));

                ant_deploy.merge(contexto, escritor);
                escritor.flush();
                escritor.close();
            } catch (IOException ex) {
                System.out.println("Plantilla ant-deploy.xml no creada");
            }
        }
        if (build_impl != null) {
            try {
                BufferedWriter escritor = new BufferedWriter(new FileWriter(g.myFolder() + model.getName() + "/nbproject/build-impl.xml"));

                build_impl.merge(contexto, escritor);
                escritor.flush();
                escritor.close();
            } catch (IOException ex) {
                System.out.println("Plantilla build-impl.xml no creada");
            }
        }
        if (genfiles_properties != null) {
            try {
                BufferedWriter escritor = new BufferedWriter(new FileWriter(g.myFolder() + model.getName() + "/nbproject/genfiles.properties"));

                genfiles_properties.merge(contexto, escritor);
                escritor.flush();
                escritor.close();
            } catch (IOException ex) {
                System.out.println("Plantilla genfiles.properties no creada");
            }
        }
        if (project != null) {
            try {
                BufferedWriter escritor = new BufferedWriter(new FileWriter(g.myFolder() + model.getName() + "/nbproject/project.xml"));

                project.merge(contexto, escritor);
                escritor.flush();
                escritor.close();
            } catch (IOException ex) {
                System.out.println("Plantilla project.xml no creada");
            }
        }
        if (project_properties != null) {
            try {
                BufferedWriter escritor = new BufferedWriter(new FileWriter(g.myFolder() + model.getName() + "/nbproject/project.properties"));

                project_properties.merge(contexto, escritor);
                escritor.flush();
                escritor.close();
            } catch (IOException ex) {
                System.out.println("Plantilla project.properties no creada");
            }
        }
        if (private_properties != null) {
            try {
                BufferedWriter escritor = new BufferedWriter(new FileWriter(g.myFolder() + model.getName() + "/nbproject/private/private.properties"));

                private_properties.merge(contexto, escritor);
                escritor.flush();
                escritor.close();
            } catch (IOException ex) {
                System.out.println("Plantilla private.properties no creada");
            }
        }
        if (MANIFEST != null) {
            try {
                BufferedWriter escritor = new BufferedWriter(new FileWriter(g.myFolder() + model.getName() + "/src/conf/MANIFEST.MF"));

                MANIFEST.merge(contexto, escritor);
                escritor.flush();
                escritor.close();
            } catch (IOException ex) {
                System.out.println("Plantilla MANIFEST.MF no creada");
            }
        }
        if (beans != null) {
            try {
                BufferedWriter escritor = new BufferedWriter(new FileWriter(g.myFolder() + model.getName() + "/web/WEB-INF/beans.xml"));

                beans.merge(contexto, escritor);
                escritor.flush();
                escritor.close();
            } catch (IOException ex) {
                System.out.println("Plantilla beans.xml no creada");
            }
        }
        if (ConexionDB != null) {
            try {
                BufferedWriter escritor = new BufferedWriter(new FileWriter(g.myFolder() + model.getName() + "/src/java/data/ConexionDB.java"));
                ConexionDB.merge(contexto, escritor);
                escritor.flush();
                escritor.close();
            } catch (IOException ex) {
                System.out.println("Plantilla ConexionDB.xml no creada");
            }
        }

        //copyFolder(f,destinof);


    }

    public static void copyFolder(File scr, File dest)
            throws IOException {
        System.out.println("directorio copiado");
    }
}

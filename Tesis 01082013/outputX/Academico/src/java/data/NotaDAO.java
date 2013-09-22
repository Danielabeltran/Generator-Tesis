 
package data;

import entity.Nota;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
* @author Clase generada por Generator v1.0
*/

public class NotaDAO{
    
     /**
     * Obtiene la lista de Nota
     * @return lista de Nota
     */

public void create(Nota n) {
        
        /**
        * Crea la conexion a la base de datos
        */
        ConexionDB database = new ConexionDB();
        database.makeConnection();

        try{
        /**
        * Genera la inserciÃ³n en la tabla
        */
        String format = "insert into Nota( id_Estudiante,  id_Curso,  corte1,  corte2,  corte3, ) values( ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s' )";
        String sql = String.format(format, n.getId_estudiante() , n.getId_curso() , n.getCorte1() , n.getCorte2() , n.getCorte3() );
        
        /**
        * Guarda los datos en la base de datos Academico
        */  
        database.nonQuery(sql);
            
        }catch(Exception ex){
            
        }
    }


    public List<Nota> getAll(){

        /**
        * Crea la conexion a la base de datos
        */
        ConexionDB database = new ConexionDB();
        database.makeConnection();

        /**
        * Crea una lista de Nota
        */
        List<Nota> list = new ArrayList<Nota>();
        
        try{
        /**
        * Crea una lista de Academico
        */
        ResultSet query = database.query("select * from Nota");
        
        /**
        * Se recorre la consulta
        */
        while (query.next()){

        /**
        * Se obtiene los datos de Nota
        */
        int id_Estudiante = query.getInt("id_Estudiante");
        int id_Curso = query.getInt("id_Curso");
        double corte1 = query.getDouble("corte1");
        double corte2 = query.getDouble("corte2");
        double corte3 = query.getDouble("corte3");
                
        /**
        * Crea una entidad Nota
        */
        Nota n = new Nota();
        n.setId_estudiante(id_Estudiante);
        n.setId_curso(id_Curso);
        n.setCorte1(corte1);
        n.setCorte2(corte2);
        n.setCorte3(corte3);
                /**
        * Agrega la entidad a la lista
        */
        list.add(n);
        }
        }catch(Exception ex){
        }
        return list;
    }




                        


                        


  
     


  

public List<Nota> NotadeEstudiante(int id_Estudiante ){
        
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public List<Nota> NotadeCurso(int id_Curso ){
        
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}


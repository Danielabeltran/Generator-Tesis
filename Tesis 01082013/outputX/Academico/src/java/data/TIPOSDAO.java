 
package data;

import entity.TIPOS;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Date;

/**
* @author Clase generada por Generator v1.0
*/

public class TIPOSDAO{
    
     /**
     * Obtiene la lista de TIPOS
     * @return lista de TIPOS
     */

public void create(TIPOS t) {
        
        /**
        * Crea la conexion a la base de datos
        */
        ConexionDB database = new ConexionDB();
        database.makeConnection();

        try{
        /**
        * Genera la inserciÃ³n en la tabla
        */
        String format = "insert into TIPOS( vvarchar,  vdecimal,  vdatetime,  vblob,  vBINARY,  VLONGBLOB,  VMEDIUMBLOB,  TINYBLOB,  VBARBINARY,  VDATE,  VTIME,  VTIMESTAMP,  VYEAR,  VGEOMETRY,  VGEOMETRYCOLLECTION,  VLINESTRING,  VMULTILINESTRING,  VMULTIPOINT,  VMULTIPOLYGON,  VPOINT,  VPOLIGON,  VBIGINT,  VDOUBLE,  VFLOAT,  VINT,  VMEDIUMNT,  VSMALLINT,  VTINYINT,  VCHAR,  VLONGTEXT,  VMEDIUMTEXT,  VTEXT,  VTINYTEXT,  VBIT,  VENUM,  notacol,  notacol1, ) values( ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s'  ,'%s' )";
        String sql = String.format(format, t.getVvarchar() , t.getVdecimal() , t.getVdatetime() , t.getVblob() , t.getVbinary() , t.getVlongblob() , t.getVmediumblob() , t.getTinyblob() , t.getVbarbinary() , t.getVdate() , t.getVtime() , t.getVtimestamp() , t.getVyear() , t.getVgeometry() , t.getVgeometrycollection() , t.getVlinestring() , t.getVmultilinestring() , t.getVmultipoint() , t.getVmultipolygon() , t.getVpoint() , t.getVpoligon() , t.getVbigint() , t.getVdouble() , t.getVfloat() , t.getVint() , t.getVmediumnt() , t.getVsmallint() , t.getVtinyint() , t.getVchar() , t.getVlongtext() , t.getVmediumtext() , t.getVtext() , t.getVtinytext() , t.getVbit() , t.getVenum() , t.getNotacol() , t.getNotacol1() );
        
        /**
        * Guarda los datos en la base de datos Academico
        */  
        database.nonQuery(sql);
            
        }catch(Exception ex){
            
        }
    }


    public List<TIPOS> getAll(){

        /**
        * Crea la conexion a la base de datos
        */
        ConexionDB database = new ConexionDB();
        database.makeConnection();

        /**
        * Crea una lista de TIPOS
        */
        List<TIPOS> list = new ArrayList<TIPOS>();
        
        try{
        /**
        * Crea una lista de Academico
        */
        ResultSet query = database.query("select * from TIPOS");
        
        /**
        * Se recorre la consulta
        */
        while (query.next()){

        /**
        * Se obtiene los datos de TIPOS
        */
        String vvarchar = query.getString("vvarchar");
        double vdecimal = query.getDouble("vdecimal");
        double vdatetime = query.getDouble("vdatetime");
        String vblob = query.getString("vblob");
        String vBINARY = query.getString("vBINARY");
        String VLONGBLOB = query.getString("VLONGBLOB");
        String VMEDIUMBLOB = query.getString("VMEDIUMBLOB");
        String TINYBLOB = query.getString("TINYBLOB");
        String VBARBINARY = query.getString("VBARBINARY");
        Date VDATE = query.getDate("VDATE");
        Time VTIME = query.getTime("VTIME");
        Timestamp VTIMESTAMP = query.getTimestamp("VTIMESTAMP");
        Date VYEAR = query.getDate("VYEAR");
        int VGEOMETRY = query.getInt("VGEOMETRY");
        int VGEOMETRYCOLLECTION = query.getInt("VGEOMETRYCOLLECTION");
        String VLINESTRING = query.getString("VLINESTRING");
        String VMULTILINESTRING = query.getString("VMULTILINESTRING");
        int VMULTIPOINT = query.getInt("VMULTIPOINT");
        int VMULTIPOLYGON = query.getInt("VMULTIPOLYGON");
        int VPOINT = query.getInt("VPOINT");
        int VPOLIGON = query.getInt("VPOLIGON");
        double VBIGINT = query.getDouble("VBIGINT");
        double VDOUBLE = query.getDouble("VDOUBLE");
        float VFLOAT = query.getFloat("VFLOAT");
        int VINT = query.getInt("VINT");
        int VMEDIUMNT = query.getInt("VMEDIUMNT");
        int VSMALLINT = query.getInt("VSMALLINT");
        boolean VTINYINT = query.getBoolean("VTINYINT");
        String VCHAR = query.getString("VCHAR");
        String VLONGTEXT = query.getString("VLONGTEXT");
        String VMEDIUMTEXT = query.getString("VMEDIUMTEXT");
        String VTEXT = query.getString("VTEXT");
        String VTINYTEXT = query.getString("VTINYTEXT");
        int VBIT = query.getInt("VBIT");
        String VENUM = query.getString("VENUM");
        String notacol = query.getString("notacol");
        String notacol1 = query.getString("notacol1");
                
        /**
        * Crea una entidad TIPOS
        */
        TIPOS t = new TIPOS();
        t.setVvarchar(vvarchar);
        t.setVdecimal(vdecimal);
        t.setVdatetime(vdatetime);
        t.setVblob(vblob);
        t.setVbinary(vBINARY);
        t.setVlongblob(VLONGBLOB);
        t.setVmediumblob(VMEDIUMBLOB);
        t.setTinyblob(TINYBLOB);
        t.setVbarbinary(VBARBINARY);
        t.setVdate(VDATE);
        t.setVtime(VTIME);
        t.setVtimestamp(VTIMESTAMP);
        t.setVyear(VYEAR);
        t.setVgeometry(VGEOMETRY);
        t.setVgeometrycollection(VGEOMETRYCOLLECTION);
        t.setVlinestring(VLINESTRING);
        t.setVmultilinestring(VMULTILINESTRING);
        t.setVmultipoint(VMULTIPOINT);
        t.setVmultipolygon(VMULTIPOLYGON);
        t.setVpoint(VPOINT);
        t.setVpoligon(VPOLIGON);
        t.setVbigint(VBIGINT);
        t.setVdouble(VDOUBLE);
        t.setVfloat(VFLOAT);
        t.setVint(VINT);
        t.setVmediumnt(VMEDIUMNT);
        t.setVsmallint(VSMALLINT);
        t.setVtinyint(VTINYINT);
        t.setVchar(VCHAR);
        t.setVlongtext(VLONGTEXT);
        t.setVmediumtext(VMEDIUMTEXT);
        t.setVtext(VTEXT);
        t.setVtinytext(VTINYTEXT);
        t.setVbit(VBIT);
        t.setVenum(VENUM);
        t.setNotacol(notacol);
        t.setNotacol1(notacol1);
                /**
        * Agrega la entidad a la lista
        */
        list.add(t);
        }
        }catch(Exception ex){
        }
        return list;
    }




                                                                                                                                                        


                                                                                                                                                        


  
                                     


  



}


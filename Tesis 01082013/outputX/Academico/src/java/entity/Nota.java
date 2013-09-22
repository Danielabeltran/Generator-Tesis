
package entity;



/**
* @author Clase generada por Generator v1.0
*/
public class Nota{

    private int id_Estudiante;
    private int id_Curso;
    private double corte1;
    private double corte2;
    private double corte3;


public Nota(){


    this.id_Estudiante = 0;
    this.id_Curso = 0;
    this.corte1 = 0.0;
    this.corte2 = 0.0;
    this.corte3 = 0.0;


}


    /**
    * Get the value of id_Estudiante
    *
    * @return the value of id_Estudiante
    */
    public int getId_estudiante(){
    return id_Estudiante;
    }

    /**
    * Set the value of id_Estudiante
    *
    * @return the value of id_Estudiante
    */
    public void setId_estudiante(int id_Estudiante){
        this.id_Estudiante = id_Estudiante;
    }

    /**
    * Get the value of id_Curso
    *
    * @return the value of id_Curso
    */
    public int getId_curso(){
    return id_Curso;
    }

    /**
    * Set the value of id_Curso
    *
    * @return the value of id_Curso
    */
    public void setId_curso(int id_Curso){
        this.id_Curso = id_Curso;
    }

    /**
    * Get the value of corte1
    *
    * @return the value of corte1
    */
    public double getCorte1(){
    return corte1;
    }

    /**
    * Set the value of corte1
    *
    * @return the value of corte1
    */
    public void setCorte1(double corte1){
        this.corte1 = corte1;
    }

    /**
    * Get the value of corte2
    *
    * @return the value of corte2
    */
    public double getCorte2(){
    return corte2;
    }

    /**
    * Set the value of corte2
    *
    * @return the value of corte2
    */
    public void setCorte2(double corte2){
        this.corte2 = corte2;
    }

    /**
    * Get the value of corte3
    *
    * @return the value of corte3
    */
    public double getCorte3(){
    return corte3;
    }

    /**
    * Set the value of corte3
    *
    * @return the value of corte3
    */
    public void setCorte3(double corte3){
        this.corte3 = corte3;
    }




}
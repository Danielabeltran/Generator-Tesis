
package entity;



/**
* @author Clase generada por Generator v1.0
*/
public class Curso{

    private int id;
    private int id_Profesor;
    private int id_Universidad;
    private String asignatura;
    private String grupo;
    private String horario;

    private List<Nota> nota;

public Curso(){


    this.id = 0;
    this.id_Profesor = 0;
    this.id_Universidad = 0;
    this.asignatura = "";
    this.grupo = "";
    this.horario = "";


    this.nota = new ArrayList<Nota>();
}


    /**
    * Get the value of id
    *
    * @return the value of id
    */
    public int getId(){
    return id;
    }

    /**
    * Set the value of id
    *
    * @return the value of id
    */
    public void setId(int id){
        this.id = id;
    }

    /**
    * Get the value of id_Profesor
    *
    * @return the value of id_Profesor
    */
    public int getId_profesor(){
    return id_Profesor;
    }

    /**
    * Set the value of id_Profesor
    *
    * @return the value of id_Profesor
    */
    public void setId_profesor(int id_Profesor){
        this.id_Profesor = id_Profesor;
    }

    /**
    * Get the value of id_Universidad
    *
    * @return the value of id_Universidad
    */
    public int getId_universidad(){
    return id_Universidad;
    }

    /**
    * Set the value of id_Universidad
    *
    * @return the value of id_Universidad
    */
    public void setId_universidad(int id_Universidad){
        this.id_Universidad = id_Universidad;
    }

    /**
    * Get the value of asignatura
    *
    * @return the value of asignatura
    */
    public String getAsignatura(){
    return asignatura;
    }

    /**
    * Set the value of asignatura
    *
    * @return the value of asignatura
    */
    public void setAsignatura(String asignatura){
        this.asignatura = asignatura;
    }

    /**
    * Get the value of grupo
    *
    * @return the value of grupo
    */
    public String getGrupo(){
    return grupo;
    }

    /**
    * Set the value of grupo
    *
    * @return the value of grupo
    */
    public void setGrupo(String grupo){
        this.grupo = grupo;
    }

    /**
    * Get the value of horario
    *
    * @return the value of horario
    */
    public String getHorario(){
    return horario;
    }

    /**
    * Set the value of horario
    *
    * @return the value of horario
    */
    public void setHorario(String horario){
        this.horario = horario;
    }



    /**
    * Get the value of nota
    *
    * @return the value of nota
    */
    public List<Nota> getNota() {
    return nota;
    }

    /**
    * Set the value of nota
    *
    * @return the value of nota
    */
    public void setNota(List<Nota> nota){
        this.nota = nota;
    }

}
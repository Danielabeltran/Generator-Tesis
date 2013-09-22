
package co.edu.usbbog.model;

import java.util.ArrayList;


public class Entity {

        private String nameTables;
        //Model m = new Model();
    
    /**
    * Set the value of name
    *
    * @param nombre new value of name
    */   
    public void setName(String nameTables) {
        this.nameTables = nameTables;  
        //System.out.println("TABLA: -> " + nameTables);
    }
    /**
    * Get the value of name
    *
    * @return the value of name
    */   
    public String getName() {
        return nameTables; 
    }
    
    private ArrayList<Field>  Fields;
     
      /**
     * Get the value of Fields
     *
     * @return the value of Fields
     */
  public ArrayList<Field> getField() {
        return Fields; 
    }

  /**
     * Set the value of Fields
     *
     * @param Fields new value of Fields
     */
    public void setField(ArrayList<Field> Fields) {
        this.Fields = Fields;
    }

    private ArrayList<Relation>  Relations;
     
      /**
     * Get the value of Relations
     *
     * @return the value of Relations
     */
  public ArrayList<Relation> getRelation() {
        return Relations; 
    }

  /**
     * Set the value of Relations
     *
     * @param Relations new value of Relations
     */
    public void setRelation(ArrayList<Relation> Relations) {
        this.Relations = Relations;
    }
    
  public Entity(){
  this.Fields = new ArrayList<Field>();
  this.Relations = new ArrayList<Relation>();
  this.nameTables = "";
       
  }
}
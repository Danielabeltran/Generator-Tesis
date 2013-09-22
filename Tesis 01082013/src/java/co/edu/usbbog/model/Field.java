/*
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.model;


/**
 *
 * @author jeysonvargasmartinez
 */
public class Field {
   
    private String name;
     /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
  public void setName(String name){
        this.name = name;
       //System.out.println("File:      " + name);
    }
     /**
     * Get the value of nombre
     *
     * @param nombre new value of nombre
     */   
  public String getName(){
         return name;
    }
  
   private String type;
  
   /**
     * Set the value of Tipo
     *
     * @param tipo new value of tipo
     */
  public void setType(String type) 
    {
        if(type.equals("bigint")){
            this.type = "double";
        }else{
        if(type.equals("binary")){
            this.type = "String";
        }else{
        if(type.equals("bit")){
            this.type = "int";
        }else{
        if(type.equals("blob")){
            this.type = "String";
        }else{
        if(type.equals("char")){
            this.type = "String";
        }else{
        if(type.equals("date")){
            this.type = "Date";
        }else{
        if(type.equals("datetime")){
            this.type = "double";
        }else{
        if(type.equals("decimal")){
            this.type = "double";
        }else{
        if(type.equals("double")){
            this.type = "double";
        }else{
        if(type.equals("enum")){
            this.type = "String";  
        }else{
        if(type.equals("geometry")){
            this.type = "int"; 
        }else{
        if(type.equals("geometrycollection")){
            this.type = "int"; 
        }else{
        if(type.equals("linestring")){
            this.type = "String"; 
        }else{
        if(type.equals("longblob")){
            this.type = "String"; 
        }else{
        if(type.equals("longtext")){
            this.type = "String"; 
        }else{
        if(type.equals("mediumblob")){
            this.type = "String";    
        }else{
        if(type.equals("mediumint")){
            this.type = "int";
        }else{
        if(type.equals("mediumtext")){
            this.type = "String";
        }else{
        if(type.equals("multilinestring")){
            this.type = "String";
        }else{
        if(type.equals("multipoint")){
            this.type = "int";
        }else{
        if(type.equals("multipolygon")){
            this.type = "int";
        }else{
        if(type.equals("point")){
            this.type = "int";
        }else{
        if(type.equals("polygon")){
            this.type = "int";
        }else{
        if(type.equals("set")){
            this.type = "String";
        }else{
        if(type.equals("smallint")){
            this.type = "int";
        }else{
        if(type.equals("text")){
            this.type = "String";
        }else{
        if(type.equals("time")){
            this.type = "Time";
        }else{
        if(type.equals("timestamp")){
            this.type = "Timestamp";
        }else{
        if(type.equals("tinyblob")){
            this.type = "String";
        }else{
        if(type.equals("tinyint")){
            this.type = "boolean";
        }else{
        if(type.equals("tinytext")){
            this.type = "String";
        }else{
        if(type.equals("varbinary")){
            this.type = "String";
        }else{
        if(type.equals("varchar")){
            this.type = "String";
        }else{
        if(type.equals("year")){
            this.type = "Date";
        }else {  
            this.type = type;
        }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}
        //System.out.println("tipo:    " +  type);
    }    
    /**
     * Get the value of Tipo
     *
     * @param tipo new value of nombre
     */    
  public String getType() 
    {
        return type;
    }
    
  private String esprimary;
  
   /**
     * Set the value of primaryFiles
     *
     * @param primaryFiles new value of tipo
     */
  public void setPrimary(String esprimary) 
    {
        this.esprimary = esprimary;
        //System.out.println("PRIMARY: " + esprimary);
    }    
    /**
     * Get the value of primaryFiles
     *
     * @param primaryFiles new value of nombre
     */    
  public String getPrimary() 
    {
        return esprimary;
    }
  
  
  private String numericScale;
  
   /**
     * Set the value of numericScale
     *
     * @param numericScale new value of tipo
     */
  public void setnumericScale(String numericScale) 
    {
        if(numericScale == null || numericScale.equals("")){
           this.numericScale = "\"\"";
        }else{
            this.numericScale = numericScale;
        }
    }    
    /**
     * Get the value of numericScale
     *
     * @param numericScale new value of tipo
     */    
  public String getnumericScale() 
    {
        return numericScale;
    }
    

}

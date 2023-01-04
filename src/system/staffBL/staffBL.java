/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system.staffBL;

/**
 *
 * @author javie
 */
public class staffBL {
    
    int Id;
    String name,email;
    
    public Integer getId(){
        return Id;
    }
    
    public void setId(int Id){
        this.Id=Id;   
    }
    
    public String getName(){
       return name;
    }
    public void setName( String name){
        this.name=name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
}

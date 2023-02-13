/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml;

/**
 *
 * @author Hedi
 */
public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    
    public String getName(){
        
        return this.name;
        
    }
    public String getEmail(){
        
        return this.email;
        
    }
    public void setEmail(String email){
        this.email = email;
        System.out.println("Email updated.");
    }
    public char getGender(){
        
        return this.gender;
        
    }
    @Override
    public String toString(){

        return (name + "(" + gender + ") at " + email);
        
    }
    
    
}

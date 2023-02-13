/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uml;

/**
 *
 * @author Hedi
 */
public class UML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Author a = new Author("Martin Clarkaster","MartinCK@hotmail.com",'M');
        System.out.println("Name: " + a.getName());
        System.out.println("Gender: " + a.getGender());
        System.out.println("Email: " + a.getEmail());
        a.setEmail("CkMartin@hotmail.com");
        System.out.println(a);
        
        Book b = new Book("Blood and Beast", a, 37.99, 12000);
        System.out.println("Book name: " + b.getName());
        System.out.println("Author: " + b.getAuthor());
        System.out.println("Price: " + b.getPrice());
        System.out.println("Quantity: " + b.getQty());
        b.setPrice(32.99);
        b.setQty(9000);
        System.out.println(b);
        System.out.println("Price: " + b.getPrice() + "\nQuantity: " + b.getQty());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String name;
        System.out.print("Enter your name: ");
        
        Scanner in = new Scanner(System.in);
        name = in.next();
        
        System.out.println("Hello, "+name+"!");
        
        
        
//        //Announce 2 variables
//        int length;
//        int width;
//        //User input values for sides
//        Scanner in = new Scanner(System.in);
//        
//        System.out.print("Введите длину: ");
//        length = in.nextInt();
//        
//        System.out.print("Введите ширину: ");
//        width = in.nextInt();
//        
//   
//        //make calculations
//        int area=length*width;
//        //print result
//        System.out.println("Площадь= "+area+" см2");
        
    }
    
}

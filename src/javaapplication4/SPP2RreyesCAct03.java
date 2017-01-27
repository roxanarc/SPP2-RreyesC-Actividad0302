/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import java.util.Scanner;
/**
 *
 * @author roxana
 */
public class SPP2RreyesCAct03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    //Sacar la hipotenusa de 
    Scanner keyboard = new Scanner (System.in);
        double a;
        double b;
       
             System.out.println("Valor de a");
             a=keyboard.nextDouble();
             System.out.println("Valor de b");
             b=keyboard.nextDouble();
              System.out.println("Hipotenusa -> " +  Math.sqrt(Math.pow(a,2)+ Math.pow(b,2)));
    }
    
}

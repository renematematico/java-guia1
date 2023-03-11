/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaejercicios1;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingresar dos números enteros");
        
        Scanner entrada1=new Scanner(System.in);
        Scanner entrada2=new Scanner(System.in);
        
        
        int num1,num2;
        num1= entrada1.nextInt();
        num2= entrada2.nextInt();
        
        int suma=num1+num2;
        
        System.out.println("El resultado es "+suma);
    }
    
}

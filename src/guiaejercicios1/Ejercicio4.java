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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creamos una variable con punto flotante
        double c;
        
        //Creamos una variable leer para asignar la clase scanner
        Scanner leer = new Scanner(System.in);
        
        //Enviamos mensaje al usuario
        System.out.println("Ingrese una temperatura en grados Centígrados");
        
        //Guardamos lo que ingresa el usuario dentro de la variable
        c=leer.nextDouble();
        
        /*creamos una variable "f" donde ya se hace
        la conversión directamente*/
        double f=32+(9*c/5);
        
        //Enviamos mensaje al usuario
        System.out.println("Luego de la conversión quedaría:");
        System.out.println(+c+"ºC = "+f+"ºF");
        
    }
    
}

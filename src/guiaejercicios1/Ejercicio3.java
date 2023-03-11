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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escribir un programa que pida una frase
        y la muestre toda en mayúsculas y después
        toda en minúsculas. */
        
        //Creo una variable "frase"
        String frase;
        
        /*Creo una variable "leer" que me servirá para escanear lo que
        el usuario escriba por teclado.
        En realidad estoy asignando una función a la variable leer,
        se la puede reutilizar dentro del código.*/
        Scanner leer = new Scanner(System.in);
        
        //Envío el mensaje al usuario para que escriba
        System.out.println("¡Hola!");
        System.out.println("Ingresá una frase");
        
        /*Leo lo que escribe el usuario
        "next()" Solamente lee una palabra
        "nextLine()" Se usa para una cadena de texto más larga.*/
        frase=leer.nextLine();
        
        //Muestro la frase original
        System.out.println("La frase original es:");
        System.out.println(frase);
        System.out.println("- - - - - - - - - - - -");
        
        //Muestro la frase todo en mayúsculas
        System.out.println("La frase escrita en MAYÚSCULAS");
        System.out.println(frase.toUpperCase());
        System.out.println("- - - - - - - - - - - -");
        
        //Muestro la frase todo en minúsculas
        System.out.println("La frase escrita en minúsculas");
        System.out.println(frase.toLowerCase());
    }
    
}

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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingresar tu nombre");
        String nombre;
        Scanner entrada1 = new Scanner(System.in);
        nombre = entrada1.next();
        System.out.println("El nombre guardado es "+nombre);
    }
    
}

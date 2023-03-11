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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creamos la variable para recibir el número
        int num1;
        
        //Creamos una variable leer para ingresar el número del usuario
        Scanner leer = new Scanner(System.in);
        
        //Enviamos mensaje al usuario
        System.out.println("Ingresar un número entero");
        
        //Recibimos dentro de la variable num1 lo que el usuario escribe.
        num1= leer.nextInt();
        
        //Enviamos mensaje al usuario con el número ingresado
        System.out.println("El número ingresado es: "+num1);
        
        //Enviamos mensaje al usuario con el doble del número ingresado
        System.out.println("El doble del número es: "+num1*2);
        
        //Enviamos mensaje al usuario con el triple del número ingresado
        System.out.println("El triple del número es: "+num1*3);
        
        //Enviamos mensaje al usuario con la raíz cuadrada del número ingresado
        System.out.println("La raíz cuadrada es: "+Math.sqrt(num1));
        
        /*Creamos una variable de tipo punto flotante llamada "raíz"
        dentro de la cual guardamos la raíz cuadrada del número ingresado
        por el usuario*/
        double raiz=Math.sqrt(num1);
        
        //Enviamos el mensaje al usuario con el contenido de la variable "raíz"
        System.out.println("También lo podemos guardar en una variable la cual sería: "+raiz);
        
    }
    
}

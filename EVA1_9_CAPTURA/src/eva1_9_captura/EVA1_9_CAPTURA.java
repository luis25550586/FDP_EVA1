/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_captura;

import java.util.Scanner;

/**
 *
 * @author Luism
 */
public class EVA1_9_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        int edad;
        double promedio;
       
        //capturar en java:
        Scanner input = new Scanner(System.in);//creamos el scanner
        //caputa texto
        
        System.out.println("introduce tu nombre completo");
        nombre = input.nextLine();
                
        
        System.out.println("introduce tu edad: ");
        edad = input.nextInt();
        
        System.out.println("Introduce tu promedio: ");
        promedio = input.nextDouble();
        
        System.out.println("El nombre completo es: ");
        System.out.println(nombre);
        
        System.out.println("La edad es: ");
        System.out.println(edad);
        
        System.out.println("La edad es: ");
        System.out.println(promedio);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_operaciones;

/**
 *
 * @author Luism
 */
public class EVA1_6_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // area de un circulo
        double area;
        double radio;
        double pi;
        
        pi = 3.1416;
        radio = 5;
        area = pi * radio * radio;
        
        System.out.println("El valor de el area de un circulo es: ");
        System.out.println(area);
        radio = 100;
        area = pi * radio * radio;
        System.out.println("El valor de el area de un circulo es: ");
        System.out.println(area);
        
    }
    
}

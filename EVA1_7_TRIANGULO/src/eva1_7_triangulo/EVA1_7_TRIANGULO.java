/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_triangulo;

/**
 *
 * @author Luism
 */
public class EVA1_7_TRIANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //AREA DE UN TRIANGULO
        //AREA (BASE X ALTURA) ENTRE 2
        double area, base, altura;//tres variables de tipo double
        //Inicializacion
        base = 10;
        altura = 8;
        // Se aplica la precedencia de operaciones
        area = (base * altura) / 2.0;//Cuidado con dividir entre enteros
        System.out.println("El area de un triangulo base 10 y altura 8 es: ");
        System.out.println(area);
    }
    
}

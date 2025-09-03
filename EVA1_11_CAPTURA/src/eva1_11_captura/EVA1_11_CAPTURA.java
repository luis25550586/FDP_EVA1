/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_captura;

import java.util.Scanner;

/**
 *
 * @author Luism
 */
public class EVA1_11_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calculo de velocidad
        // solicitar ldistancia (M) y tiempo (s)
        // Declarar variasbles
        Scanner  input = new Scanner(System.in);
        double V , D , T , Vel;
        // Solicitar datos
        System.out.println("La distancia en metros: ");
        D = input.nextDouble();
        System.out.println("El tiempo en segundos: ");
        T = input.nextDouble();
        // Realizar Calculos 
        V = D / T;
        // Mostrar resultados 
        System.out.println("La velocidad en m/s es: ");
        System.out.println(V);
        // resultado en k/h 
        Vel = V * 3.6;
        System.out.println("La velocidad en km/h es: ");
        System.out.println(Vel);
    }
    
}

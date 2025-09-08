/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author Luism
 */
public class EVA1_13_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DECLARACION DE VARIABLES
        double Cali;
        Scanner captu = new Scanner( System.in);
        
        // CAPTURA
        System.out.println("introduce tu calificacion: ");
        Cali = captu.nextDouble();
        // estructura decontrol - THEN- 
        if(Cali >= 70){
        
            System.out.println("felicidades, acreditaste");
       } else {  // OPCIONAL
            System.out.println("AZOTES");
            
        }
    }
    
}

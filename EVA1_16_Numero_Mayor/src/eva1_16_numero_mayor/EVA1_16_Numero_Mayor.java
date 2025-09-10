/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author Luism
 */
public class EVA1_16_Numero_Mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int N1, N2;
        System.out.println("Escribe un numero: ");
        N1 = captu.nextInt();
        
         System.out.println("Escribe un numero: ");  
         N2 = captu.nextInt();
         
         if(N1 > N2){
           System.out.println("El numero mayor es:");
             System.out.println(N1);
         }else {
             // If anidados
             if (N2 > N1) {
            System.out.println("El numero mayor es: ");
            System.out.println(N2);
            
         } else {
                 System.out.println("Los numeros son iguales");      
                 }
    }
    
}
}
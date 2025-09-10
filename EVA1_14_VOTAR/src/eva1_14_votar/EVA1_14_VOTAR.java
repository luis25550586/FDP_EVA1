/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_votar;

import java.util.Scanner;

/**
 *
 * @author Luism
 */
public class EVA1_14_VOTAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double edad;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("intrdusca su edad: ");
        edad = captu.nextDouble();
        
        if (edad >= 18){
            System.out.println("Puedes votar");
        }else{
           System.out.println("No puedes votar"); 
        }
       
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_descuento;

import java.util.Scanner;

/**
 *
 * @author Luism
 */
public class EVA1_15_DESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double venta, pagar ; 
        Scanner captu = new Scanner (System.in);
       
        System.out.println("La venta total fue:");
        venta = captu.nextDouble();
        
        if(venta > 1000){
            pagar = venta * 0.85;
            System.out.println("total fue");
            System.out.println(pagar);
        }
                
    }
    
}

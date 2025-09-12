/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_23_compras;

import java.util.Scanner;

/**
 *
 * @author Luism
 */
public class EVA1_23_COMPRAS {

    
    public static void main(String[] args) {
        String efectivo, credito;
        Scanner captu = new Scanner (System.in);
        System.out.println("Cuentas con Efectivo: ");
        efectivo = captu.nextLine();
        
        System.out.println("Cuentas con Credito: ");
        credito = captu.nextLine();
        
        if (efectivo.equals("si") || credito.equals("si"))  {
            System.out.println("Puede comprar");
    }else{
            System.out.println("No puede comprar");
        }
    }
    
}

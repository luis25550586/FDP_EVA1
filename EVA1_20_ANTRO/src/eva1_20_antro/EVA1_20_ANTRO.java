/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_antro;

import java.util.Scanner;

/**
 *
 * @author Luism
 */
public class EVA1_20_ANTRO {
       final static String Acceso_edad = "18";
        final static String Acceso_crede = "si";
    public static void main(String[] args) {
        
        String Edad, Credencial;
        Scanner captu = new Scanner (System.in);
        
        System.out.println("Acceso al antro");
         
        System.out.println("Edad: ");
        Edad = captu.nextLine();
        
        System.out.println("Tiene credencial? ");
        Credencial = captu.nextLine();
        
        if(Edad.equals(Acceso_edad)){
            if (Credencial.equals(Acceso_crede) ) {
                System.out.println("Acceso consedido");
            }else {
                System.out.println("Acceso denegado");
            }
        }else{
            System.out.println("No puedes entrar");
        }
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_21_acceso_tablas;

import java.util.Scanner;

/**
 *
 * @author Luism
 */
public class EVA1_21_ACCESO_TABLAS {

    final static String Acceso_usu = "Luis";
    final static  String Acceso_contra = "1234";
    public static void main(String[] args) {
        String Usuario, Contra;
        Scanner captu = new Scanner (System.in);
        
        System.out.println("Control de acceso");
        System.out.println("Restaurante");
        
        System.out.println("Usuario");
        Usuario = captu.nextLine();
        
        System.out.println("Contraseña");
        Contra = captu.nextLine();
        if (Usuario.equals(Acceso_usu) && Contra.equals(Acceso_contra)) {
        System.out.println("Acceso concedido");
    }else{
            System.out.println("Acceso denegado"); 
        }
        
            
        
    }
    
}

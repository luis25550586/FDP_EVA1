/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_19_acceso;

import java.util.Scanner;

/**
 *
 * @author Luism
 */
public class EVA_19_ACCESO {
    // Constantes
    final static String Acceso_usu = "Luis";
    final static  String Acceso_contra = "1234";
    // final static doubel PI = 3.1416
    public static void main(String[] args) {
        String Usuario, Contraseña;
        Scanner captu = new Scanner (System.in);
        
        System.out.println("Control de acceso");
        System.out.println("Restaurante");
        
        System.out.println("Usuario");
        Usuario = captu.nextLine();
        
        System.out.println("Contraseña");
        Contraseña = captu.nextLine();
        
        if (Usuario.equals(Acceso_usu) ) {
            if (Usuario.equals(Acceso_contra) ) {
                System.out.println("Acceso consedido");
            }else {
                System.out.println("Acceso denegado");
            }
        } else {
            System.out.println("Incorrecto");
        }
        
    }
    
}

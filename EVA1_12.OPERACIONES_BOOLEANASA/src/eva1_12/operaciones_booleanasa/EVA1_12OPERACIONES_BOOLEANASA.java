/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12.operaciones_booleanasa;

/**
 *
 * @author Luism
 */
public class EVA1_12OPERACIONES_BOOLEANASA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int radio = 5; //declaro e inicializo
        boolean resu;// true false
        // uno de operadores booleanos
        
        resu = radio > 0;
        System.out.println("Radio (5) < 0es: ");
        System.out.println(resu);
        
        resu = radio == 0;
        System.out.println("Radio (5) = 0 es: ");
        System.out.println(resu);
        
        resu = radio != 0;
        System.out.println("Radio (5) != 0 es: ");
        System.out.println(resu);
    }
    
}

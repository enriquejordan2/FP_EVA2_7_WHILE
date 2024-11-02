/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_while;

/**
 *
 * @author Jose Enrique
 */
public class EVA2_7_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //imprimir los numeros del 1 al 10 
        int val = 1;
        while (val <=10){ // while--> mientras( esto sea verdad) ( repetir esto)
            System.out.print(val +"-");
            val++;
            
        }
        System.out.println("");
        val = 1;
        do {
            System.out.print(val+ "-");
            val++;
        
        }while(val <= 10); //REPETIR (ISNTRUCCIONES) MIENTRAS (ESTO SE CUMPLA)   
    } 
}

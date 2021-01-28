/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajonetbeans;
import java.util.*;
/**
 *
 * @author pc
 */
public class TrabajoNetbeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc=new Scanner(System.in);
        int Numeros[]=new int [10];
        
        for(int i=0;i<Numeros.length;i++){
            System.out.println("Escribe un numero");
           Numeros[i]=sc.nextInt();
            
        }
        
        Arrays.sort(Numeros);
         for(int i=0;i<Numeros.length;i++){
             System.out.println("El mumero es "+Numeros[i]);
         }
    }
}


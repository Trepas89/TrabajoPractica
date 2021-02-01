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
        Scanner sc = new Scanner(System.in);
        int s=11;
        s = Validacion(s, sc);
        
        int Numeros[] = new int[s];
        int j = 0;

        for (int i = 0; i < Numeros.length; i++) {
            System.out.println("Escribe un numero");
            int num = sc.nextInt();

            for (j = 1; j < Numeros.length-1; j++) {
                do {
                    if (num == Numeros[j]) {
                        System.out.println("Escribe un numero que no este ya en la array");
                        num = sc.nextInt();
                        j=j-1;
                    }
                } while (num == Numeros[j]);
            }
            Numeros[i]=num;

        }

        Arrays.sort(Numeros);
        for (int i = 0; i < Numeros.length; i++) {
            System.out.println("El mumero es " + Numeros[i]);
        }
        
        Comprobar_numero(sc, Numeros);
        
    }

    public static void Comprobar_numero(Scanner sc, int[] Numeros) {
        System.out.println("Escribe el numero que quieres ver si esta en la array");
        int num=sc.nextInt();
        for (int i = 0; i < Numeros.length; i++) {
            if(num==Numeros[i]){
                System.out.println("El numero esta en la array");
                break;
            }
            if(i==Numeros.length-1){
                System.out.println("Ese numero no se encuentra el la array");
            }
        }
    }

    public static int Validacion(int s, Scanner sc) {
        do{
            System.out.println("Cuantos espacios quieres reservar,recuerda que como maximo se pueden 10");
            s=sc.nextInt();
        }while(s>10 || s<=0);
        return s;
    }
}

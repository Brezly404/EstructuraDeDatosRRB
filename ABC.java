/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc;

import java.util.Scanner;


/**
 *
 * @author hp
 */
public class ABC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner rd = new Scanner(System.in);

        int tope = 0,op = 0;
        //System.out.println("ingrese las letras del abecedario: ");
        char[] letra = new char[26];
        
        do {
            
            System.out.println("1. agregar\n" + "2. eliminar\n" + "3. mostrar\n" + "4. salir\n");
            
            switch(op = rd.nextInt()){
                
                case 1:
                    
                    if (tope == letra.length) {
                        System.out.println("pila llena...");
                    }else{
                        System.out.println("comience a llenar:");
                        letra[tope] = rd.next().charAt(0);
                        System.out.println(tope+". ");
                        tope++;
                    break;    
                    }
                        
                case 2: 
                    if (tope > 0) {

                        System.out.println("Dato eliminado" + tope);
                        tope--;

                    } else {

                        System.out.println("pila vacia");

                    }
                    break;
                case 3: 
                    if (tope > 0) {

                        for (int i = tope - 1; i >= 0; i--) {
                            System.out.println(" " + letra[i]);
                        }
                    } else {
                        System.out.println("pila vacia");
                    }
                    break;
            }
            
            
            
            
             
        } while (op != 4);
        
//        
//            for (int i = 0; i < tope; i++) {
//            System.out.print((i + 1) + ". inicie el abecedario: ");
//            letra[i] = rd.next().charAt(0);

    }
}
        


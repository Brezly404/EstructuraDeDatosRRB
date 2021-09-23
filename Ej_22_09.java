/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_22_09;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Ej_22_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random tp = new Random();

        char prt;
        int tope = 0, opt = 0;
        char[] pila = new char[26];
        do {
            System.out.println("\n 1 - llenar\n"
                    + "2 - eliminar\n"
                    + "3 - mostrar\n"
                    + "4 - contar\n"
                    + "5 - salir\n\n");
            switch (opt = sc.nextInt()) {
                case 1:
                    char letra;
                    for (int i = 0; i < 26; i++) {
                        if (tope < 26) {

                            letra = (char) (tp.nextInt(26) + 'a');
                            pila[tope] = letra;//abc[i];
                            letra++;
                            tope++;
                        } else {
                            System.out.println("pila llena....");
                            break;
                        }
                    }
                    break;
                case 2:
                    if (tope > 0) {
                        System.out.println("dato eliminado..." + tope);
                        //restar unidad a tope, para poder reutilizar la posicion 
                        tope--;
                    } else {
                        System.out.println("no hay elementos para eliminar....");
                    }
                    break;
                case 3:
                    if (tope > 0) {
                        for (int i = tope - 1; i >= 0; i--) {
                            System.out.println(" " + pila[i]);
                        }
                    } else {
                        System.out.println("pila vacia....");
                    }
                    break;
                case 4:

                    for (int i = 0; i < pila.length; i++) {
                        int conteo = 0;
                        prt = pila[i];
                        for (int j = 0; j < pila.length; j++) {
                            if (pila[j] == prt) {
                                conteo++;
                            }
                            if (conteo>=0) {
                                conteo--;
                            }
                        }
                        System.out.println(pila[i] + " se repite " + conteo + " veces ");

                    }

                    break;
            }

        } while (opt != 5);
    }
}

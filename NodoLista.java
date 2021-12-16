/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodolista;

import java.util.Scanner;

/**
 *
 * @author Tesoem
 */
public class NodoLista {

    Scanner sc = new Scanner(System.in);
    Scanner br = new Scanner(System.in);

    static class Nodo {

        int id;
        String marca;
        String tipo;
        float prec;

        Nodo sig;

    }
    
    Nodo inicio = null;
    Nodo fin = null;
    int i = 1;
    
    public void agregar() {

        Nodo temp = new Nodo();
        
        temp.id=i;        
        System.out.print("Modelo de tenis: ");
        temp.marca = sc.nextLine();
        System.out.print("Talla :  ");
        temp.tipo = sc.nextLine();
        System.out.print("Da un precio: ");
        temp.prec = br.nextFloat();

        if (inicio == null) {

            inicio = temp;
            inicio.sig = null;
            fin = temp;
        } else {

            fin.sig = temp;
            temp.sig = null;
            fin = temp;
            System.out.println("Dato agregado " + fin.id);

        }
        i++;
    }

    public void mostrar() {

        Nodo actual = new Nodo();
        actual = inicio;
        if (inicio != null) {

            while (actual != null) {
                System.out.println(" " + "[" + actual.id + "] " + "[" + actual.marca + "] " + " [" + actual.tipo + "]"
                        + " [" + actual.prec + "]");
                actual = actual.sig;
            }

        } else {

            System.out.println("\nla lista esta vacia");

        }

    }

    public static void main(String[] args) {

        Scanner rd = new Scanner(System.in);

        int opt = 0;

        NodoLista n = new NodoLista();

        do {
            System.out.println("\tLista de almacenamiento.");
            System.out.println("\n1 add" + "\n2 show" + "\n3 exit");

            switch (opt = rd.nextInt()) {

                case 1:

                    n.agregar();

                    break;

                case 2:

                    n.mostrar();

                    break;

            }

        } while (opt != 3);

    }

}
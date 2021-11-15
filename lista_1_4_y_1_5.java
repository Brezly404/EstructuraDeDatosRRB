package lista_simple_1_3;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class lista_1_4_y_1_5 {

    static class Node {

        String name;
        Node next;
    }

    static void dump(String palabra_, StringBuilder pal) {

        System.out.println(palabra_ + "");

        while (pal != null) {
            System.out.println(pal + " ");
            pal = pal.append(palabra_);
            break;
        }
        System.out.println("");
    }

    static void dump(String msg, Node topNode) {
        System.out.print(msg + " ");

        while (topNode != null) {
            System.out.print(topNode.name + " ");
            topNode = topNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner rd = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        Node top = null;
        top = new Node();
        Node random;
        Node temp;
        StringBuilder palabra = new StringBuilder();
        StringBuilder pal = palabra;

        do {

            System.out.println("\ningrese la opción requerida:\n"
                    + "1. Agregar nodo inicial\n"
                    + "2. muestra\n"
                    + "3. eliminar nodo incial\n"
                    + "4. generar palabra aleatoria\n"
                    + "5. busqueda de nodo\n"
                    + "6. fin");

            switch (opt = rd.nextInt()) {

                case 1:

                 
                        System.out.print("ingresa contenido de nodo incial: ");
                        top.name = sc.nextLine();
                        top.next = null;
                        
                        
                        
                        temp = new Node();
                        System.out.print("ingresa contenido de nodo anterior a inicial: ");
                        temp.name = sc.nextLine();
                        temp.next = top;
                        top = temp;

                    break;

                case 2:

                    if (top == null) {

                        System.out.println("La lista esta vacia");
                    } else {
                        
                        dump("Vista del nodo: ", top);
                        

                    }

                    break;

                case 3:

                    if (top == null) {
                        System.out.println("No hay valores que eliminar\n");
                    } else {
                        top = top.next;
                        dump("nodo eliminado: ", top);
                        break;
                    }

                case 4:

                    try {

                        ArrayList<String> list = new ArrayList<>();
                        int longitud = 4;
                        int indice = 0;
                        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                        String caracteres = "abcdefghijklmnopqrstuvwxyz0123456789";
                        String especiales = "@#$%^&*";
                        
                        Random rnd = new Random();
                        indice = rnd.nextInt(mayusculas.length());
                        palabra.append(mayusculas.charAt(indice));
                        for (int i = 0; i < longitud; i++) {
                            indice = rnd.nextInt(caracteres.length());
                            palabra.append(caracteres.charAt(indice));
                        }
                        indice = rnd.nextInt(especiales.length());
                        palabra.append(especiales.charAt(indice));
                        

                        dump("palabra: ", pal);
                        dump("nodos", top);
                    } catch (Exception e) {// TODO: handle exception}}
                    }
                     
                    break;

                case 5:

                    temp = top;
                    while (temp.next != null) {
                        temp = temp.next;
                    }
                    dump("mire: ", top);
                    break;
         }

        } while (opt != 6);
//By: brezly
    }

}

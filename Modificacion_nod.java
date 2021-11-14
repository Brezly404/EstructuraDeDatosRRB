package lista_simple_1_3;


import java.util.Scanner;

public class Modificacion_nod {

    static class Node {

        String name;
        Node next;
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

        do {

            System.out.println("\ningrese la opción requerida:\n"
            +"1. Agregar nodo inicial\n"
            +"2. muestra\n" 
            +"3. eliminar nodo incial\n"
            +"4. buscar nodo\n"
            +"5. fin\n");

            switch (opt = rd.nextInt()) {

                case 1:

                    System.out.print("ingresa contenido de nodo incial: ");
                    top.name = sc.nextLine();
                    top.next = null;

                    Node temp;

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
                        dump("Vista del nodo\n", top);
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

            }

        } while (opt != 5);
//By: brezly
    }

}

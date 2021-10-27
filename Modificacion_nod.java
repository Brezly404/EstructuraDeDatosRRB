
import java.util.Scanner;

public class Modificacion_nod {

    static class Node {
        String name;
        Node next;
    }
    static void dump (String msg, Node topNode) {
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
           
            System.out.println("ingrese la opción requerida:\n"
            +" 1. Agregar nodo inicial\n"
            +" 2. Agregar nodo atras del inicial\n"
            +" 3. Agregar nodo delante de incial\n"
            +" 4. Agregar nodo intermedio\n"
            +" 5. Mostrar lista\n"
            +" 6. Detener\n");

            switch (opt = rd.nextInt()) {

            case 1:

                System.out.println("ingresa contenido de nodo incial:");
                top.name = sc.nextLine();
                top.next = null;

                break;

            case 2:
                Node temp;

                temp = new Node();
                System.out.println("ingresa contenido de nodo anterior a inicial");
                temp.name = sc.nextLine();
                temp.next = top;
                top = temp;
                break;

            case 3:
                temp = new Node();
                System.out.println("ingresa contenido de nodo posterior a inicial");
                temp.name = sc.nextLine();
                temp.next = null;

                Node temp2;

                temp2 = top;

                while (temp2.next != null) {
                    temp2 = temp2.next;
                }

                temp2.next = temp;


                break;
            case 4:
                
            //No logre hacer que se insertara entre un rango de valores
            //solo que se introdujera de manera automatica
            
                temp = new Node();
                System.out.println("ingresa contenido de nodo intermedio");
                temp.name = sc.nextLine();

                temp2 = top;

                while (temp2.name.equals(top.name) == false) {
                    temp2 = temp2.next;
                }

                temp.next = temp2.next;
                temp2.next = temp;

                break;
            case 5:

                dump("Vista del nodo\n", top);
                break;

            }

        } while (opt != 6);
//By: brezly
    }

}

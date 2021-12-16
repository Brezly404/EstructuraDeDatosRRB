import java.util.Random;
import java.util.Scanner;

public class Letras {

    static class Nodo {

        String pal;
        Nodo sig;

    }

    Nodo inicio = null;
    Nodo fin = null;

    public void agregar() {

        Random r = new Random();

        for (int i = 0; i <= 500; i++) {

            Nodo temp = new Nodo();
            
            
            for (int j = 0; j < 4 ; j++) {

                char l = (char) (r.nextFloat() * 25 + 97);
                temp.pal = (String)temp.pal+l;           

                

            }
                       
            if (inicio == null) {

                inicio = temp;
                inicio.sig = null;
                fin = temp;

            }else {

                fin.sig = temp;
                temp.sig = null;
                fin = temp;

            }
            
        }
        System.out.println("Valor agregado");
    }

    public void mostrar() {

        Nodo actual = new Nodo();

        actual = inicio;
        if (inicio != null) {

            while (actual != null) {

                System.out.println("" + "[" + actual.pal + "]");
                actual = actual.sig;
            }

        } else {
            System.out.println("No hay valores");
        }

    }

    public void ordenar() {

        if (inicio != null) {

            System.out.println(" Datos ordenados ");

            for (int a = 0; a <= 500; a++) {

                Nodo anterior = new Nodo();

                anterior = inicio;

                Nodo actual = new Nodo();

                actual = anterior.sig;

                while (anterior.sig != null) {

                    if (anterior.pal == actual.pal) {

                        String aux = anterior.pal;
                        anterior.pal = actual.pal;
                        actual.pal = aux;

                    }

                    anterior = actual;
                    actual = anterior.sig;

                }

            }
        }
    }

    public static void main(String[] args) {

        Letras n = new Letras();

        Scanner rd = new Scanner(System.in);
        int op;

        do {

            System.out.println("1 add\n"
                    + "2 show\n"
                    + "3 order\n"
                    + "4 exit");

            switch (op = rd.nextInt()) {

                case 1:

                    n.agregar();

                    break;

                case 2:

                    n.mostrar();

                    break;

                case 3: 
                
                    n.ordenar();

                break;
            }

        } while (op != 4);

    }

}

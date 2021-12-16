
import java.util.Scanner;

public class Try {

    static class Nodo {

        int num;
        Nodo art;
    }

    Nodo inicio = null;
    Nodo fin = null;

    public void agregar() {

        for (int j = 0; j <= 500; j++) {

            Nodo tem = new Nodo();

            tem.num = (int) (Math.random() * 500);
            // System.out.println(j);
            if (inicio == null) {

                inicio = tem;
                inicio.art = null;
                fin = tem;

                // System.out.println("Dato agregado " + inicio.num);
            } else {

                fin.art = tem;
                tem.art = null;
                fin = tem;
                // System.out.println("Dato agregado " + fin.id);

            }

        }
        System.out.println("valores agregados");
    }

    public void mostrar() {

        Nodo actual = new Nodo();

        actual = inicio;

        if (inicio != null) {

            while (actual != null) {
                System.out.println("" + "[" + actual.num + "]");

                actual = actual.art;
            }

        } else {

            System.out.println("la lista esta vacia");

        }

    }

    public void ordenar() {

        if (inicio != null) {

            System.out.println(" Datos ordenados ");

            for (int a = 0; a <= 500; a++) {

                Nodo anterior = new Nodo();

                anterior = inicio;

                Nodo actual = new Nodo();

                actual = anterior.art;

                while (anterior.art != null) {

                    if (anterior.num < actual.num) {

                        int aux = anterior.num;
                        anterior.num = actual.num;
                        actual.num = aux;

                    }

                    anterior = actual;
                    actual = anterior.art;

                }

            }
        }
    }

    public void eliminar() {

        System.out.println(" - Datos repetidos eliminados\n");

        for (int tr = 1; tr <= 500; tr++) {

            Nodo anterior = new Nodo();
            Nodo actual = new Nodo();
            anterior = inicio;
            actual = anterior.art;

            if (inicio != null) {

                while (anterior.art != null) {

                    if (anterior.num == actual.num) {

                        /* CASE 1 */ if (anterior.art == inicio) {

                            actual = actual.art;

                        } else {

                            /* CASE 2 */ if (actual.art == null) {

                                anterior.art = null;

                                /* CASE 3 */ } else {

                                anterior.art = actual.art;
                                actual = actual.art;

                            }

                        }

                    }

                    anterior = actual;
                    actual = anterior.art;

                }
            }
        }
    }


    public void faltante(){

        Nodo fat = new Nodo();

    }

    public static void main(String[] args) {

        Try n = new Try();

        Scanner rd = new Scanner(System.in);
        int op;

        do {

            System.out.println("\n1 add\n"
                    + "2 show\n"
                    + "3 order\n"
                    + "4 eliminar\n"
                    + "5 agregar faltantes\n"
                    + "6 exit\n");

            switch (op = rd.nextInt()) {
                
                default:

                case 1:

                    n.agregar();

                    break;

                case 2:

                    n.mostrar();

                    break;

                case 3:

                    n.ordenar();

                    break;

                case 4:

                    n.eliminar();

                    break;

                case 5: 

                    n.faltante();

                    break;


            }
        } while (op != 6);
    }

}

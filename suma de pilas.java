import java.util.Scanner;

class terror {

    public static void main(String[] args) {

        Scanner rd = new Scanner(System.in);

        int op = 0;

        System.out.print("tamaño de pila A: ");
        // Definicion y lectura de pilaA
        int a = rd.nextInt();
        int[] pilaA = new int[a];
        System.out.print("tamaño de pila B: ");
        // definicion y lectura de pilaB
        int b = rd.nextInt();
        int[] pilaB = new int[b];
        // Vector C en donde se hara
        // el proceso de union y suma de terminos
        int[] pilaC = new int[a + b];

        do {

            System.out.println("\n1. llenar pilas A y B. \n" 
                    
                    + "2. mostrar pilas A y B\n" 
                    + "3. vaciar pilas A y B\n"
                    + "4. unir pilas\n" 
                    + "5. mostrar pila C\n"
                    + "6. Salir");

            switch (op = rd.nextInt()) {

                case 1:

                    System.out.println("Se agregaron los valores");
                    for (int i = 0; i < a; i++) {
                        pilaA[i] = (int) (Math.random() * 100 + 1);

                    }
                    for (int i = 0; i < b; i++) {
                        pilaB[i] = (int) (Math.random() * 100 + 99);

                    }
                    break;

                case 2:

                    System.out.println("\nPila A");
                    for (int i = a - 1; i >= 0; i--) {
                        System.out.println(" " + pilaA[i]);
                    }
                    System.out.println("\nPila B");
                    for (int i = b - 1; i >= 0; i--) {
                        System.out.println(" " + pilaB[i]);
                    }
                    break;

                case 3:

                    if (a > 0) {

                        System.out.println("Dato de A eliminado " + a);
                        a--;

                    } else {

                        System.out.println("pila A vacia");

                    }
                    if (b > 0) {

                        System.out.println("Dato de B eliminado " + b);
                        b--;

                    } else {

                        System.out.println("pila B vacia");

                    }
                    break;

                case 4:

                    System.out.println("Union realizada.\n");
                    int aux = 0;
                    for (int i = a - 1; i >= 0; i--) {
                        pilaC[aux] = pilaA[i];
                        aux++;
                    }

                    for (int j = b - 1; j >= 0; j--) {
                        pilaC[aux] = pilaB[j];
                        aux++;
                    }
                    break;

                case 5:
                    int suma = 0;
                    for (int i = 0; i < 2 ; i++) {
                        suma = pilaA[i] + pilaB[i];
                        extracted(pilaC, suma, i);
                        System.out.println("\n"+ suma);
                    }
                    
                    break;
            }
            
        } while (op != 6);

    }

    private static void extracted(int[] pilaC, int suma, int i) {
      pilaC[i] = suma;
    }

}
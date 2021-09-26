import java.util.Scanner;
class progra {

public static void main(String[] args) {
    
    Scanner rd = new Scanner(System.in);

        int tope = 0, topeB = 0, op = 0, a = 0, b = 0;

        int[] pilaA = new int[5];

        int[] pilaB = new int[5];

        int[] pilaC = new int[10];

        do {

            System.out.println("\nSelecciona la opción: \n"
                    + "\n1. Llenar pila A\n"
                    + "2. Llenar pila B\n"
                    + "3. Borrar dato de pila A\n"
                    + "4. Borrar dato de pila B\n"
                    + "5. Mostrar pila A y B \n"
                    + "6. Unificación de pilas\n"
                    + "7. Salida\n");

            switch (op = rd.nextInt()) {

                case 1:

                    if (tope == pilaA.length) {
                        System.out.println("pila llena...");
                    } else {
                        System.out.println("comience a llenar:");
                        pilaA[tope] = rd.nextInt();
                        System.out.println(tope + ". ");
                        tope++;
                    }
                    break;

                case 2:

                    if (topeB == pilaB.length) {
                        System.out.println("pila llena...");
                    } else {
                        System.out.println("comience a llenar:");
                        pilaB[topeB] = rd.nextInt();
                        System.out.println(topeB + ". ");
                        topeB++;
                    }

                    break;

                case 3:
                    if (tope > 0) {

                        System.out.println("Dato de A eliminado" + tope);
                        tope--;

                    } else {

                        System.out.println("pila A vacia");

                    }
                    break;

                case 4:
                    if (topeB > 0) {

                        System.out.println("Dato de B eliminado" + tope);
                        topeB--;

                    } else {

                        System.out.println("pila B vacia");

                    }
                    break;

                case 5:
                    if (tope > 0) {

                        for (int i = tope - 1; i >= 0; i--) {
                            System.out.print(" " + pilaA[i]);
                        }

                    } else {
                        System.out.println("\npila A vacia");
                    }

                    if (topeB > 0) {

                        for (int j = topeB - 1; j >= 0; j--) {
                            System.out.print(" " + pilaB[j]);
                        }
                    } else {
                        System.out.println("\npila B vacia");
                    }

                    break;

                case 6:
                    
                    System.out.println("Unión de pilas terminado");
                    int xor= 0;
                    
                    for (int i = 0 ; i < 5; i++) {
                      
                        pilaC[xor]= pilaA[i];
                        xor++;
                        pilaC[xor] = pilaB[i];
                        xor++;
                    }
                    System.out.print("\n" );
                    for(int i=0;i<10;i++){
                        System.out.print(pilaC[i]+" ");
                    }
                    System.out.println();
                    
                    break;

            }

        } while (op != 7);


}
    
    





}
    

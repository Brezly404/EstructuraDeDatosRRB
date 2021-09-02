package matriz_nxm;

import java.util.Scanner;

public class Matriz_NxM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner JD=new Scanner(System.in);
        
        //solicita el tamaño de la x en cuestión
        System.out.println("Ingresa tamaño de la X:");
        int tamaño=JD.nextInt();

        //En caso de que el valor sea 0 se irrumpe el programa 
        if (tamaño == 0)
        
            System.out.println("Elige un numero valido ");
        
        else
        {
            //se establece el arreglo de dimensión nxn
            String[][]borde = new String[tamaño][tamaño];
            
            //se hace el arreglo de las dimensiones con el recorrido 
            for ( int i=0; i < borde.length ;i++){
                for (int j=0;  j<borde.length;j++){
                    // se establece un incremento en X
                    int x = i + 1;
                    
                    //hace la comparativa or para la impresión del caracter 
                    if((i==j)  ||  (j == (tamaño - x))){
                        //impresión de nuestro asterisco 
                        borde[i][j] = "*";
                        //Impresión de espacios en blanco 
                        System.out.print(borde[i][j] + "  ");
                    }
                    else{
                       
                        borde[i][j] = " ";
                        System.out.print(borde[i][j] + "  ");
                    }
                }  
                
                System.out.println();
                
            }   
        }
    }
        
    }



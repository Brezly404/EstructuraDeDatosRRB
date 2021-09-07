
import java.util.Scanner;

public class Vt {

	public static void main(String args[]) {
	
            Scanner rt = new Scanner (System.in);
        
            int datos[];
            int i,k,n;
            int suma;
	
            System.out.println("dame el tamaño del vector: ");
            int tam = rt.nextInt();
        
            datos = new int[tam];
	
            for (i=1;i<=tam;i++) {
	
                datos[i-1] = (int) (Math.floor(Math.random()*99+100));
		
            }
		suma = 0;
		for (k=1;k<=tam;k++) {
			suma = suma+datos[k-1];
			System.out.println(datos[k-1]);
                        System.out.println("");
		}
		System.out.println("la suma de los numeros es: "+suma);
               
	}


}


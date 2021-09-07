/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nxm_int_2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class NxM_int_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random rd = new Random();
        Scanner tr = new Scanner(System.in);
        
        System.out.println("Deme el valor N");
        int n =tr.nextInt();
        System.out.println("Deme el valor M");
        int m =tr.nextInt();
        
        int matriz[][] = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            
            //System.out.println("matriz"+" valor"+i); muestra el recorrido del arreglo [i]
            
            for (int j = 0; j < m; j++) {
                
                
                matriz[i][j] = rd.nextInt(100);
               
                //System.out.println("matriz"+matriz[i][j]+" valor"+j);
                //estos sout muestran el recorrido de la matriz para visualizar el recorrido de el arreglo [i][j]
                
            }
            
        }   
        
        System.out.println("La matriz "+n+" x "+m+" es la siguiente: ");
        
        String trys = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                
                trys= trys+"| "+matriz[i][j];
                
            }
            
            trys= trys+" |\n";
            
        }System.out.println(trys);
        
    }
    
    
    
    
    
    
    
}

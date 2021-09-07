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
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                
                matriz[i][j] = rd.nextInt(100);
                
                if (n>=m) {
                    
                    matriz[i][j]=rd.nextInt(100);
                    
                }else{
                    matriz[i][j]=rd.nextInt(100);
                }
                
            }
            
        }   
        
        System.out.println("La matriz "+n+" x "+m+" es la siguiente: ");
        
        String trys = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                trys= trys+"| "+matriz[i][j];
                
            }
            
            trys= trys+" |\n";
            
        }System.out.println(trys);
        
    }
    
    
    
    
    
    
    
}

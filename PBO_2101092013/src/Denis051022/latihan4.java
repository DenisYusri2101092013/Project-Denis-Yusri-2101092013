/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Denis051022;

/**
 *
 * @author ACER
 */
import java.io.*;
public class latihan4 {
    
    public static void main( String[] args ){ 

    BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) ); 
    String word1 = "";
    String word2 = "";
    String word3 ="";

    try{ 
        System.out.print("Masukkan kata 1    :\n"); 
        word1 = dataIn.readLine();
        
        System.out.print("Masukkan kata 2  :\n");
        word2 = dataIn.readLine();
        
         System.out.print("Masukkan kata 3 :\n");
        word3 = dataIn.readLine();
        }catch( IOException e ){ 
         System.out.println("Error!");        
    }
    System.out.println(word1 +" "+word2 +" "+word3); 
 
    }
}

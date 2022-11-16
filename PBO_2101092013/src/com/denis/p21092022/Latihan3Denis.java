/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.denis.p21092022;

/**
 *
 * @author ACER
 */
public class Latihan3Denis {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        int number3 = 45;
        int tertinggi;
        
        //cari nilai tertinggi
         tertinggi=(number2>number1)?number2:number1;
	 tertinggi=(number3>tertinggi)?number3:tertinggi;
         
         System.out.println("number 1 = " + number1);
         System.out.println("number 2 = " + number2);
         System.out.println("number 3 = " + number3);
	 System.out.println("Nilai tertingginya adalah angka = "+tertinggi);
     
        
        
    }
    
}

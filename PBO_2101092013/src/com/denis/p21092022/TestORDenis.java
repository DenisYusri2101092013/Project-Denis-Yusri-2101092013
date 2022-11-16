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
public class TestORDenis {
    public static void main( String[] args ){

        int i = 0;
        int j = 10;
        boolean test= false;
        int hasil;

        //demonstrasi ||
        test = (i < 10) || (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);

        //demonstrasi |
        test = (i < 10) | (j++ > 9);
        System.out.println(i);
        System.out.println(j); 

        System.out.println(test);
        
        hasil = ((6%2)*5)+(4/2)+88-10; 
        System.out.println(hasil);
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alnisa080323;

/**
 *
 * @author LENOVO
 */
public class Latihan3 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 23;
        int n3 = 5;
        int nb;
        
        nb = (n1>n2) ?n1: (n2>n3) ?n2: (n3>n1) ?n3:n1;
        
         System.out.println("Number 1 = " +n1);
         System.out.println("Number 2 = " +n2);
         System.out.println("Number 3 = " +n3);
         System.out.println("nilai terbesar = "+nb);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alnisa080323;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author LENOVO
 */
public class GetInputFromKeyboard {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader (System.in) );
        String name = "";
        int nilai = 0;
        
        try{
            System.out.println("Please enter your name: ");
            name = dataIn.readLine();
            System.out.println("Nilai Matematika: ");
            nilai = Integer.parseInt(dataIn.readLine());
        }
        catch( IOException e ) {
             System.out.println("Error!");
        }
         System.out.println("Hello " + name +"!");
         System.out.println("Nilai Matematika : "+nilai);
    }
    
}
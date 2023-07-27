/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alnisa150623;

/**
 *
 * @author LENOVO
 */
public class Student extends Person {
    public Student(){ 
        super( "Ani", "Padang" );
        System.out.println("Inside Student:Constructor");  
 }
    @Override
    public String getName(){
        System.out.println("Student: getName");
        return name;
    }
    
    public static void main(String[] args) {
        Student anna = new Student();
        anna.name = "Budi";
        anna.address = "Padang";
        System.out.println("Nama  "+anna.name);
    }
}
    
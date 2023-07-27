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
public class PolimorfisExample {
    public static void main(String[] args){
        Person ref;
        
        Student student = new Student();
        Employee employee = new Employee();
        
        student.setName("Ali");
        ref = student;
        System.out.println("Nama  "+ref.getName());
        ref = employee;
        System.out.println("Nama  "+ref.getName());
        
    }
    
}

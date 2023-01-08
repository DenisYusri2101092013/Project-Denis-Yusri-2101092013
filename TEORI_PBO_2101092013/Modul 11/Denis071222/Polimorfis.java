/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Denis071222;

import Denis301122.Employee;
import Denis301122.Person;

/**
 *
 * @author ACER
 */
public class Polimorfis {
    public static void main(String[] args){
        Person ref;
        Denis301122.Student student= new Denis301122.Student();
        Employee employee=new Employee();
        
        ref = student;
        String name = 
        ref.getName();
        System.out.println(name);
        //
        ref = employee;
        String name1 = ref.getName();
        System.out.println(name1);
        
        printInformation(student);
        printInformation(employee);
    }
    
    public static void printInformation(Person p){
        if(p instanceof Denis301122.Student){
            System.out.println("Nama Student : "+p.getName());
        }
        else if(p instanceof Employee ){
            System.out.println("Nama Employee : "+p.getName());
        }
    }
}

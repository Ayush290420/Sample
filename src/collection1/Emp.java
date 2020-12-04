/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection1;

import java.util.Objects;

/**
 *
 * @author AYUSH
 */
public class Emp implements Comparable{
private int age;
private String name;
private double sal;

    public Emp(int age, String name, double sal) {
        this.age = age;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" + "age=" + age + ", name=" + name + ", sal=" + sal + '}';
    }
   public boolean equals(Object o){
       Emp t=(Emp)o;
       if(this.age==t.age && this.name.equalsIgnoreCase(t.name) && this.sal==t.sal)
           return true;
       else 
           return false;
   } 
    @Override
    public int compareTo(Object o) {
       Emp t=(Emp)o;
       if(this.sal<t.sal)
           return 0;
       else
           return -1;
    }
   
 
    }
    
    


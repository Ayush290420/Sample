
package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class UseEmp {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        ArrayList<Emp> emplist=new ArrayList<>();
        Emp e1=new Emp(21,"Amit",50000);
        Emp e2=new Emp(22,"Sumit",20000);
        Emp e3=new Emp(23,"Ravi",40000);
        emplist.add(e1);
        emplist.add(e2);
        emplist.add(e3);
       for(Emp e:emplist){
        System.out.println(e);
       }
        //System.out.println("Enter detalis to remove an employ");
        //int age=kb.nextInt();
        //String name=kb.next();
        //double sal=kb.nextDouble();
        //Emp f=new Emp(age,name,sal);
        //System.out.println("The employ is removed "+emplist.remove(f));
        System.out.println("Before Sorting");
        Collections.sort(emplist);
         for(Emp n:emplist){
        System.out.println(n);
       }
       }
}

   

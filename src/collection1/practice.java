/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection1;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author AYUSH
 */
public class practice {
    
  
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
       LinkedList<String> l=new LinkedList<>();
        System.out.println("Enter 3 name");
        for(int i=0;i<3;i++){
            String str=kb.next();
            l.add(str);
        }
        for(String i:l){
            System.out.println(i);
        }
}
}

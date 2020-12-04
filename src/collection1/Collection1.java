
package collection1;

import java.util.ArrayList;
import java.util.Scanner;


public class Collection1 {

  
    public static void main(String[] args) {
       ArrayList<String> obj=new ArrayList<>();
       Scanner kb=new Scanner(System.in);
       for(int i=0;i<5;i++){ 
       System.out.println("Enter the names of 5 fruits");
       String str=kb.next();
       obj.add(i,str);
       }
       for(String x:obj){
           System.out.println(x);
           
       }
       int l=0;
        System.out.println("Enter a fruit name to be removed ");
        String p=kb.next();
        for(int i=0;i<5;i++){
        if(p.equalsIgnoreCase(obj.get(i))){
            System.out.println("Country Removed ="+obj.remove(i));
             l=-1;
            break;
        }
    }
        if(l!=-1){
            System.out.println("Fruit not found");
        }
         for(String x:obj){
           System.out.println(x);
           
       }
    }
    
    
}

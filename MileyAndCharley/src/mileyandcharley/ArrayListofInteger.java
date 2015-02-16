/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mileyandcharley;

/**
 *
 * @author Erin
 */
import java.util.*;
public class ArrayListofInteger {
    public static void main(String[] args){
        
        //TODO code application logic here
        ArrayList<Integer>arraylist=new ArrayList<Integer>();
        arraylist.add(40);
        arraylist.add(12);
        arraylist.add(18);
        arraylist.add(64);
        /*ArrayList before the sorting*/
        System.out.println("Before Sorting:");
        
        for(int counter: arraylist){
                System.out.println(counter);
        
        }
        /*Sorting of arraylist using Collections.sort*/
        Collections.sort(arraylist);
        
        /*ArrayLit after sorting*/
        System.out.println("After Sorting:");
        for(int counter: arraylist){
                System.out.println(counter);
            
        }
    
        
    }
    
}

/*
 * Project: Java 2 Programming exercise 19.9 
 * Name: Lauren Smith
 * Date: 3/3/21
 * Description: Generic method to sort an ArrayList 
 */
package pkg19.pkg9;

import java.util.ArrayList;


public class Main {
    //generic method to sort a generic arraylist 
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) 
    {
      //makes new arraylist to store sorted values 
      ArrayList<E> sorted=new ArrayList<E>(); 
      //declares generic var to track lowest in the list 
      E lowest; 
      //while the list that is being sorted has at least two elements 
      while(list.size()>1) 
      { 
         //sets lowest to index 0 of the list just as a place holder 
        lowest=list.get(0); 
        //loops through the whole list 
        for(int i=1; i<list.size(); i++) 
        {
            //if when comparing lowest to the element at index i returns a positive value 
            //means lowest is larger 
             if(lowest.compareTo(list.get(i))>0) 
             {
                 //sets lowest to the element at index i as it is smaller 
                 lowest=list.get(i); 
             }
        } 
        //adds the lowest element to index 0 of the sorted list  
        sorted.add(0,lowest);  
        //removes the added value from the original list so the while loop progresses
        list.remove(list.indexOf(lowest)); 
      } 
      //when the loop is done it adds the final highest amount to the top of the list 
      list.add(list.get(0));  
      //adds all of the sorted index into the original list  
      list.addAll(sorted); 
    }
}

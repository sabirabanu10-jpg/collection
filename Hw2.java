
package Collect;

import java.util.HashSet;
import java.util.Iterator;



public class Hw2 
{
    public static void main(String[] args)
    {
         HashSet ht=new HashSet();
         ht.add(10);
         ht.add(15);
         ht.add(10);
         ht.add(20);
         ht.add(25);
         System.out.println("ADDING ELEMENT (no duplicate) :" +ht);
         for(Object it:ht)
         {
             System.out.println(it);
         }
       boolean name=  ht.contains(20);
        System.out.println( "check if the element exits:" +name);
        ht.remove(25);
        System.out.println("Remove the element :" +ht);
        Iterator it= ht.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
   
  
    
}

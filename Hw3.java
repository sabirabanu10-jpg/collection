
package Collect;

import java.util.HashMap;
import static javax.management.Query.value;


public class Hw3 
{
    public static void main(String[] args) 
    {
        HashMap hm=new HashMap();
        hm.put(65,"Sabira");
        hm.put(66,"Shamila");
        hm.put(67,"Nandhu");
        hm.put(68,"Ranji");
        hm.put(69, "Hari");
        System.out.println("Retrive the value:" +hm.get(67));
        hm.put(70, "Aqsa");
        hm.remove(69, "Hari");
       hm.forEach((key,value)->System.out.println(key +"," +value));
}
}


package Collect;


import java.util.ArrayList;
public class Hwk1
{
    public static void main(String[] args)
    {
      ArrayList name=new ArrayList();
      name.add(10);
      name.add(15);
      name.add(20);
      name.add(25);
      name.add(30);
      System.out.println("FIRST FOUR ELEMENT ADDED" +name);
      name.add(5, 35);
        System.out.println("INSERT THE ELEMENT AT SPECIFIC INDEX" +name);
      name.remove(3);
        System.out.println("REMOVE THE ELEMENT BY VALUE:" +name);
        name.set(3, 47);
        System.out.println("UPDATE THE ELEMENT AT GIVEN INDEX:" +name);
        for(Object obj:name)
        {
            System.out.println(obj);  
        }
    }
  
    
}

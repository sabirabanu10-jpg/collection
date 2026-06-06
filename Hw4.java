







package Collect;

import java.util.Collection;

import java.util.LinkedList;
import java.util.Queue;


public class Hw4
{

    private static boolean value;
    public static void main(String[] args) 
    {
       Queue qu=new LinkedList();
       qu.offer(10);
       qu.offer(12);
       qu.offer(15);
        System.out.println(" Enque the element :"+qu);
       int removed= (int) qu.poll();
        System.out.println("deque the element" +removed);
        System.out.println("peek the front element" +qu.peek());
        for(Object obj:qu)
        {
            System.out.println("Display the element :" +qu);
        }
        boolean res= qu.contains(qu);
        System.out.println("check the empty or not" +res);
    }
}

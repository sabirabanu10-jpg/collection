
package Collect;


public class GenMain 
{
    static  void display()
    {
        System.out.println("hi");
    }
    public static void main(String[] args) 
    {
       SampleGeneric ip=new SampleGeneric("sabi",10);
       SampleGeneric ip1=new SampleGeneric(true,'a');
       SampleGeneric <Integer,Integer>ip2=new SampleGeneric<>(10,10);

        System.out.println(ip.getdata()); 
        System.out.println(ip1.getvalue());
      
        SampleGeneric.genericdisplay(100);
        
        display();
    }

    
}

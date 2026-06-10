
package Collect;


public class Cal <T extends Number>
        
{
    T number1,number2;
  
    void set( T a,T b)
    {
       number1=a;
       number2=b;
      
    }
    
    int add(T a,T b)
    {
        return a.intValue()+b.intValue();
    }
    int sub(T a,T b)
    {
        return a.intValue()+b.intValue();
    }
    
    double add1(T a,T b)
    {
     
     
        return a.doubleValue()+b.doubleValue();
     
     
    }
    double subtract(T a,T b)
    {
        return a.doubleValue()-b.doubleValue();
      
    }
    
    void display()
    {
        System.out.println(number1);
        System.out.println(number2);
    }
    
    
}

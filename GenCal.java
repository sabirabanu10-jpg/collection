
package Collect;

import java.util.Scanner;


public class GenCal 
{
      static Scanner sc=new Scanner(System.in);
    static Cal<Integer> ar=new  Cal<Integer>();
    static Cal<Double> sr=new  Cal<Double>();
    public static void main(String[] args)
    {
       
        menu();
    }
      static  void menu()
      {
         
            int choice;
           
            do
            {
                System.out.println("Generic Clculator");
                System.out.println("1.ADD ");
                System.out.println("2.SUBTRACT");
                System.out.println("3.display value");
                System.out.println("4.exit");
               System.out.println("enter the choice:");
                 choice=sc.nextInt();
                switch(choice)
                {
                    
                    case 1:
                    {
                        System.out.println(" 1.Integer");
                        System.out.println("2.double");
                        System.out.println("choose the choice:");
                        int choose=sc.nextInt();
                        if(choose==1)
                        {
                        System.out.println("enter the two  value :");
                        int a=sc.nextInt();
                        sc.nextLine();
                        int b=sc.nextInt();
                        ar.set(a,b);
                       
                         System.out.println("addition of integers");
                            System.out.println(ar.add(a, b)); 
                        }
                        else if(choose==2)
                        {
                            System.out.println("enter the two  value :");
                        double a=sc.nextDouble();
                        sc.nextLine();
                        double  b=sc.nextDouble();
                        sr.set(a,b);
                    
                        System.out.println("addition of doubles");
                        System.out.println( sr.add(a, b));
                            
                        }
                        else
                        {
                            System.out.println("no other choice");
                        }
                     
                        
                        break;
                       }

                    case 2:
                    {
                         System.out.println(" 1.Integer");
                        System.out.println("2.double");
                        System.out.println("choose the choice:");
                        int choose=sc.nextInt();
                        if(choose==1)
                        {
                        System.out.println("enter the two integer value :");
                        int a=sc.nextInt();
                        int b=sc.nextInt();
                        ar.set(a,b);
                       
                         System.out.println("subtraction  of integers");
                            System.out.println(ar.subtract(a, b)); 
                        }
                        else if(choose==2)
                        {
                            System.out.println("enter the  two double value :");
                        double a=sc.nextDouble();
                        double  b=sc.nextDouble();
                        sr.set(a,b);
                    
                        System.out.println("subtraction of doubles");
                        System.out.println( sr.subtract(a, b));
                            
                        }
                        else
                        {
                            System.out.println("no other choice");
                        }
                     
                         
                        break;
                    }
                    case 3:
                    {
                        ar.display();
                        sr.display();
                       break;
                    }
                    case 4:
                    {
                        System.out.println("exit"); 
                        break;
                    }
                    default:
                    {
                        System.out.println("invalid choice");
                    }
                
                    }
                    
                }while(choice!=4);
               }
}
            





    


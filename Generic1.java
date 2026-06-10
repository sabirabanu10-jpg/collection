
package Collect;

import java.util.Scanner;



public class Generic1 
{
    static Scanner sc=new Scanner(System.in);
    static Stores<Integer> ar= new Stores<Integer>();
     static Stores<String> sr=new Stores<String>();
    public static void main(String[] args)
    {
       
        menu();
    }
      static  void menu()
      {
         
            int choice;
                   
            do
            {
                System.out.println("Generic Storage box");
                System.out.println("1.store integer ");
                System.out.println("2.store string");
                System.out.println("3.display value");
                System.out.println("4.exit");
               System.out.println("enter the choice:");
                 choice=sc.nextInt();
                switch(choice)
                {
                    case 1:
                    {
                        System.out.println("enter the intger value :");
                        int number=sc.nextInt();
                        ar.setvalue(number);
                        
                        break;
                       }
                    case 2:
                    {
                        System.out.println("enter the string value  :");
                        sc.nextLine();
                       String st=sc.nextLine();
                       sr.setvalue(st);
                        
                        break;
                    }
                    case 3:
                    {
                        System.out.println(" integer value :" +ar.getdata());
                        System.out.println("String values :" +sr.getdata());
                       break;
                    }
                    case 4:
                    {
                        System.out.println("exit"); 
                        break;
                    }
                
                    }
                    
                }while(choice!=3);
               }
}
            
      




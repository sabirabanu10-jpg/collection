package Collect;

import static Collect.Traffic.RED;
import java.util.Scanner;


public class Enumhw1 
{
  static  Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
        menu();
        
    }
  static   void menu()
  {
   int choice;
  do
  {
     
        System.out.println("TRAFFIC SIGNAL");
        System.out.println("1.show signal  meaning");
        System.out.println("2.check stop or go");
        System.out.println("3.exit");
        System.out.println("enter the choice :");
        choice =sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("\n signal  meaning");
                System.out.println("Red->stop");
                System.out.println("Green->go");
                System.out.println("Yellow->ready");
                break;
            }
            
            case 2:
            {
                System.out.println("enter the signal (RED/YELLOW/GREEN):");
                String signal =sc.next().toUpperCase();
                Traffic tr= Traffic.valueOf(signal);
                switch(tr)
                {
                    case RED:
                    {
                        System.out.println("stop");
                        break;
                    }
                    case YELLOW:
                    {
                        System.out.println(" ready");
                        break;
                    }
                    case GREEN:
                    {
                        System.out.println("go");
                        break;
                    }
                }
                break;
                        
                    
            }
            case 3:
            {
                System.out.println("exit");
                          
                                    
            }
            default:
            {
                System.out.println("invalid choice");
            }
              
  }
  }while(choice !=3);

  }
            
      
  }

        
  
    


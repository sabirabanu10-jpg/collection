
package Collect;

import java.util.Scanner;

public class DaysMain
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        menu();
    }
      static void menu()
      {
         
            int choice;
                   
            do
            {
                System.out.println("DAY OF WEEKS");
                System.out.println("1.check if the day is working");
                System.out.println("2.check if the day is weekend");
                System.out.println("3.display all the days");
                System.out.println("4.exit");
               System.out.println("enter the choice:");
                 choice=sc.nextInt();
                switch(choice)
                {
                    case 1:
                    {
                        
                        System.out.println("enter the days:");
                        Dayofweek dy=Dayofweek.valueOf(sc.next().toUpperCase());
                        if(dy==dy.SATURDAY||dy==dy.SUNDAY)
                        {
                            System.out.println("not working days");
                            
                        }
                        else
                        {
                            System.out.println("working days");
                        }
                        break;
                       }
                    case 2:
                    {
                        System.out.println("enter the days:");
                        Dayofweek dy=Dayofweek.valueOf(sc.next().toUpperCase());
                        if(dy==dy.SATURDAY||dy==dy.SUNDAY)
                        {
                            System.out.println("weekend");
                            
                        }
                        else
                        {
                            System.out.println("not weekend");
                        }
                        break;
                    }
                    case 3:
                    {
                        System.out.println("exit");
                        break;
                    }
                
                    }
                    
                }while(choice!=3);
               }
            }
      



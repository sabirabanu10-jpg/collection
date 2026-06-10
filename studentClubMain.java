
package Collect;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class studentClubMain 
{   
   static  Scanner sc= new Scanner(System.in);
   
    public static void main(String[] args) 
    {
        
       Set<String> hs=new HashSet <>();
       menu( hs);
    }
   static void menu(Set<String> hs)
   {
       int choice;
    
       do{
         
         System.out.println("STUDENT CLUB MANAGEMENT");
          System.out.println("1.Add member");
         System.out.println("2.Remove member");
          System.out.println("3.SEarch member");
         System.out.println("4.Display member");
           System.out.println("5.total no of members");
       System.out.println("6.exit");
       System.out.println("enter the choice:");
       choice=sc.nextInt();
       switch(choice)
       {
           case 1:
           {
              
               System.out.println("enter the member :");
               String mem=sc.nextLine();
               sc.nextLine();
                if(hs.contains(mem))
               {
                   System.out.println("member already exit");
               }
               else
               {
                  hs.add(mem);
                  
                   System.out.println("member is addedd");
               }
               
               break; 
             }
             
           
           case 2:
           {
           System.out.println("enter the member to remove :");
            String newm=sc.nextLine();
               sc.nextLine();
               
               if(hs.remove(newm))
               {
                   System.out.println("member  removed successfully");
               }
               else
               {
                  
                   System.out.println("member is  not removed");
               }
               
               break; 
               
           }
           case 3:
           {
               System.out.println("enter the search name:");
               String searchname=sc.nextLine();
               sc.nextLine();
               
               if(hs.contains(searchname))
               {
                   System.out.println("member is present in club");
               }
               else
               {
                  
                   System.out.println("member  not found");
               }
               
               break; 
               
           }
           case 4:
           {
               if(hs.isEmpty())
               {
                   System.out.println("no member is found");
               }
               else
               {
                   for(Object obj:hs)
                   {
                       System.out.println(obj);
                   }
               }
               break;
           }
           case 5:
           {
               System.out.println("Total no of memebers" +hs.size());
               break;
           }
           case 6:
           {
               System.out.println("exit");
            
           }
       }
       
       }while(choice!= 6);
   
       }
       
   
       }
    
    

       
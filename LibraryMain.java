
package Collect;

import static Collect.StudentMain.sc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class LibraryMain
{
static  Scanner sc=new Scanner(System.in);
    

    public static void main(String[] args)
    {
        ArrayList<Book> ar=new ArrayList<> ();
        menu( ar);
    }
  static void menu( ArrayList<Book> ar)
 
  {
      
  boolean result=true;
     
     
    do  {
            System.out.println("LIBRARY MANAGEMENT DETAILS ");
            System.out.println("1.add the book");
            System.out.println("2.view all the book");
            System.out.println("3.search the book");
            System.out.println("4.issue the book");
            System.out.println("5.return the book");
            System.out.println("6.delete the book");
            System.out.println("7.exit");
            System.out.println("ENTER THE CHOICE:");
            int choice=sc.nextInt();
        if(choice==1)
            {
                System.out.println("enter the  book_id:"); 
                int book_id=sc.nextInt();
                sc.nextLine();
                System.out.println("enter the book title:"); 
                String title=sc.nextLine();
                System.out.println("enter the book author:");
                String author=sc.nextLine();
                
                
              Book  bk = new Book(book_id,title,author);
                ar.add(bk);
                
                System.out.println(bk.toString());
                System.out.println("booked added successfully");
               
            }
            else if(choice==2)
                
              {
                    if(ar.isEmpty())
                    {
                        System.out.println("no book is available");
                    }
                    else
                    {
                      Iterator it=ar.iterator();
                        {
                            while(it.hasNext())
                            {
                                System.out.println(it.next());
                            }
                        }
                    }
                  }
            else if(choice==3)
            {
                System.out.println("enter the book_id:");
                int book_id=sc.nextInt();
                boolean found=false;
                for(int i=0;i<ar.size();i++)
                {
                   if(ar.get(i).book_id==book_id)
                   {
                        System.out.println( ar.get(i));
                        found =true;
                        break;
                   }
                }
                if(found=false)
                   {
                       System.out.println("book not found");
                   }
               }
            else if(choice==4)
            {
                System.out.println("enter the book_id:");
                int book_id=sc.nextInt();
                boolean found=false;
                for(Book b:ar)
                {
                   if(b.book_id==book_id)
                   {
                        
                        found =true;
                      
                        if(b.status.equals("available"))
                        {
                   
                        b.status="issued";
                            System.out.println("issued successfully");
                               
                        }
                        else
                        {
                            System.out.println("book already avaiable");
                        }
                        break;
                   }
                }
                
                if(found=false)
                   {
                       System.out.println("book not found");
                   }
               
            }
            else if(choice==5)
                {
                     
                 System.out.println("enter the book_id:");
                int book_id=sc.nextInt();
                boolean found=false;
                for(Book b:ar)
                {
                   if(b.book_id==book_id)
                   {
                        
                        found =true;
                       
                        if(b.status.equals("available"))
                        {
                   
                        b.status="issued";
                            System.out.println("return successfully");
                               
                        }
                        else
                        {
                            System.out.println("book not returned");
                            
                        }
                        break;
                        
                   }
                }
                
                if(found=false)
                   {
                       System.out.println("book not found");
                   }
                    }
                  
            else if(choice==7)  
            {
                
                  System.out.println("enter the book_id:");
                int book_id=sc.nextInt();
                boolean found=false;
                for(int i=0;i<ar.size();i++)
                {
                   if(ar.get(i).book_id==book_id)
                   {
                       
                         ar.remove(i);
                        System.out.println("booked removed");
                        found =true;
                        break;

                    }
                   else
                   {
                       System.out.println("book not removed");
                   }
                   break;
                }
                if(found=false)
                {
                    System.out.println("book not found");
                }
            }
            else if(choice==7)
            {
                System.out.println("exit");
                result=false;
            }
    }while(result);
                
            
  }
}
           
             
            



package Collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class StudentMain
{
   static  Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) 
    {
       ArrayList<Student> ar=new ArrayList<> ();
      menu( ar);
    }
  static void menu( ArrayList<Student> ar)
 
  {
      
  boolean result=true;
     
     
    do  {
            System.out.println("STUDENT MANAGEMENT DETAILS ");
            System.out.println("1.add the student");
            System.out.println("2.view all the student");
            System.out.println("3.search the student roll no");
            System.out.println("4.update the marks");
            System.out.println("5.delete the student");
            System.out.println("6.exit");
            System.out.println("ENTER THE CHOICE:");
            int choice=sc.nextInt();
            if(choice==1)
            {
                System.out.println("enter the student roll no:"); 
                int Roll_No=sc.nextInt();
                sc.nextLine();
                System.out.println("enter the student name:"); 
                String name=sc.nextLine();
                System.out.println("enter the student marks:");
                int marks=sc.nextInt();
                sc.nextLine();
                System.out.println("enter the age :");
                int age=sc.nextInt();
                sc.nextLine();
                System.out.println("enter the course:");
                String course=sc.nextLine();
                Student st=new Student(Roll_No,name,marks,age,course);
                ar.add(st);
                
                System.out.println(st.toString());
               
            }
            else if(choice==2)
                  {
                    if(ar.isEmpty())
                    {
                        System.out.println("student detail is empty");
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
                System.out.println("enter the roll_no:");
                int roll_no=sc.nextInt();
                boolean found=false;
                for(int i=0;i<ar.size();i++)
                {
                   if(ar.get(i).Roll_no==roll_no)
                   {
                        System.out.println( ar.get(i));
                        found =true;
                        break;
                   }
                }
                if(found=false)
                   {
                       System.out.println("student not found");
                   }
                }
            
            else if(choice==4)
            {
                System.out.println("enter the roll no :");
                int Roll_no=sc.nextInt();
                boolean found=false;
                for(Student st:ar)
                {
                    if(st.Roll_no==Roll_no)
                    {
                        System.out.println("enter the new marks");
                        int marks=sc.nextInt();
                        st.marks=marks;
                        System.out.println("marks update");
                        found=true;
                        break;
                    }
                }
                   if(found=false)
                    {
                        System.out.println("student not found");
                    }
                }
              
            
            else if(choice==5)
            {
                System.out.println("enter the roll no :");
                int Roll_no=sc.nextInt();
                boolean found=false;
                for(int i=0;i<ar.size();i++)
                {
                    if(ar.get(i).Roll_no==Roll_no)
                    {
                        ar.remove(i);
                        System.out.println("student deleted");
                        found=true;
                        break;
                    }
                }
                if(found=false)
                    {
                        System.out.println("student not found");
                    }
                }
           
            else if(choice==6)
            {
                System.out.println("exit");
                break;
            }
            else
            {
                System.out.println("invlaid choice");
                result=false;
            }
        }while(result);
  }

    
    
 
}



package Collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmpFileMain
{
static Scanner sc=new Scanner(System.in);
   public static void main(String[] args)
   {
        ArrayList<EmpFile> ar=new ArrayList<> ();
        menu( ar);
    }
  static void menu( ArrayList<EmpFile> ar)
 
  {
      
  boolean result=true;
     
     
    do  {
            System.out.println("Employee MANAGEMENT DETAILS ");
            System.out.println("1.add the employee");
            System.out.println("2.view all the employee");
            System.out.println("3.search the employeeid");
            System.out.println("4.update basic salary");
            System.out.println("5.calculate the net salary");
            System.out.println("6.delete the employee");
            System.out.println("7.exit");
            System.out.println("ENTER THE CHOICE:");
            int choice=sc.nextInt();
        if(choice==1)
            {
                System.out.println("enter the  employee name:"); 
                String name=sc.nextLine();
                sc.nextLine();
                System.out.println("enter the dept:");
                String dep=sc.nextLine();
                sc.nextLine();
                System.out.println("enter the employee id"); 
                int emp_id=sc.nextInt();
                sc.nextLine();
                System.out.println("enter the salary:");
                double basicsalary=sc.nextInt();
                
                
              EmpFile ep = new EmpFile(name,emp_id,dep,basicsalary);
                ar.add(ep);
                
                System.out.println(ep.toString());
                System.out.println("employee details  added successfully");
               
            }
            else if(choice==2)
                
              {
                    if(ar.isEmpty())
                    {
                        System.out.println("no employeeis available");
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
                System.out.println("enter the emp_id:");
                int emp_id=sc.nextInt();
                boolean found=false;
                for(int i=0;i<ar.size();i++)
                {
                  if(ar.get(i).emp_id==emp_id)
                      {
                          System.out.println(ar.get(i));
                          found=true;
                      }
                  break;
                       }
                if(found=false)
                   {
                       System.out.println("no employee  found"); 
                  }
            }
            else if(choice==4)
            {
              System.out.println("enter the emp_id:");
                int emp_id=sc.nextInt();
                boolean found=false;
                for (EmpFile e:ar)
                {
                    if(e.emp_id==emp_id)
                    {
                    System.out.println("enter the new salary:");
                    int sal=sc.nextInt();
                    e.basicsalary=sal;
                        System.out.println("updated the salary");
                   }
                    break;
               }
                if(found=false)
                {
                    System.out.println("no employee found");
                }
                
            }
            else if(choice==5)
            {
                System.out.println("enter the emp_id:");
                int emp_id=sc.nextInt();
                boolean found=false;
                for (EmpFile e:ar)
                {
                    if(e.emp_id==emp_id)
                    {
                       double HRA =20% e.basicsalary;
                       double DA=10% e.basicsalary;
                       double PF =5%e.hashCode();                      
                    double netsalary=e.basicsalary+HRA+DA-PF;
                        System.out.println(netsalary);   
                    }
                    break;
                }
                if(found=false)
                {
                    System.out.println("no employee found");
                }
                }
            else if(choice==6)
            {
               System.out.println("enter the emp_id:");
                int emp_id=sc.nextInt();
                boolean found=false;
                for(EmpFile e:ar)
                {
                  if(e.emp_id==emp_id)
                      {
                          ar.remove(e);
                          System.out.println("removed successfully");
                          found=true;
                      }
                  break;
                       }
                if(found=false)
                   {
                       System.out.println("no employee  found"); 
                  }
             }
            else if(choice==7)
            {
                System.out.println("exit");
            }
        else
            {
                System.out.println("invalid choice");
                result=false;
            }
    }while(result);
  }
}
            



      


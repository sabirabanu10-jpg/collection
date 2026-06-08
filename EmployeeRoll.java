
package Collect;

public class EmployeeRoll 
{
     int emp_id;
         String name;
         int sal;
         int netsalary;
         
         
  

    EmployeeRoll (int emp_id, String name,int sal)
    {
        this(name, emp_id, sal);
     
   
    
    }

    EmployeeRoll(String name, int emp_id, int sal) {
        this.emp_id = emp_id;
        this.name = name;
        this.sal = sal;
    }
     @Override   
     public String toString()
     {
         return emp_id+ " "  +name+" "  + sal+ " "  +netsalary ;
     }
   
}



package Collect;

public class EmpFile 
{
     int emp_id;
         String name;
         String dep;
         double basicsalary;
         double netsalary;
         
  

   

    EmpFile(String name, int emp_id, String dep,double basicsalary) {
        this.emp_id = emp_id;
        this.name = name;
        this.dep=dep;
        this.basicsalary=basicsalary;
    }
     @Override   
     public String toString()
     {
         return emp_id+ " "  +name+" " + dep+" " + basicsalary+ " "  +netsalary ;
     }
   
}


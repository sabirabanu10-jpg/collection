
package Collect;


class Student 
{
         int Roll_no;
          String name;
          int marks;
          int age;
         String course;
         
  

     Student(int Roll_no, String name,int marks, int age, String course)
    {
        this(Roll_no, name, course);
    
    }

    Student(int Roll_no, String name, String course) {
        this.Roll_no = Roll_no;
        this.name = name;
        this.marks=marks;
        this.age=age;
        this.course = course;
    }
       
     @Override 
     public String toString()
     {
         return Roll_no + " "  +name +" "  + marks + " "  + age + "  " + course;
     }
   
}

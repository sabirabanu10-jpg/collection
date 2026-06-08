
package Collect;


public class Book 
{
         int book_id;
         String title;
         String author;
         String status;
         
  

     Book(int book_id, String title,String author)
    {
     this.book_id=book_id;
     this.title=title;
     this.author=author;
     this.status="available";
   
    
    }
     @Override   
     public String toString()
     {
         return book_id+ " "  +title+" "  + author+ " "  +status ;
     }
   
}



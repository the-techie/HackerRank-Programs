import java.util.*;

abstract class Book{
    String title;
    String author;
    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();
}
//Write MyBook Class
class MyBook extends Book{
    String title, author;
    int price;
    MyBook(String title, String author, int price){
        super(title, author);
        this.price = price;
        this.title = title;
        this.author = author;
    }
    void display(){
        System.out.println("Title: "+title+"\nAuthor: "+author+"\nPrice: "+price);
    }
}
public class AbstractClassDemo{
   public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      String title=sc.nextLine();
      String author=sc.nextLine();
      int price=sc.nextInt();
      Book new_novel=new MyBook(title,author,price);
      new_novel.display();
   }
}

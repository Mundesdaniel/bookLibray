//Book and Magazine Classes:
//
//Create two abstract classes, Book and Magazine, that implement the LibraryResource interface. These classes should:
//Implement the necessary methods from the LibraryResource interface.
//Store basic resource-related information such as title, author, rental fee, and type (book or magazine).
//Maintain a list of members who have borrowed these resources using an array or ArrayList.

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public abstract class Book implements LibraryResource {
    private String title;
    private String author;
    private double rentalFee;
    private List<String> members;


    public Book(String title, String author, double rentalFee){
        this.title = title;
        this.author = author;
        this.rentalFee = rentalFee;
        this.members = new ArrayList<>();


    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getRentalFee() {
        return rentalFee;
    }
@Override
   public void printResourceDetails(){
    System.out.println("This is Details" + title + author);

   }
   @Override
   public void borrowResource(Member member){
       System.out.println("We rent books at a fee od "+author + rentalFee+ title);



   }
   @Override
   public void returnResource(Member member){


   }

}

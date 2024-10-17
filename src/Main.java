//LibraryResource Interface:
//
//Define a LibraryResource interface with the following methods:
//String getTitle()
//String getAuthor()
//double getRentalFee()
//void printResourceDetails()
//void printBorrowedBy()
//void borrowResource(Member member)
//void returnResource(Member member)
//
//
//Book and Magazine Classes:
//
//Create two abstract classes, Book and Magazine, that implement the LibraryResource interface. These classes should:
//Implement the necessary methods from the LibraryResource interface.
//Store basic resource-related information such as title, author, rental fee, and type (book or magazine).
//Maintain a list of members who have borrowed these resources using an array or ArrayList.
//
//
//Member Class:
//
//Define a Member class to store basic member information such as name, age, and member ID.
//
//
//Resource Implementations:
//
//Create two concrete classes:
//FictionBook, which extends Book.
//FashionMagazine, which extends Magazine.
//Each class should define specific resource-related fields and implement any abstract methods.
//
//
//Main Program:
//
//In the main program, create 10 instances of the Member class and assign some of them to either borrow FictionBook or FashionMagazine.
//After borrowing and returning some resources, print out the details of the resources and which members have borrowed them.
//
//Upload to github after you done.
//If you upload your codes after deadline it will count as a fail

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
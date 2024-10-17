//Member Class:
//
//Define a Member class to store basic member information such as name,
// age, and member ID.
//
//
//Resource Implementations:
//
//Create two concrete classes:
//FictionBook, which extends Book.
//FashionMagazine, which extends Magazine.
//Each class should define specific resource-related fields and implement any abstract methods.
//

public class Member implements LibraryResource {
    private String name;
    private int age;
    private int id;

    public Member(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
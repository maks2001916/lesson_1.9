public class Book {
   String name;
   Author author;
   int year;



    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    private String getName() {
        return this.name;
    }

    private Author getAuthor() {
        return this.author;
    }

    private int grtYear() {
        return  this.year;
    }

    void setYear(int year) {
        this.year = year;
    }
}


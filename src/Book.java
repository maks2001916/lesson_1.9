public class Book {
   String name;
   Author author;
   int year;



    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int grtYear() {
        return  this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}


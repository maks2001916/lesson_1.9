public class Main {
    Book book = new Book("tiile", new Author("Ivan", "Ivanov"), 2022);
    Book origami4 = new Book("origami4", new Author("Robert", "J.Leng"), 2009);
    origami4.setYear(2015);


    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
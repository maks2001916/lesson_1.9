public class Main {




    public static void main(String[] args) {
        System.out.println("Hello world!");
        Book book = new Book("tiile", new Author("Ivan", "Ivanov"), 2022);
        Book origami4 = new Book("origami4", new Author("Robert", "J.Leng"), 2009);
        origami4.setYear(2015);
        System.out.println(book);
        System.out.println(origami4);
        System.out.println(book.equals(origami4));
    }

}
package ch21;

public class BookTest {

    public static void main(String[] args) {

        Book[] library = new Book[5];

        /*for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }*/

        library[0] = new Book("King1", "Rick");
        library[1] = new Book("King2", "Rick");
        library[2] = new Book("King3", "Rick");
        library[3] = new Book("King4", "Rick");
        library[4] = new Book("King5", "Rick");

        for (Book book : library) {
            System.out.println(book);
            book.showInfo();
        }


    }
}

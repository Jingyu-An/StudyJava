package ch23;

import ch21.Book;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<>();

        library.add(new Book("King", "Nick"));
        library.add(new Book("King", "Nick"));
        library.add(new Book("King", "Nick"));
        library.add(new Book("King", "Nick"));
        library.add(new Book("King", "Nick"));

        for (int i = 0; i < library.size(); i++) {
            library.get(i).showInfo();
        }
    }
}

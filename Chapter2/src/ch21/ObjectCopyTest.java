package ch21;

public class ObjectCopyTest {

    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("King1", "Rick");
        library[1] = new Book("King2", "Rick");
        library[2] = new Book("King3", "Rick");
        library[3] = new Book("King4", "Rick");
        library[4] = new Book("King5", "Rick");

        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        for (int i = 0; i < library.length; i++) {
            copyLibrary[i].setTitle(library[i].getTitle());
            copyLibrary[i].setAuthor(library[i].getAuthor());
        }

        //System.arraycopy(library,0,copyLibrary,0,5);

        library[0].setAuthor("Nick");
        library[0].setTitle("Queen");

        System.out.println("=====library=====");
        for (Book book : library) {
            System.out.println(book);
            book.showInfo();
        }

        System.out.println("=====copyLibrary=====");
        for (Book book : copyLibrary) {
            System.out.println(book);
            book.showInfo();
        }


    }
}

class Library {
    String libraryName;
    Library(String libraryName) {
        this.libraryName = libraryName;
    }
    class Book {
        private String title;
        private String author;
        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public void displayBookInfo() {
            System.out.println("Library: " + libraryName);
            System.out.println("Book Title: " + title);
            System.out.println("Author: " + author);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Library myLibrary = new Library("Central Library");

        Library.Book myBook = myLibrary.new Book("1984", "George Orwell");
        myBook.displayBookInfo();
    }
}

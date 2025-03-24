package Nivell1.Exercici1.entities;

import java.util.ArrayList;
import java.util.Comparator;

public class Library {

    private static ArrayList<Book> books = new ArrayList<>();

    public static void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
            books.sort(Comparator.comparing(Book::getTitle));
        }
    }

    public static ArrayList<Book> getBooks() {
        return books;
    }

    public static String getTitle(int index) {
        return books.get(index).getTitle();
    }

    public static void addBookAtIndex(int index, Book book) {
        if (index >= 0 && index < books.size()) {
            books.add(index, book);
        }
    }

    public static Book getBookFromIndex(int index) {
        return books.get(index);
    }

    public static void removeBook(String title) {
        books.removeIf(book -> title.equals(book.getTitle()));
    }
}

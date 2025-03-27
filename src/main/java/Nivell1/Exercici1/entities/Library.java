package Nivell1.Exercici1.entities;

import java.util.ArrayList;
import java.util.Comparator;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
            books.sort(Comparator.comparing(Book::getTitle));
        }
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public String getTitle(int index) {
        return books.get(index).getTitle();
    }

    public void addBookAtIndex(int index, Book book) {
        if (index >= 0 && index < books.size()) {
            books.add(index, book);
        }
    }

    public Book getBookFromIndex(int index) {
        return books.get(index);
    }

    public void removeBook(String title) {
        books.removeIf(book -> title.equals(book.getTitle()));
    }
}

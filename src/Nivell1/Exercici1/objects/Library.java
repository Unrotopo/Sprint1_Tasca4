package Nivell1.Exercici1.objects;

import java.util.HashSet;
import java.util.Set;

public class Library {

    private static HashSet<Book> books;

    public Library() {}

    public static void setBooks(HashSet<Book> books) {
        Library.books = books;
    }

    public static Set<Book> getBooks() {
        return books;
    }
}

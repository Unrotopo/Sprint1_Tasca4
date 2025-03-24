package Nivell1.Exercici1;

import Nivell1.Exercici1.entities.Book;
import Nivell1.Exercici1.entities.Library;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


class Tests {

    @Test
    void listNotEmpty() {

        Library.addBook(new Book("La insoportable levedad del ser"));
        assertFalse(Library.getBooks().isEmpty(), "There should be at least one book");
    }

    @Test
    void listSizeCorrect() {

        Library.addBook(new Book("Política"));
        Library.addBook(new Book("El banquete"));
        Library.addBook(new Book("Teeteto"));
        assertEquals(3, Library.getBooks().size(), "There should be 3 elements");
    }

    @Test
    void correctBookPosition() {

        Library.addBook(new Book("Política"));
        Library.addBook(new Book("El banquete"));
        Library.addBook(new Book("Teeteto"));
        Library.addBookAtIndex(1, new Book("La insoportable levedad del ser"));
        assertEquals("La insoportable levedad del ser", Library.getTitle(1));
        assertEquals("Política", Library.getTitle(2));
    }

    @Test
    void notDuplicateBooks() {

        Library.addBook(new Book("Política"));
        Library.addBook(new Book("El banquete"));
        Library.addBook(new Book("Teeteto"));
        Library.addBook(new Book("Política"));
        ArrayList<Book> seenBooks = new ArrayList<>();
        for (Book book : Library.getBooks()) {
            if (!seenBooks.contains(book)) {
                seenBooks.add(book);
            }
        }
        assertEquals(seenBooks, Library.getBooks());
    }

    @Test
    void getBookFromIndex() {

        Library.addBook(new Book("Política"));
        Library.addBook(new Book("El banquete"));
        Library.addBook(new Book("Teeteto"));
        assertEquals("Teeteto", Library.getBookFromIndex(2).getTitle());
    }

    @Test
    void addingABookModifiesTheList() {

        Library.addBook(new Book("Política"));
        Library.addBook(new Book("El banquete"));
        Library.addBook(new Book("Teeteto"));
        assertEquals(3, Library.getBooks().size());

        Library.addBook(new Book("La insoportable levedad del ser"));
        assertEquals(4, Library.getBooks().size());

        Library.addBookAtIndex(1, new Book("Ciclonopedia"));
        assertEquals(5, Library.getBooks().size());
        assertEquals("Ciclonopedia", Library.getBookFromIndex(1).getTitle());
        assertEquals("Teeteto", Library.getBookFromIndex(4).getTitle());
    }

    @Test
    void removingABookReducesTheList() {

        Library.addBook(new Book("Política"));
        Library.addBook(new Book("El banquete"));
        Library.addBook(new Book("Teeteto"));
        assertEquals(3, Library.getBooks().size());

        Library.removeBook("El banquete");
        assertEquals(2, Library.getBooks().size());
    }

    @Test
    void listRemainsSorted() {

        Library.addBook(new Book("Política"));
        Library.addBook(new Book("El banquete"));
        Library.addBook(new Book("Teeteto"));
        Library.addBook(new Book("La insoportable levedad del ser"));

        assertEquals("El banquete", Library.getBookFromIndex(0).getTitle());
        assertEquals("La insoportable levedad del ser", Library.getBookFromIndex(1).getTitle());
        assertEquals("Política", Library.getBookFromIndex(2).getTitle());
        assertEquals("Teeteto", Library.getBookFromIndex(3).getTitle());

        Library.addBook(new Book("Ciclonopedia"));

        assertEquals("Ciclonopedia", Library.getBookFromIndex(0).getTitle());
        assertEquals("La insoportable levedad del ser", Library.getBookFromIndex(2).getTitle());
        assertEquals("Política", Library.getBookFromIndex(3).getTitle());
        assertEquals("Teeteto", Library.getBookFromIndex(4).getTitle());

        Library.removeBook("La insoportable levedad del ser");

        assertEquals("Política", Library.getBookFromIndex(2).getTitle());
        assertEquals("Teeteto", Library.getBookFromIndex(3).getTitle());
    }
}

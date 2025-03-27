package Nivell1.Exercici1;

import Nivell1.Exercici1.entities.Book;
import Nivell1.Exercici1.entities.Library;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


class Tests {

    Library library = new Library();

    @Test
    void listNotEmpty() {

        library.addBook(new Book("La insoportable levedad del ser"));
        assertFalse(library.getBooks().isEmpty(), "There should be at least one book");
    }

    @Test
    void listSizeCorrect() {

        library.addBook(new Book("Política"));
        library.addBook(new Book("El banquete"));
        library.addBook(new Book("Teeteto"));
        assertEquals(3, library.getBooks().size(), "There should be 3 elements");
    }

    @Test
    void correctBookPosition() {

        library.addBook(new Book("Política"));
        library.addBook(new Book("El banquete"));
        library.addBook(new Book("Teeteto"));
        library.addBookAtIndex(1, new Book("La insoportable levedad del ser"));
        assertEquals("La insoportable levedad del ser", library.getTitle(1));
        assertEquals("Política", library.getTitle(2));
    }

    @Test
    void notDuplicateBooks() {

        library.addBook(new Book("Política"));
        library.addBook(new Book("El banquete"));
        library.addBook(new Book("Teeteto"));
        library.addBook(new Book("Política"));
        ArrayList<Book> seenBooks = new ArrayList<>();
        for (Book book : library.getBooks()) {
            if (!seenBooks.contains(book)) {
                seenBooks.add(book);
            }
        }
        assertEquals(seenBooks, library.getBooks());
    }

    @Test
    void getBookFromIndex() {

        library.addBook(new Book("Política"));
        library.addBook(new Book("El banquete"));
        library.addBook(new Book("Teeteto"));
        assertEquals("Teeteto", library.getBookFromIndex(2).getTitle());
    }

    @Test
    void addingABookModifiesTheList() {

        library.addBook(new Book("Política"));
        library.addBook(new Book("El banquete"));
        library.addBook(new Book("Teeteto"));
        assertEquals(3, library.getBooks().size());

        library.addBook(new Book("La insoportable levedad del ser"));
        assertEquals(4, library.getBooks().size());

        library.addBookAtIndex(1, new Book("Ciclonopedia"));
        assertEquals(5, library.getBooks().size());
        assertEquals("Ciclonopedia", library.getBookFromIndex(1).getTitle());
        assertEquals("Teeteto", library.getBookFromIndex(4).getTitle());
    }

    @Test
    void removingABookReducesTheList() {

        library.addBook(new Book("Política"));
        library.addBook(new Book("El banquete"));
        library.addBook(new Book("Teeteto"));
        assertEquals(3, library.getBooks().size());

        library.removeBook("El banquete");
        assertEquals(2, library.getBooks().size());
    }

    @Test
    void listRemainsSorted() {

        library.addBook(new Book("Política"));
        library.addBook(new Book("El banquete"));
        library.addBook(new Book("Teeteto"));
        library.addBook(new Book("La insoportable levedad del ser"));

        assertEquals("El banquete", library.getBookFromIndex(0).getTitle());
        assertEquals("La insoportable levedad del ser", library.getBookFromIndex(1).getTitle());
        assertEquals("Política", library.getBookFromIndex(2).getTitle());
        assertEquals("Teeteto", library.getBookFromIndex(3).getTitle());

        library.addBook(new Book("Ciclonopedia"));

        assertEquals("Ciclonopedia", library.getBookFromIndex(0).getTitle());
        assertEquals("La insoportable levedad del ser", library.getBookFromIndex(2).getTitle());
        assertEquals("Política", library.getBookFromIndex(3).getTitle());
        assertEquals("Teeteto", library.getBookFromIndex(4).getTitle());

        library.removeBook("La insoportable levedad del ser");

        assertEquals("Política", library.getBookFromIndex(2).getTitle());
        assertEquals("Teeteto", library.getBookFromIndex(3).getTitle());
    }
}

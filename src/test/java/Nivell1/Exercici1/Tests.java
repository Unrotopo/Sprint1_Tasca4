package Nivell1.Exercici1;

import Nivell1.Exercici1.entities.Book;
import Nivell1.Exercici1.entities.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


class Tests {

    Library library = new Library();

    @BeforeEach
    public void initializeLibrrary() {
        library.addBook(new Book("Política"));
        library.addBook(new Book("El banquete"));
        library.addBook(new Book("Teeteto"));
    }

    @Test
    void givenEmptyLibrary_whenBookIsAdded_thenLibraryIsNotEmpty() {
        Library emptyLibrary = new Library();
        emptyLibrary.addBook(new Book("La insoportable levedad del ser"));
        assertFalse(emptyLibrary.getBooks().isEmpty(), "There should be at least one book");
    }

    @Test
    void givenLibrary_whenCertainNumberBooksAdded_thenLibraryHasThatManyBooks() {
        assertEquals(3, library.getBooks().size(), "There should be 3 elements");
    }

    @Test
    void givenLibrary_whenBookAccessedByIndex_thenGetExpectedBook() {
        assertEquals("Política", library.getTitle(1));
    }

    @Test
    void givenLibrary_whenAddingDuplicateBooks_thenNoDuplicateBooksInLibrary() {
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
    void givenLibrary_whenAddingABookInCertainPosition_thenBookOccupiesThatPosition() {
        library.addBookAtIndex(2, new Book("La insoportable levedad del ser"));
        assertEquals("La insoportable levedad del ser", library.getTitle(2));
    }

    @Test
    void givenLibrary_whenAddingBookInCertainPosition_thenAllRelativePositionsAreAsExpected() {
        library.addBook(new Book("La insoportable levedad del ser"));
        library.addBookAtIndex(1, new Book("Ciclonopedia"));
        assertEquals("Teeteto", library.getBookFromIndex(4).getTitle());
    }

    @Test
    void givenLibrary_whenRemovingBook_thenLibrarySizeModified() {
        assertEquals(3, library.getBooks().size());
        library.removeBook("El banquete");
        assertEquals(2, library.getBooks().size());
    }

    @Test
    void givenSortedList_whenAddingBook_thenLibraryRemainsSorted() {
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
    }

    @Test
    void givenSortedLibrary_whenRemovingBook_thenLibraryRemainsSorted() {
        library.addBook(new Book("La insoportable levedad del ser"));

        assertEquals("El banquete", library.getBookFromIndex(0).getTitle());
        assertEquals("La insoportable levedad del ser", library.getBookFromIndex(1).getTitle());
        assertEquals("Política", library.getBookFromIndex(2).getTitle());
        assertEquals("Teeteto", library.getBookFromIndex(3).getTitle());

        library.removeBook("La insoportable levedad del ser");

        assertEquals("Política", library.getBookFromIndex(1).getTitle());
        assertEquals("Teeteto", library.getBookFromIndex(2).getTitle());
    }
}

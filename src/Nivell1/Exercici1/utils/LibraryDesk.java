package Nivell1.Exercici1.utils;

import Nivell1.Exercici1.objects.Library;

import java.util.Scanner;

public class LibraryDesk {

    public LibraryDesk() {
        Library lib = new Library();
    }

    public static void menu() {

        Scanner sc = new Scanner(System.in);
        int option;

        System.out.println("----- Welcome to the Library -----");
        do {
            System.out.println("What would you like to do?");
            System.out.println("""
                    1. Add a new book
                    2. Show all books
                    3. Get the title from the position
                    4. Add a new book to a certain position
                    5. Remove a book by its title
                    0. Exit
                    """);
            System.out.println("Enter your option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
            }
        } while (option != 0);
    }
}

package Nivell1.Exercici2;

public class CalculateID {

    static String correspondingLetter = "TRWAGMYFPDXBNJZSQVHLCKE";

    public char calculateID(String input) {
        try {
            return correspondingLetter.charAt((Integer.parseInt(input) % 23) - 1);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
}

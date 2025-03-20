package Nivell1.Exercici3;

public class Main {
    public static void main(String[] args) {

        GetsElement gets = new GetsElement();
        int[] nums = {1, 2, 3, 4, 5};

        try {
            gets.getsElement(6, nums);
            System.out.println(nums[6]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}

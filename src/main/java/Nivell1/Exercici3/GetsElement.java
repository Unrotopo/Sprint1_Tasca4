package Nivell1.Exercici3;

public class GetsElement {

    public int getsElement(int i, int[] nums) throws IndexOutOfBoundsException {

        if (i < 0 || i >= nums.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return nums[i];
    }
}
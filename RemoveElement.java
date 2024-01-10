import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {1, 2, 3, 4, 5, 6};

        // Element to remove
        int elementToRemove = 3;

        // Remove the specified element
        int[] modifiedArray = removeElement(numbers, elementToRemove);

        // Display the modified array
        System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(modifiedArray));
    }

    // Method to remove a specific element from an array
    private static int[] removeElement(int[] array, int element) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : array) {
            if (num != element) {
                list.add(num);
            }
        }

        // Convert ArrayList to array
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

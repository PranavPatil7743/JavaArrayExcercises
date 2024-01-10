public class ArrayContainsValue2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 7, 40, 6, 7, 0, 88, 7};
        int pos = positionOfelement(arr, 7);
        System.out.println(pos);

        int[] result = positionOfduplicateEle(arr, 7);
        for (int posi : result) {
            System.out.print(posi + " ");
        }
    }

    public static int positionOfelement(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    //if Duplicates are there then we have to take count
    public static int[] positionOfduplicateEle(int[] arr, int value) {
        int count = 0;
        for (int nums : arr) {
            if (nums == value) {
                count++;
            }
        }
        int[] positions = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positions[index++] = i;
            }
        }
        return positions;
    }


}

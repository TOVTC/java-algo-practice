import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println(bubbleSort(new int[] {2, 1, 3}));
    }

    public static String bubbleSort(int[] arr) {
        // take the first value and compare it to the value at next index
        // if the first value is larger than the next index, swap the positions of the two values
        // if the first value is smaller than the next index, move on to the next index

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return Arrays.toString(arr);
    }
}

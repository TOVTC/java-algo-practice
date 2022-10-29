public class QuickSortArray {
    public static void main(String[] args) {
        int[] unsorted = {6, 5, 3, 1, 8, 7, 2, 4};
        // instantiates QuickSort under "algorithm"
        QuickSort algorithm = new QuickSort();
        // call sort method in QuickSort class
        algorithm.sort(unsorted);
    }

    class QuickSort {
        private int input[];
        private int length;

        public void sort(int[] numbers) {
            if (numbers == null || numbers.length == 0) {
                return;
            }
            // initializes input[] variable declared above using numbers argument
            this.input = numbers;
            length = numbers.length;
            quickSort(0, length -1);
        }

        private void quickSort(int low, int high) {
            int counter = 1;
            int i = low;
            int j = high;
            // find middle index
            int pivot = input[low + (high - low)/2];

            while (i <= j) {
                // check that value at low index is less than pivot, then increase index (move toward pivot)
                while (input[i] < pivot) {
                    i++;
                }
                // check that value at high index is more than pivot, then decrease index (move toward pivot)
                while (input[j] > pivot) {
                    j--;
                }
                // once a value of i that is > pivot and value of j that is < pivot are found, swap values at index i and j
                if (i <= j) {
                    swap(i, j);
                    i++;
                    j--;
                }
                System.out.println("Round " + counter + ": " + input);
                counter++;
            }

            // quickSort stops running once i > j, so recursively call quickSort method to keep splitting halves
            // if j hasn't made it to the lowest index yet, run quickSort until j has reached the lowest index (start of array)
            if (low < j) {
                quickSort(low,j);
            }
            // if i hasn't made it to the highest index yet, run quickSort until i has reached the highest index (end of array)
            if (i < high) {
                quickSort(i, high);
            }
        }

        // use a third variable to swap the values at index i and j
        private void swap(int i, int j) {
            int temp = input[i];
            input[i] = input[j];
            input[j] = temp;
        }
    }
}

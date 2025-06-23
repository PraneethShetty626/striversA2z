package insertionSort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 9, 8, 7, 6, 3, 4, 5, 1 };

        sort(arr);
    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;

                j--;
            }
            print(arr);
        }

    }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.err.println();
    }
}

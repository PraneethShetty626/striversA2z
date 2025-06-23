package bubblesort;

class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 9, 8, 7, 6, 3, 4, 5, 1 };

        sort(arr);
    }

    static void sort(int[] arr) {

        while (true) {
            boolean swapped = false;

            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            print(arr);

            if (!swapped)
                break;
        }
    }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.err.println();
    }
}
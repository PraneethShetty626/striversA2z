class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 4, 6, 5, 7, 3, 6 };

        (new SelectionSort()).selectionSort(arr);
    }

    void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = arr[i];
            int k = i;
            for (int j = i; j <= n - 1; j++) {
                if (arr[j] <= min) {
                    min = arr[j];
                    k = j;
                }
            }

            arr[k] = arr[i];
            arr[i] = min;

            print(arr);
        }
    }

    void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.err.println();
    }
}
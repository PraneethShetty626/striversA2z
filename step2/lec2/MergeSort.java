public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 9, 8, 1, 4, 5, 2, 3, 8, 10, 23, 4, 6, 8, 9, 0, 12, 1, 3, 45, 67 };

        mergeSort(arr, 0, arr.length - 1);

        print(arr);
    }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.err.println();
    }

    static void mergeSort(int[] arr, int start, int end) {

        if (start == end)
            return;

        int s = start;
        int middle = start + (end - start) / 2;

        mergeSort(arr, start, middle);

        mergeSort(arr, middle + 1, end);

        int[] temp = new int[end - start + 1];

        int m = middle + 1;

        int i = 0;

        while (start <= middle && m <= end) {
            if (arr[start] <= arr[m]) {
                temp[i++] = arr[start++];
            } else {
                temp[i++] = arr[m++];
            }
        }

        while (start <= middle) {
            temp[i++] = arr[start++];
        }

        while (m <= end) {
            temp[i++] = arr[m++];
        }
        System.err.println(start + ":" + end);
        print(temp);

        for (i = 0; i < temp.length; i++) {
            arr[s + i] = temp[i];
        }

    }

}

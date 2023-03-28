package algorithms;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5};

        System.out.println(Arrays.toString(selectSort(arr)));
    }
    private static int[] selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int last = arr.length - i - 1;
            int max = max(arr, 0, last);
            int temp = arr[last];
            arr[last] = arr[max];
            arr[max] = temp;

        }
        return arr;
    }

    private static int max(int[] arr, int start, int end) {
        int max = Integer.MIN_VALUE;
        int ans = -1;
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ans = i;
            }
        }
        return ans;
    }
}

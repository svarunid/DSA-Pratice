package problems;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {

        int[] arr = {1, 3, 3, 5, 6, 6, 6, 8, 8, 10, 10, 15};

        System.out.println(Arrays.toString(posFirstAndLast(arr, 5)));
    }

    static int[] posFirstAndLast(int[] arr, int target){
        int start = binarySearch(arr, target, false);
        int end  = binarySearch(arr, target, true);
        return new int[]{start, end};
    }

    private static int binarySearch(int[] arr, int target, boolean moveStart) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end){
            int middle = start + (end - start) / 2;
            if (arr[middle] < target) start = middle + 1;
            else if (arr[middle] > target) end = middle - 1;
            else {
                ans = middle;
                if (moveStart) start = middle + 1;
                else end = middle - 1;
            }
        }
        return ans;
    }
}

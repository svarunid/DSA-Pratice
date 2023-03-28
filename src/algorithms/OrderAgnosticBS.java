package algorithms;

public class OrderAgnosticBS {
    private static boolean orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = (arr[start] < arr[end]);

        while (start <= end){
            int middle = start + (end - start) / 2;
            if (arr[middle] == target) return true;
            if (isAsc) {
                if (arr[middle] < target) start = middle + 1;
                else end = middle - 1;
            } else {
                if (arr[middle] > target) start = middle + 1;
                else end = middle - 1;
            }
        }
        return false;
    }
}

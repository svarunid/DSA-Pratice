package algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(binarySearch(arr, 8));
    }

    private static boolean binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int middle = start + (end - start) / 2;
            if (arr[middle] == target) return true;
            else if (arr[middle] < target) start = middle + 1;
            else end = middle - 1;
        }
        return false;
    }

    public static boolean binarySearch(int[] arr, int target, int start, int end){
        int middle = start + (end - start) / 2;
        if (arr[middle] == target) return true;
        else if (start == end) return false;
        else if (arr[middle] > target){
            return binarySearch(arr, target, start, middle - 1);
        }
        else {
            return binarySearch(arr, target, middle + 1, end);
        }
    }
}

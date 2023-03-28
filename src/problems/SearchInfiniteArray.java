package problems;

public class SearchInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(searchInfiniteArray(arr, 8));
    }

    private static int searchInfiniteArray(int[] arr, int target){
        int start = 0;
        int end = 1;

        while (arr[end] < target){
            int temp = end;
            end = end + (end - start) * 2;
            start = temp;
        }

        return binarySearch(arr, target, start, end);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end){
            int middle = start + (end - start) / 2;
            if (arr[middle] == target) return middle;
            else if (arr[middle] < target) start = middle + 1;
            else end = middle - 1;
        }
        return -1;
    }
}

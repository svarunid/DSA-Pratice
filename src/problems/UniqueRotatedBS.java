package problems;

public class UniqueRotatedBS {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,9,1,2};

        System.out.println(search(arr, 2));
    }

    private static int search(int[] arr, int target){
        int pivot = findPivot(arr);
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length);
        } else if (arr[pivot] == target) {
            return pivot;
        } else if (arr[0] > target) {
            return binarySearch(arr, target, 0, pivot - 1);
        } else {
            return binarySearch(arr, target, pivot + 1, arr.length);
        }
    }

    private static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid-1]) {
                return mid - 1;
            } else if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
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

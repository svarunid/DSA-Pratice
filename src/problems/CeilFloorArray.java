package problems;

public class CeilFloorArray {
    public static void main(String[] args) {
        int[] arr = {17,23,44,67,78,88};

        System.out.println(ceilArray(arr, 15));
        System.out.println(floorArray(arr, 90));
    }

    static int ceilArray(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int middle = start + (end - start) / 2;
            if (arr[middle] == target) return middle;
            else if (arr[middle] < target) start = middle + 1;
            else end = middle - 1;
        }
        return arr[start];
    }

    static int floorArray(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int middle = start + (end - start) / 2;
            if (arr[middle] == target) return middle;
            else if (arr[middle] < target) start = middle + 1;
            else end = middle - 1;
        }
        return arr[end];
    }
}

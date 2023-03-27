package algorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23, 45, 34, 23, 6};

        System.out.println(search(arr, 45));
    }

    static boolean search(int[] arr, int target){
        for(int i: arr){
            if (i == target) return true;
        }
        return false;
    }
}

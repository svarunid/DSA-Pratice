package problems;

public class SmallestLetter {
    public static void main(String[] args) {

        char[] arr = {'c', 'g', 't', 'z'};

        System.out.println(smallestLetter(arr, 'r'));

    }

    static char smallestLetter(char[] arr, char target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int middle = start + (end - start) / 2;
            if (arr[middle] < target) start = middle + 1;
            else end = middle - 1;
        }
        return arr[start % arr.length];
    }
}

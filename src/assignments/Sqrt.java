package assignments;

public class Sqrt {
    public static void main(String[] args) {
        double x = 80;
    }

    private static int sqrtRound(double x){
        int start = 0;
        int end = 4;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if (Math.pow(mid, 2) > Math.pow(x, 2)) {
                end = mid - 1;
            }
            else if (Math.pow(mid, 2) < Math.pow(x, 2)) {
                start = mid;
            }
            else if (Math.pow(mid, 2) == Math.pow(x, 2)) return mid;
            else {
                start = end + 1;
                end = end * 2;
            }
        }
        return -1;
    }
}

package problems;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    private static List<List<Integer>> subsetItr(int[] arr) {
        List<List<Integer>> output = new ArrayList<>();

        output.add(new ArrayList<>());

        for (int num: arr) {
            int n = output.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(output.get(i));
                internal.add(num);
                output.add(internal);
            }
        }
        return output;
    }
}

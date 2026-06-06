package Arrays;
import java.util.HashMap;

public class TwoSumHashMap {

    public static int[] twoSum(int arr[], int target) {

        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int val = target - arr[i];
            if (hs.containsKey(val)) {
                return new int[] { hs.get(val), i };
            }
            hs.put(arr[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int ans[] = twoSum(arr, 30);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
package Arrays;
public class MaxSubarrayPrefixSum {
    public static void MaxSubArray(int arr[]) {

        int cs = arr[0];
        int ms = arr[0];

        for (int i = 1; i < arr.length; i++) {
            cs = Math.max(cs, cs + arr[i]);
            ms = Math.max(cs, ms);
        }
        System.out.println(ms);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        MaxSubArray(arr);
    }
}

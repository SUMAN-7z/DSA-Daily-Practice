package Arrays;
public class kadanesMaxSubarray {

    public static void MaxSubArray(int arr[]) {
        int currSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { -2,-3,-5,-6};
        MaxSubArray(arr);
    }
}

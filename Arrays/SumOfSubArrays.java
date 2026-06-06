package Arrays;
public class SumOfSubArrays {

    public static void subArr(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                }
                System.out.println("total is : " + sum);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println("Max sum is : " + max);
    }

    public static void main(String[] args) {
        int arr[] = { 10,20,30,40};
        subArr(arr);
    }
}

package Arrays;
public class rainWater {
    public static void method(int arr[]) {
        int leftMaxBoundary[] = new int[arr.length];
        int rightMaxBoundary[] = new int[arr.length];

        leftMaxBoundary[0] = arr[0];

        for (int i = 1; i < leftMaxBoundary.length; i++) {
            leftMaxBoundary[i] = leftMaxBoundary[i - 1] < arr[i] ? arr[i] : leftMaxBoundary[i - 1];
        }

        rightMaxBoundary[arr.length - 1] = arr[arr.length - 1];
        
        for (int i = rightMaxBoundary.length - 2; i >= 0; i--) {
            rightMaxBoundary[i] = rightMaxBoundary[i + 1] < arr[i] ? arr[i] : rightMaxBoundary[i + 1];
        }

        int container = 0;

        for (int i = 0; i < arr.length; i++) {
            // int waterLev = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);

            int waterLev = leftMaxBoundary[i] > rightMaxBoundary[i] ? rightMaxBoundary[i] : leftMaxBoundary[i];
            container = container + ((waterLev - arr[i]) * 1);
        }

        System.out.println(container);

    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        method(arr);
    }
}

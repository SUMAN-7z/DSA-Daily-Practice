package Arrays;
public class palindrom10_100 {
    public static void main(String args[]) {
        int sum = 0;
        for (int i = 10; i <= 100; i++) {
            int num = i;
            int rev = 0;
            while (num > 0) {
                int rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }
            if (i == rev) {
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }
}

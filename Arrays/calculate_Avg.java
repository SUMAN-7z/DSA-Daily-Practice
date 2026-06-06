package Arrays;
public class calculate_Avg {
    int m1 = 50;
    int m2 = 50;
    int m3 = 50;
    int m4 = 50;
    int m5 = 50;

    private double calculateAvarage() {
        return (m1 + m2 + m3 + m4 + m5) / 5.0;
    }

    void display() {
        System.out.println("Average mark is : " + calculateAvarage());
    }

    public static void main(String[] args) {
        calculate_Avg s1 = new calculate_Avg();
        s1.display();
    }
}

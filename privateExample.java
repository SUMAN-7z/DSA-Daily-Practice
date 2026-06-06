class student {
    private String name;
    private int rollNumber;
    private int marks;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRollNumber(int rollNumber) {
        if (rollNumber > 0) {
            this.rollNumber = rollNumber;
        } else {
            System.out.println("Invalid roll number");
        }
    }

    public int getRollnumber() {
        return rollNumber;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

}

public class privateExample {

    public static void main(String[] args) {
        student s1 = new student();

        s1.setName("Rakhi");
        s1.setRollNumber(101);
        s1.setMarks(200);
        System.out.println(s1.getName());
        System.out.println(s1.getRollnumber());
        System.out.println(s1.getMarks());
    }
}


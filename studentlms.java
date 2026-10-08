import java.util.Scanner;

public class studentlms {

    String name;
    int roll;
    int marks;
    String course;
    int credits;
    double fee;
    double scholarship = 0;

    void calculateFee() {
        double courseFee = 1500 * credits;
        System.out.println("Course Fee: " + courseFee);
    }

    void check() {
        if (marks >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    void scholarship() {

        if (marks >= 85) {
            scholarship = fee * 0.20;
            System.out.println("Scholarship: 20%");

        } else if (marks >= 70) {
            scholarship = fee * 0.10;
            System.out.println("Scholarship: 10%");

        } else {
            scholarship = 0;
            System.out.println("NO SCHOLARSHIP");
        }
    }

    void finalfee() {
        double finalfee = fee - scholarship;
        System.out.println("FINAL FEE: " + finalfee);
    }

    void display() {
        System.out.println("\n--- STUDENT DETAILS ---");
        System.out.println("STUDENT NAME: " + name);
        System.out.println("ROLL NO: " + roll);
        System.out.println("MARKS: " + marks);
        System.out.println("COURSE: " + course);
        System.out.println("CREDITS: " + credits);
        System.out.println("FEE: " + fee);
        System.out.println("SCHOLARSHIP: " + scholarship);
    }

    public static void main(String[] args) {

        studentlms s = new studentlms();
        Scanner sc = new Scanner(System.in);

        System.out.println("STUDENT NAME:");
        s.name = sc.next();

        System.out.println("ROLL NO:");
        s.roll = sc.nextInt();

        System.out.println("MARKS:");
        s.marks = sc.nextInt();

        System.out.println("COURSE:");
        s.course = sc.next();

        System.out.println("CREDITS:");
        s.credits = sc.nextInt();

        System.out.println("FEE:");
        s.fee = sc.nextDouble();

        s.calculateFee();
        s.check();
        s.scholarship();
        s.finalfee();
        s.display();
    }
}
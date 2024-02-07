////Facad Design Pattern
import java.util.Scanner;

public class DoctorSalary implements Salary {
    public static void calculateSalary() {
        System.out.println("**********Welcome Doctor to your salary counter**********");
        System.out.println("***** To know you salary enter your ID and SECREATE CODE*****");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your post ID :");
        int post_id = sc.nextInt();
        System.out.print("Enter your secrete code:");
        int secreteCode = sc.nextInt();
        int salary = 2000 + (post_id * secreteCode);
        System.out.println("Your Salary is :"+salary);
    }
}

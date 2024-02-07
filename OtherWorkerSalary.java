////Facad Design Pattern
import java.util.Scanner;
public class OtherWorkerSalary implements Salary {
    public static void calculateSalary() {
        System.out.println("***** To know you salary enter your ID and SECREATE CODE*****");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your post ID:");
        int post_id = sc.nextInt();
        System.out.print("Enter your secrete code:");
        int secreteCode = sc.nextInt();
        System.out.println("Your Salary is :");
        int salary = 2000 + (post_id * secreteCode);
    }
}

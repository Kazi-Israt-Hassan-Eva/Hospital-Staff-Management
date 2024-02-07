import java.util.*;

public class Main {
    public static void main(String[] args) {
        Accounts accounts = new Accounts();
        accounts.calculateDoctorSalary();

        Scanner sc = new Scanner(System.in);
        String again1;
        System.out.println("\n\nDo you want to calculate yor salary again? (y/n)");
        //Doctors id =45
        //Doctors secrete code =1111
        again1 = sc.next();
        if (again1.equalsIgnoreCase("Y")) {
            DoctorSalary.calculateSalary();
        } else if (again1.equalsIgnoreCase("N"))
            System.out.println("Thanks!");


        String again2;
        System.out.print("\n\nDo you want to see what are needed for Promotion? (y/n)");
        //Doctors promotion id =45
        again2 = sc.next();
        if (again2.equalsIgnoreCase("Y")) {
            Promotion doctorPromotionRequirement = new PromotionElements(new DoctorPromotion());
            System.out.println("\nNeeded for Doctor's Promotion :");
            System.out.println("* FCPS (Fellowship of College of Physicians and Surgeons)");
            System.out.println("* MS (Master of Surgery)");
            System.out.println("* MD (Doctor of Medicine)");
            System.out.println("* BCS");

            System.out.println("\nNeeded for Nurse's Promotion :");
            System.out.println("* Advanced practice nursing");
            System.out.println("* Nurse anesthetists");

            Promotion.calculatePromotion();
        } else if (again2.equalsIgnoreCase("N"))
            System.out.println("Thanks");


        String again;
        System.out.print("\n\nDo you want to see your Promotion? (y/n)");
        //Doctors promotion id =45
        again = sc.next();
        if (again.equalsIgnoreCase("Y")) {
            DoctorPromotion.calculatePromotion();
        } else if (again.equalsIgnoreCase("N"))
            System.out.println("******** The End ******** ");

        String again4;
        System.out.print("\n\nDo you want communicate with Doctor? (y/n)");
        //Not allowed Id = 23
        again4 = sc.next();
        if (again4.equalsIgnoreCase("Y")) {
            Communication staff = new ProxyCommunication();
            staff.createCommunication("Staff you are allowed to communicate with","Doctor");
        } else if (again4.equalsIgnoreCase("N"))
            System.out.println("******** The End ******** ");

        System.exit(1);
    }
}




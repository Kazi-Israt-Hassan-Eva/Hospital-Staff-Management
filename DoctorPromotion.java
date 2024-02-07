//Decorator Design patter  STEP:2
//Doctor promotion id =45
//Secrete code = 1111

public class DoctorPromotion implements Promotion {
    public static void calculatePromotion() {
        System.out.print("Enter Your id :");
        int id = sc.nextInt();
        if(id==45){
            System.out.println("Congratulations ! You are promoted");
        }
        else{
            System.out.println("Sorry, Doctor ! You are not promoted");
        }
    }

}

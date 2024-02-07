//Decorator Design patter  STEP:2; Nurse promotion id =23

public class NursePromotion implements Promotion {
    public void calculatePromotion() {
        System.out.print("Enter Your id :");
        int id = sc.nextInt();
        if(id==23){
            System.out.println("Congratulations ! You are promoted");
        }
        else{
            System.out.println("Sorry, Nurse ! You are not promoted");
        }

    }
}

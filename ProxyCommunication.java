import java.util.*;
public class ProxyCommunication implements Communication {
    @Override
    public void createCommunication(String sender, String receiver) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you Id for user verification : ");
        int id = sc.nextInt();
        Staff staff = new Staff();
        if(id==23){
            System.out.println("Staff is not allowed to communicate");
            return;
        }

        staff.createCommunication("Staff you are allowed to communicate with","Doctor");

    }
}


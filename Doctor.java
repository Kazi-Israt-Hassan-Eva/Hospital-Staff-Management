//Proxy Design Pattern
public class Doctor implements Communication {
    @Override
    public void createCommunication(String sender, String receiver) {
        System.out.println("Staff can communicate with "+receiver);
    }
}

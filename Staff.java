public class Staff implements Communication {
    @Override
    public void createCommunication(String sender, String receiver) {
            System.out.println("You are allowed to communicate with "+receiver);

    }
}

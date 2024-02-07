////Facad Design Pattern step:4
public class Accounts {
    private Salary DoctorSalary;
    private Salary NurseSalary;
    private Salary OtherWorkerSalary;


    public Accounts() {
        DoctorSalary doctorSalary = new DoctorSalary();
        NurseSalary nurseSalary = new NurseSalary();
        OtherWorkerSalary otherWorkerSalary = new OtherWorkerSalary();
    }

    public void calculateDoctorSalary() {
        DoctorSalary doctorSalary = null;
        doctorSalary.calculateSalary();
    }

    public void calculateNurseSalary() {
        NurseSalary nurseSalary = null;
        nurseSalary.calculateSalary();
    }

    public void calculateOtherWorkerSalary() {
        OtherWorkerSalary otherWorkerSalary = null;
        otherWorkerSalary.calculateSalary();
    }
}

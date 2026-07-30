interface PatientManagement {
    void viewPatientDetails();
}

interface Billing {
    void generateBill();
}

class HospitalService implements PatientManagement, Billing {

    public void viewPatientDetails() {
        System.out.println("Patient ID: 101");
        System.out.println("Patient Name: Rahul");
        System.out.println("Disease: Fever");
    }

    public void generateBill() {
        System.out.println("Bill Amount: Rs.5000");
    }
}

public class Main {
    public static void main(String[] args) {
        HospitalService hs = new HospitalService();

        System.out.println("Hospital Management System");
        System.out.println("--------------------------");

        hs.viewPatientDetails();
        hs.generateBill();
    }
}
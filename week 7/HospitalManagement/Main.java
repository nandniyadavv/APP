import doctor.Doctor;
import patient.Patient;

public class Main {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor(101, "Dr. Sharma", "Cardiology", 1000);
        Doctor doctor2 = new Doctor(102, "Dr. Mehta", "Dermatology", 800);

        Patient patient1 = new Patient(1, "Rahul", "Heart Disease", 45);
        Patient patient2 = new Patient(2, "Priya", "Skin Allergy", 28);
        Patient patient3 = new Patient(3, "Aman", "Heart Disease", 52);

        Patient[] patients = {patient1, patient2, patient3};
        Doctor[] assignedDoctors = {doctor1, doctor2, doctor1};

        int doctor1Patients = 0;
        int doctor2Patients = 0;

        System.out.println("Hospital Management System\n");

        for (int i = 0; i < patients.length; i++) {
            System.out.println("Patient " + (i + 1));
            patients[i].display();
            System.out.println("\nTreating Doctor:");
            assignedDoctors[i].display();
            System.out.println("---------------------------");

            if (assignedDoctors[i] == doctor1) {
                doctor1Patients++;
            } else {
                doctor2Patients++;
            }
        }

        double doctor1Total = doctor1Patients * doctor1.getConsultationFee();
        double doctor2Total = doctor2Patients * doctor2.getConsultationFee();

        System.out.println("\nTotal Consultation Fee");
        System.out.println(doctor1.getName() + ": " + doctor1Total);
        System.out.println(doctor2.getName() + ": " + doctor2Total);
    }
}
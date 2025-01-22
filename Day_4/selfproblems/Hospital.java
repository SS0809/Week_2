package selfproblems;

/*
Problem 3: Hospital, Doctors, and Patients (Association and Communication)
Description: Model a Hospital where Doctor and Patient objects interact through consultations. 
A doctor can see multiple patients, and each patient can consult multiple doctors.
Tasks:
Define a Hospital class containing Doctor and Patient classes.
Create a method consult() in the Doctor class to show communication, which would display the consultation between a doctor and a patient.
Model an association between doctors and patients to show that doctors and patients can have multiple relationships.
Goal: Practice creating an association with communication between objects by modeling doctor-patient consultations.
*/
class Patient{
    private String patientName;
    public String getPatientName(){
        return this.patientName;
    }
    Patient(String patientName){
        this.patientName = patientName;
        System.out.println("Patient created " + patientName);
    }
}
class Doctor{
    private String doctorName;
    Doctor(String doctorName){
        this.doctorName = doctorName;
        System.out.println("Doctor created " + doctorName);
    }
    public void consult(Patient P){
        System.out.println("Patient " + P.getPatientName()+  " consulted a Doctor " + this.doctorName);
    }
}
public class Hospital{
    public static void main(String[] args) {
    Doctor dr1 = new Doctor("Ved Hakim");
    Doctor dr2 = new Doctor("Rajesh");
    Patient pt1 = new Patient("Saurabh");
    Patient pt2 = new Patient("Nishant");
    dr1.consult(pt1);
    dr2.consult(pt2);
    dr1.consult(pt1);
    dr2.consult(pt2);
    //Model an association between doctors and patients to show that doctors and patients can have multiple relationships.
    }
}

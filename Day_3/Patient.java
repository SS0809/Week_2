/*
Create a Patient class with the following features:
*/
public class Patient{
    private static String hospitalName;
    // Static:
    // A static variable hospitalName shared among all patients.
    // A static method getTotalPatients() to count the total patients admitted.
    private static int total;
    private static int getTotalPatients(){
        return total;
    }
    private String name , ailment;
    private int age ;
    // Final:
    // Use a final variable patientID to uniquely identify each patient.
    private final int patientID;    
    // This:
    // Use this to initialize name, age, and ailment in the constructor.
    Patient(String name , int age , String ailment , int patientID){
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        total++;
    }
    // Instanceof:
    // Check if an object is an instance of the Patient class before displaying its details.
    private boolean checkInstance(){
        if(this instanceof Patient){
            return true;
        }else{
            return false;
        }
    }
    private void displayPatientDetails(){
        if(this.checkInstance()){
            System.out.println("name : " + name);
            System.out.println("age : " + age);
            System.out.println("ailment : "+ ailment);
            System.out.println("patientID : "+ patientID);
        }
    }
    public static void main(String[] args) {
        Patient pt = new Patient("Pankaj",21,"Cough",4123056);
        Patient pt1 = new Patient("Neeraj",22,"Cough",4123095);
        pt.displayPatientDetails();
        pt1.displayPatientDetails();
    }
}
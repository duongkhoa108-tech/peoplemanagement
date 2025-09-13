package peoplemanagement;

import java.util.Scanner;

public class Student extends Person {
    private String studentId;
    private String trainingResult;

    public Student() {}

    public Student(String fullName, String dateOfBirth, String gender, int idCard, String studentId, String trainingResult) {
        super(fullName, dateOfBirth, gender, idCard);
        this.studentId = studentId;
        this.trainingResult = trainingResult;
    }

   
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getTrainingResult() {
        return trainingResult;
    }

    public void setTrainingResult(String trainingResult) {
        this.trainingResult = trainingResult;
    }

   
    public void evaluateTraining() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Training evaluation (1-Excellent, 2-Good, 3-Average, 4-Poor): ");
        int choice = sc.nextInt();
        sc.nextLine(); // clear buffer
        switch (choice) {
            case 1 -> trainingResult = "Excellent";
            case 2 -> trainingResult = "Good";
            case 3 -> trainingResult = "Average";
            case 4 -> trainingResult = "Poor";
            default -> trainingResult = "Undefined";
        }
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        studentId = sc.nextLine();
        evaluateTraining();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Training result: " + trainingResult);
    }
}

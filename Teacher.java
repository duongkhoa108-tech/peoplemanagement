

package peoplemanagement;

import java.util.Scanner;

public class Teacher extends Person {
    private String teacherId;
    private String competitionResult;

    public Teacher() {}

    public Teacher(String fullName, String dateOfBirth, String gender, int idCard, String teacherId, String competitionResult) {
        super(fullName, dateOfBirth, gender, idCard);
        this.teacherId = teacherId;
        this.competitionResult = competitionResult;
    }

    public void classifyCompetition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Competition classification (1-A, 2-B, 3-C): ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> competitionResult = "A";
            case 2 -> competitionResult = "B";
            case 3 -> competitionResult = "C";
            default -> competitionResult = "Undefined";
        }
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter teacher ID: ");
        teacherId = sc.nextLine();
        classifyCompetition();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Competition result: " + competitionResult);
    }
}

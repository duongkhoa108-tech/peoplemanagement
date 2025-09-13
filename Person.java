package peoplemanagement;

import java.util.Scanner;

public class Person {

    protected String fullName;
    protected String dateOfBirth;
    protected String gender;
    protected int idCard;

    public Person() {
    }

    public Person(String fullName, String dateOfBirth, String gender, int idCard) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCard = idCard;
    }

    // --- Getters and Setters ---
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    // --- Input & Display Methods ---
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full name: ");
        fullName = sc.nextLine();
        System.out.print("Enter date of birth: ");
        dateOfBirth = sc.nextLine();
        System.out.print("Enter gender: ");
        gender = sc.nextLine();
        System.out.print("Enter ID card: ");
        idCard = Integer.parseInt(sc.nextLine());
    }

    public void displayInfo() {
        System.out.println("Full name: " + fullName);
        System.out.println("Date of birth: " + dateOfBirth);
        System.out.println("Gender: " + gender);
        System.out.println("ID card: " + idCard);
    }
}

package peoplemanagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonList list = new PersonList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println(" PEOPLE MANAGEMENT MENU ");
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Display all people");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            
            while (!sc.hasNextInt()) { 
                System.out.print("Please enter a number (0-3): ");
                sc.next();
            }
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> list.addPerson(new Student());
                case 2 -> list.addPerson(new Teacher());
                case 3 -> list.displayAll();
                case 0 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentmanagementapplicationss;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class StudentManagementApplicationss {
  private  final Scanner scanner = new Scanner(System.in);
Student student = new Student();
    public static  void main(String[] args) {
        System.out.println("STUDENT MANAGEMENT APPLICATION");
        System.out.println("*************************************************");
        System.out.println("Enter (1) to launch the menu or any other key to exit");
        System.out.println();
StudentManagementApplicationss check = new StudentManagementApplicationss();
        String initialChoice = check.scanner.nextLine();

        if (!"1".equals(initialChoice)) {
            check.exitApplication();
        }
   Student student = new Student();
        // Main application loop
        while (true) {
            check.showMenu();
            String choice = check.scanner.nextLine();
            switch (choice) {
                case "1" -> check.captureStudent();
                case "2" -> check.searchStudent();
                case "3" -> check.deleteStudent();
                case "4" -> check.Report();
                case "5" -> check.exitApplication();
                default -> System.out.println("Invalid choice! Please enter a valid menu option.");
            }
        }
    }

    // Display menu options
    private  void showMenu() {
        System.out.println("\n*************************************************");
        System.out.println("Please select one of the following menu items:");
        System.out.println("(1) Capture a new student");
        System.out.println("(2) Search for a student");
        System.out.println("(3) Delete a student");
        System.out.println("(4) Print student report");
        System.out.println("(5) Exit Application");
        System.out.println("*************************************************");
        System.out.print("Enter your choice: ");
    }

    // Capture new student details
    public  void captureStudent() {
        System.out.println("\nCAPTURE A NEW STUDENT");
        System.out.println("*****************************");

        String studentId = promptInput("Enter the student ID: ");
        
        String name = promptInput("Enter the student name: ");
        
        int age = captureStudentAge();
        
        String email = promptInput("Enter the student email: ");
        String course = promptInput("Enter the student course: ");

        
        student.Student(studentId, name, age, email, course);
        
       // student.saveStudent(student);
        System.out.println("Student added successfully!");
    }

    // Capture student age with validation
    private  int captureStudentAge() {
        int age = 0;
        boolean validAge = false;

        while (!validAge) {
            try {
                age = Integer.parseInt(promptInput("Enter the student age (must be 16 or older): "));
                if (age < 16) {
                    System.out.println("Invalid age! Age must be 16 or older.");
                } else {
                    validAge = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a numeric value for age.");
            }
        }
        return age;
    }

    // Search for a student by ID
    private  void searchStudent() {
        String studentId = promptInput("Enter the student ID to search: ");
       
        student.searchStudent(studentId);
    
    }

    // Delete a student by ID
    private  void deleteStudent() {
        String studentId = promptInput("Enter the student ID to delete: ");
        String confirmation = promptInput("Are you sure you want to delete student " + studentId + "? (y/n): ");

        if ("y".equalsIgnoreCase(confirmation)) {
            if (student.deleteStudent(studentId)) {
                System.out.println("\nStudent with ID: " + studentId + " was successfully deleted!");
            } else {
                System.out.println("\nStudent with ID: " + studentId + " was not found!");
            }
        } else {
            System.out.println("\nDeletion canceled.");
        }
    }

    // Prompt user for input and return the response
    private  String promptInput(String message) {
        System.out.print(message);
        return scanner.nextLine().trim();
    }
void Report(){
    student.printStudentReport();
}
    // Exit the application with a goodbye message
    private  void exitApplication() {
        System.out.println("Exiting the application. Goodbye!");
        System.exit(0);
    }
}

    

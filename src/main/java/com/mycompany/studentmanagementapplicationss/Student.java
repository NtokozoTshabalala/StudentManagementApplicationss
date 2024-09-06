/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagementapplicationss;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author RC_Student_lab
 */
public class Student {

    private String studentId;
    private String name;
    private int age;
    private String email;
    private String course;

    private  final List<Student> students = new ArrayList<>();
private ArrayList<String> st_name = new ArrayList();
private ArrayList<String> st_no = new ArrayList();
private ArrayList<Integer> st_age = new ArrayList();
private ArrayList<String> st_course = new ArrayList();
private ArrayList<String> st_email = new ArrayList();




    // Constructor
    public void Student(String studentId, String name, int age, String email, String course) {
        
         if (!searchFirst(studentId)) {

        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
        get_details();
        
           System.out.println("Student details have been successfully saved.");
        } else {
            System.out.println("A student with the same ID already exists.");
        }
         
    }

    public void get_details(){
        
        st_name.add(getName());
        st_age.add(getAge());
        st_no.add(getStudentId());
        st_course.add(getCourse());
        st_email.add(getEmail());
                
                
    }

 public  boolean searchFirst(String studentId){
     
      //check the user
        
        boolean found = false;
        int count =0;
        for(int counting =0;counting <st_no.size();counting++){
            
            if(st_no.get(counting).equals(studentId)){
                
                found =true;
                count =counting;
                break;
                
            }
        }
       return  found; 
 }
    // Search for a student by ID
    public  boolean searchStudent(String studentId) {
        
        
        //check the user
        
        boolean found = false;
        int count =0;
        for(int counting =0;counting <st_no.size();counting++){
            
            if(st_no.get(counting).equals(studentId)){
                
                found =true;
                count =counting;
                break;
                
            }
        }
        
            if (found) {
            System.out.println("\n---------------------------------------------");
            System.out.println("STUDENT ID: " + st_no.get(count));
            System.out.println("STUDENT NAME: " + st_name.get(count));
            System.out.println("STUDENT AGE: " + st_age.get(count));
            System.out.println("STUDENT EMAIL: " + st_email.get(count));
            System.out.println("STUDENT COURSE: " + st_course.get(count));
            System.out.println("---------------------------------------------");
        } else {
            System.out.println("\nStudent with ID: " + studentId + " was not found!");
        }
            
            return found;
        
    }

    // Delete a student by ID
    public  boolean deleteStudent(String studentId) {
               //check the user
        
        boolean found = false;
        int count =0;
        for(int counting =0;counting <st_no.size();counting++){
            
            if(st_no.get(counting).equals(studentId)){
                
                found =true;
                count =counting;
                break;
                
            }
        }
        
            if (found) {
                
                st_no.remove(count);
                st_name.remove(count);
                     st_age   .remove(count);
                      st_email  .remove(count);
                              st_course.remove(count);
                              
                              

        } else {
            System.out.println("\nStudent with ID: " + studentId + " was not found!");
        }
            
            return found;
    }

    
    public void Display(){
           for(int counting =0;counting <st_no.size();counting++){
            
            if(st_no.get(counting).equals(studentId)){
                
             System.out.println("\n---------------------------------------------");
            System.out.println("STUDENT ID: " + st_no.get(counting));
            System.out.println("STUDENT NAME: " + st_name.get(counting));
            System.out.println("STUDENT AGE: " + st_age.get(counting));
            System.out.println("STUDENT EMAIL: " + st_email.get(counting));
            System.out.println("STUDENT COURSE: " + st_course.get(counting));
            System.out.println("---------------------------------------------");
                
            }
        }
        
          
    }
    // Print report of all students
    public  void printStudentReport() {
        
     
          boolean found = false;

        System.out.println("\nSTUDENT REPORT");
        System.out.println("====================================");
        for (int count = 0; count < st_no.size(); count++) {
          System.out.println("\n---------------------------------------------");
            System.out.println("STUDENT ID: " + st_no.get(count));
            System.out.println("STUDENT NAME: " + st_name.get(count));
            System.out.println("STUDENT AGE: " + st_age.get(count));
            System.out.println("STUDENT EMAIL: " + st_email.get(count));
            System.out.println("STUDENT COURSE: " + st_course.get(count));
            System.out.println("---------------------------------------------");
            found =true;
        }
        
         if (!found) {
            System.out.println("No students available to display.");
            
        }
    }

    // Exit the student application
    public  void exitApplication() {
        System.out.println("Exiting the application. Goodbye!");
        System.exit(0);
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }

    // Setters (optional, in case you need to update any details later)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.studentmanagementapplicationss;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class StudentManagementApplicationssTest {
    
   
    /**
     * Test of main method, of class StudentManagementApplicationss.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        //StudentManagementApplicationss.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
       @org.junit.jupiter.api.Test
    public void testSaveStudent() {
        System.out.println("testSaveStudent");
      
        Student student = new Student();
        student.Student("ST123", "abulele", 19, "abulele", "DIS1");
       
    }
    
      @org.junit.jupiter.api.Test
    public void testDelete() {
        System.out.println("testSaveStudent");
      
        Student student = new Student();
        student.Student("ST123", "abulele", 19, "abulele", "DIS1");
        student.deleteStudent("st333");
       
        
       
    }
    
}

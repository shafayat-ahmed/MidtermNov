package parser;

import org.testng.Assert;

public class UnitTestingStudentProfile {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        try {
            Student student = new Student();
            student.firstName.toString();
            Assert.assertEquals("MD", "Asif", "not match");
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
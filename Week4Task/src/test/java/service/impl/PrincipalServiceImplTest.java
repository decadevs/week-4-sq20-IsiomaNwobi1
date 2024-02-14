package service.impl;

import enums.CourseOffer;
import enums.Gender;
import model.Course;
import model.Principal;
import model.Teacher;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalServiceImplTest {

    @Test
    void displayPrincipalData() {

        Principal principalInput = new Principal("Chris Clement", 60, Gender.MALE);

        PrincipalServiceImpl principalService = new PrincipalServiceImpl();

        ByteArrayOutputStream actualContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualContent));

        principalService.displayPrincipalData(principalInput);

        String expected = "FullName: Chris Clement\nGender: MALE\nAge: 60\n";

        assertEquals(expected, actualContent.toString());

    }
}
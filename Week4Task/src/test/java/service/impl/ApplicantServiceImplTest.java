package service.impl;

import enums.CourseOffer;
import enums.Gender;
import model.Applicants;
import model.Course;
import model.Teacher;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ApplicantServiceImplTest {

    @Test
    void displayApplicantData() {

        Applicants applicantsInput = new Applicants("David Uche", 18, Gender.MALE);

        ApplicantServiceImpl applicantService = new ApplicantServiceImpl();

        ByteArrayOutputStream actualContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualContent));

        applicantService.displayApplicantData(applicantsInput);

        String expected = "FullName: David Uche\nGender: MALE\nAge: 18\n";

        assertEquals(expected, actualContent.toString());

    }

    @Test
    void admitApplicant() {

        Applicants applicantsInput = new Applicants("David Uche", 18, Gender.MALE);

        ApplicantServiceImpl applicantService = new ApplicantServiceImpl();

        ByteArrayOutputStream actualContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualContent));

        applicantService.displayApplicantData(applicantsInput);

        String expected;
        if(applicantsInput.getAge() >= 18) {
            expected = "FullName: David Uche\nGender: MALE\nAge: 18\n";
        } else
            expected = "FullName: David Uche\nGender: MALE\nAge: 18\n";

        assertEquals(expected, actualContent.toString());


    }
}
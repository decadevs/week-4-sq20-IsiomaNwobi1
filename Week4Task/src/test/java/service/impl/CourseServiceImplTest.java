package service.impl;

import enums.CourseOffer;
import enums.Gender;
import model.Course;
import model.Student;
import model.Teacher;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CourseServiceImplTest {

    @Test
    void teachCourse() {

        Teacher teacherInput = new Teacher("Sarah Abdul", 26, Gender.FEMALE);

        Course courseInput = new Course(CourseOffer.JAVA);

        CourseServiceImpl courseService = new CourseServiceImpl();

        ByteArrayOutputStream actualContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualContent));

        courseService.teachCourse(teacherInput, courseInput);

        String expected = "FullName: Sarah Abdul\nGender: FEMALE\nAge: 26\nCourse Taught: JAVA\n";

        assertEquals(expected, actualContent.toString());

    }



    @Test
    void takeCourse() {

        Student studentInput = new Student("Chinedu Mbah", 18, Gender.MALE);

        Course courseInput = new Course(CourseOffer.JAVA);

        CourseServiceImpl courseService = new CourseServiceImpl();

        ByteArrayOutputStream actualContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualContent));

        courseService.takeCourse(studentInput, courseInput);

        String expected = "FullName: Chinedu Mbah\nGender: MALE\nAge: 18\nCourse Taken: JAVA\n";

        assertEquals(expected, actualContent.toString());

    }
}
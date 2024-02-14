import enums.CourseOffer;
import enums.Gender;
import model.*;
import service.impl.ApplicantServiceImpl;
import service.impl.CourseServiceImpl;
import service.impl.PrincipalServiceImpl;


public class Main {
    public static void main(String[] args) {


        Course course1 = new Course(CourseOffer.JAVA);
        Course course2 = new Course(CourseOffer.NODE);
        Course course3 = new Course(CourseOffer.DOTNET);

        Teacher teacher1 = new Teacher("Sarah Abdul", 26, Gender.FEMALE);
        Teacher teacher2 = new Teacher("Onyeka Eche", 28, Gender.MALE);
        Teacher teacher3 = new Teacher("Dan Ebuka", 30, Gender.MALE);
        CourseServiceImpl teachCourse1 = new CourseServiceImpl();
        CourseServiceImpl teachCourse2 = new CourseServiceImpl();
        CourseServiceImpl teachCourse3 = new CourseServiceImpl();

        Student student1 = new Student("Chinedu Mbah", 18, Gender.MALE);
        Student student2 = new Student("Ruth Okafor", 19, Gender.FEMALE);
        Student student3 = new Student("Ngozi Eze", 19, Gender.FEMALE);
        CourseServiceImpl takeCourse1 = new CourseServiceImpl();
        CourseServiceImpl takeCourse2 = new CourseServiceImpl();
        CourseServiceImpl takeCourse3 = new CourseServiceImpl();

        Principal principal = new Principal("Chris Clement", 60, Gender.MALE);
        PrincipalServiceImpl principalData = new PrincipalServiceImpl();

        Applicants applicants1 = new Applicants("David Uche", 18, Gender.MALE);
        Applicants applicants2 = new Applicants("Chisom Oko", 17, Gender.FEMALE);
        ApplicantServiceImpl applicantData = new ApplicantServiceImpl();

        System.out.println("TEACHER DATA");
        teachCourse1.teachCourse(teacher1, course1);
        System.out.println("********************");
        teachCourse2.teachCourse(teacher2, course2);
        System.out.println("********************");
        teachCourse3.teachCourse(teacher3, course3);

        System.out.println("                    ");
        System.out.println("STUDENT DATA");
        takeCourse1.takeCourse(student1, course1);
        System.out.println("********************");
        takeCourse2.takeCourse(student2,course2);
        System.out.println("********************");
        takeCourse3.takeCourse(student3, course3);

        System.out.println("                    ");
        System.out.println("PRINCIPAL DATA");
        principalData.displayPrincipalData(principal);

        System.out.println("                    ");
        System.out.println("APPLICANT DATA");
        applicantData.displayApplicantData(applicants1);
        System.out.println("********************");
        applicantData.displayApplicantData(applicants2);

        System.out.println("                    ");
        System.out.println("Successful Admission Data");
        applicantData.admitApplicant(applicants1);
        applicantData.admitApplicant(applicants2);

    }
}

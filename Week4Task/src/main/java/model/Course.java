package model;

import enums.CourseOffer;

public class Course {

    private CourseOffer courseOffer;

    public Course(CourseOffer courseOffer) {
        this.courseOffer = courseOffer;
    }

    public CourseOffer getCourseOffer() {
        return courseOffer;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseOffer=" + courseOffer +
                '}';
    }
}

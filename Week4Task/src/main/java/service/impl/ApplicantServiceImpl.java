package service.impl;

import model.Applicants;
import service.ApplicantService;

public class ApplicantServiceImpl implements ApplicantService {
    @Override
    public void displayApplicantData(Applicants applicants) {
        System.out.println("FullName: " + applicants.getName() +
                "\n" + "Gender: " + applicants.getGender() +
                "\n" + "Age: " + applicants.getAge());
    }

    @Override
    public void admitApplicant(Applicants applicants) {
        if(applicants.getAge() >= 18) {
            System.out.println("CONGRATULATIONS!!! " + applicants.getName() + " you have been offered admission into Decagon to study Java");
        } else {
            System.out.println("Hi " + applicants.getName() + " we regret to inform you that you have been denied admission, try again when you turn 18");
        }
    }
}

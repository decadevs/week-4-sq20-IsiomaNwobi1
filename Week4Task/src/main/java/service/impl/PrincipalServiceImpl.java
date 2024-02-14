package service.impl;

import model.Principal;
import service.PrincipalService;

public class PrincipalServiceImpl implements PrincipalService {

    @Override
    public void displayPrincipalData(Principal principal) {
        System.out.println("FullName: " + principal.getName() +
                "\n" + "Gender: " + principal.getGender() +
                "\n" + "Age: " + principal.getAge());
    }
}

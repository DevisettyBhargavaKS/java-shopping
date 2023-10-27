package org.example.controller;

import org.example.App;
import org.example.View.Loginpage;
import org.example.controller.implementation.IAuthController;
import org.example.model.Role;
import org.example.model.User;
import org.example.utils.AppExcpetion;
import org.example.utils.StringUtils;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.example.utils.AppInput.enterint;
import static org.example.utils.AppInput.enterstring;
import static org.example.utils.FileUtils.getCredentialsFile;
import static org.example.utils.userutils.setloggedinuser;
import static org.example.utils.utils.println;

public class AuthController implements IAuthController {

    private final AppController appController;
    private final Loginpage loginpage;


    public AuthController(AppController appController) {
        this.appController = appController;
        loginpage = new Loginpage();
    }

    public void authMenu() {
        appController.printAuthMenu();
        int choice;
        try {
            choice = enterint(StringUtils.ENTER_CHOICE);
            if (choice == 1) {
                login();
            } else if (choice == 2) {
                register();

            } else {
                invalidchoice(new AppExcpetion(StringUtils.INVALID_CHOICE));
            }
        } catch (AppExcpetion appExcpetion) {
            invalidchoice(appExcpetion);
        }
    }

    private void invalidchoice(AppExcpetion e) {
        println(e.getMessage());
        authMenu();
    }

    @Override
    public void login() {
        String email, password;
        email = enterstring(StringUtils.ENTER_EMAIL);
        password = enterstring(StringUtils.ENTER_PASSWORD);


        User user = validateUser(email, password);


        if (user != null) {
            setloggedinuser(user);
            HomeController.printMenu();
        } else {

            loginpage.printinvalidcredentials();
            authMenu();

        }

    }


    private User validateUser(String email, String password) {
        try {
            Scanner scanner = new Scanner(getCredentialsFile());
            while (scanner.hasNext()) {
                String value = scanner.next().trim();
                if (!value.startsWith("id")) {
                    String[] userArray = value.split(",");
                    if (userArray[2].equals(email) && userArray[3].equals(password)) {
                        User user = new User();
                        user.setId(Integer.parseInt(userArray[0]));
                        user.setName(userArray[1]);
                        user.setEmail(userArray[2]);
                        user.setPassword(userArray[3]);

                        if (user.getEmail().equals("admin@admin.com"))
                            user.setRole(Role.Admin);
                        else

                            user.setRole(Role.User);
                        return user;

                    }
                }
            }
            scanner.close();


        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return null;
    }


    @Override
    public void register() {

    }

    @Override
    public void logout() {

    }
}



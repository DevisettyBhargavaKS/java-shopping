package org.example.controller;

import org.example.View.Welcomepage;
import org.example.controller.implementation.IAppController;

public class AppController implements IAppController {

    private final Welcomepage welcomepage;
    private final AuthController authController;

    public AppController() {
        welcomepage = new Welcomepage();
        authController = new AuthController(this);
    }

    @Override
    public void init() {
        welcomepage.welcome();
        authController.authMenu();
    }

    @Override
    public void printAuthMenu() {
        welcomepage.printAuthMenu();

    }


}

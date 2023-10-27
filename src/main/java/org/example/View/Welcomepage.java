package org.example.View;

import org.example.utils.StringUtils;

import static org.example.utils.utils.println;


public class Welcomepage {
    public void welcome() {
        try {
            println(StringUtils.WELCOME_MESSAGE);
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
    }

    public void printAuthMenu() {
        println(StringUtils.AUTH_MENU);
    }
}

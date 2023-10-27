package org.example.utils;

import java.util.InputMismatchException;

public class AppInput {
    public static String enterstring(String msg){
        utils.print(msg);
        return AppScanner.getScanner().nextLine();
    }
    public static int enterint(String msg)throws AppExcpetion{
        utils.print(msg);
        int input;
        try{
            input=AppScanner.getScanner().nextInt();

        }catch (InputMismatchException e){
            throw new AppExcpetion("Invalid input!!!Please enter a valid input");
        }
        return input;
    }

}

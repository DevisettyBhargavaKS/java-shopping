package org.example.utils;

import org.example.model.User;

public class userutils {
    private static User loggedinuser;

    public static User getloggedinuser() {
        return loggedinuser;
    }

    public static void setloggedinuser(User loggedinuser) {
        userutils.loggedinuser = loggedinuser;
    }
}

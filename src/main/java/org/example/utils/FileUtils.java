package org.example.utils;

import java.io.File;

public class FileUtils {
    private static File credentialsFile;
    public static File getCredentialsFile(){
        if (credentialsFile==null)
            credentialsFile =new File("");
        return credentialsFile;

    }
}

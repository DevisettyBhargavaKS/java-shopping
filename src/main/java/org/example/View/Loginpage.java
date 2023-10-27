package org.example.View;

import org.example.utils.StringUtils;

import static org.example.utils.utils.println;

public class Loginpage {
    public void printinvalidcredentials() {
        try {
            println("#--------#");
            println(StringUtils.INVALID_CREDENTIALS);
            println("#---------#");
            Thread.sleep(1000);

        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}

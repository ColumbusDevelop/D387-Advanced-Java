package edu.wgu.d387_sample_code.international;

import java.util.Locale;
import java.util.ResourceBundle;

//
// B1
// Threadable function
// Language constructor
// Takes language data attribution and fetches Data bundle from the input
// Override run function so I can output custom console output

public class WelcomeDisplay implements Runnable {
    Locale language;

    public WelcomeDisplay (Locale language) {
        this.language = language;
    }
    public String translateWelcomeMessage() {
        ResourceBundle bundle = ResourceBundle.getBundle("translation", language);
        return bundle.getString("welcome");
    }

    @Override
    public void run() {
        System.out.println("Thread is running!");
    }
}

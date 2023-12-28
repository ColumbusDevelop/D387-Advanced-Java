package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.international.WelcomeDisplay;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

		//
		// B1
		// Creates instances of WelcomeDisplay method
		// Gives WelcomeDisplay methods threading functionality
		// Starts threads

		WelcomeDisplay welcomeDisplayEnglish = new WelcomeDisplay(Locale.US);
		WelcomeDisplay welcomeDisplayFrench = new WelcomeDisplay(Locale.CANADA_FRENCH);

		Thread usThread = new Thread(welcomeDisplayEnglish);
		Thread frThread = new Thread(welcomeDisplayFrench);

		usThread.start();
		frThread.start();
	}
}

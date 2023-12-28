package edu.wgu.d387_sample_code.international;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

//
// B1
// Cross Origin Support
// Input language object
// Translates welcome message
// Returns welcome message

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class WelcomeController {
    @GetMapping("/welcome")
    public ResponseEntity<String> retrieveWelcomeMessage (@RequestParam("lang") String lang) {
        Locale language = Locale.forLanguageTag(lang);
        WelcomeDisplay welcomeDisplay = new WelcomeDisplay(language);
        return new ResponseEntity<String> (welcomeDisplay.translateWelcomeMessage(), HttpStatus.OK);
    }
}

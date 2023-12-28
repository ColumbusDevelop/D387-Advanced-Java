package edu.wgu.d387_sample_code.international;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

//
// B3
// Maps to time base URL
// CORS support
// Maps to presenttationTimes for time conversion method

@RestController
@RequestMapping("/times")
@CrossOrigin(origins = "http://localhost:4200")


public class TimeController {
    @GetMapping("/presentationTimes")
    public String convertTimeZone() {
        return TimeConverter.timeConversion();
    }
}

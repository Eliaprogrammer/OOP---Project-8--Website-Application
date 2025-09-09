// The GreetingController handles HTTP requests for displaying and submitting the greeting form
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.DateTimeException;
import java.time.LocalDate;

@Controller
    public class GreetingController {

        //Handling the GET request for displaying
        @RequestMapping("/greeting")
        public String greetingForm(Model model) {
            //creating a greeting object
            model.addAttribute("greeting", new Greeting());
            return "greeting"; //Return the greeting html
        }

        //Handle the POST request once submitted
        @PostMapping("/greeting")
        public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
            try {
            //Attempts to format the date in a specific way
            LocalDate date = LocalDate.of(greeting.getYear(), greeting.getMonth(), greeting.getDay());
            String formattedDate = String.format("%02d/%02d/%04d", date.getMonthValue(), date.getDayOfMonth(), date.getYear());
            model.addAttribute("formattedDate", formattedDate);
        } catch (DateTimeException e) {
                //Handling error occur due to invalid input
            model.addAttribute("error", "Invalid data entered");
            model.addAttribute("greeting", greeting);
            return "greeting"; //Return to greeting page if error occur
        }

        //Adding the greeting to the model
        model.addAttribute("greeting", greeting);
        return "result"; //returns the result.html page
        }
    }


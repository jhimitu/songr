package com.jhia.lab11.songr;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//when we have a controller that is not rest,
// Thymeleaf, our view engine will try to handle what we return from these methods
//Thymeleaf expects the string we return to be the name of a template
@Controller
public class NotARestController {
    @GetMapping("/notresthello")
    public String getNotRestHello(Model m) {
        //This means Thymeleaf should render a template named "hello"
        String [] allTheNames = new String[]{"SZA", "Bryson Tiller", "Summer Walker", "Khalid"};
//        m.addAttribute("name", "Jhia");
        m.addAttribute("names", allTheNames);
        return "hello";
    }
}

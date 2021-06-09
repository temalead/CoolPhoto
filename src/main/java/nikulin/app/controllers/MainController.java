package nikulin.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
    @GetMapping
    public String getMainPage(){
        return "main";
    }
    @GetMapping("hi")
    public String getMainPage2(){
        return "hi";
    }
}
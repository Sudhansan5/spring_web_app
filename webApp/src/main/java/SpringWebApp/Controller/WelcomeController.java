package SpringWebApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
    @RequestMapping("/")
    public String homePage() {
        System.out.println("message() called...................");
        return "index";
    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }

}
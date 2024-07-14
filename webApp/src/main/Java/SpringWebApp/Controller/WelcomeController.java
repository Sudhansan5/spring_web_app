package SpringWebApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
    @RequestMapping("/")
    public String message() {
        System.out.println("message() called...................");
        return "index.jsp";
    }

}
package linkedin.boot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloFrankController {
    
    @GetMapping("/")    
    public String get() {
        return "America, I'm only getting started.";
    }
}

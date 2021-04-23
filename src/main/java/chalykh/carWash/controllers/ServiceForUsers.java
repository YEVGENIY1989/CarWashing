package chalykh.carWash.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/carWash")
public class ServiceForUsers {


    @GetMapping()
    public String mainPageServiceForUsers(){


        return "carWash";
    }

}

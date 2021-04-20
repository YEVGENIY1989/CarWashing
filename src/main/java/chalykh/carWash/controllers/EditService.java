package chalykh.carWash.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("edit")
public class EditService {


    @GetMapping()
    public String addService(Model model){



        System.out.println("In GET in EditService controller");
        return "editService.html";
    }



}

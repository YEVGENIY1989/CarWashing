package chalykh.carWash.controllers;


import chalykh.carWash.domain.Admin;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Authorization {

    @Autowired
    public Authorization(){

    }

   @GetMapping
    public String authorizationAdmin(@ModelAttribute("admin")Admin admin){
       System.out.println("In GET");
        return "authorization.html";
    }

    @PostMapping()
    public String goToEditOrClient(@ModelAttribute("admin")Admin admin ){

        System.out.println("In POST");

        return "redirect:/edit";
    }

}

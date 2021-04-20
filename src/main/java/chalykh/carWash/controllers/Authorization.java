package chalykh.carWash.controllers;


import chalykh.carWash.dao.AdminDao;
import chalykh.carWash.domain.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Authorization {

    private AdminDao adminDao;

    @Autowired
    public Authorization(AdminDao adminDao){
        this.adminDao = adminDao;
    }

   @GetMapping
    public String authorizationAdmin(@ModelAttribute("admin")Admin admin){
       System.out.println("In GET");
        return "authorization.html";
    }

    @PostMapping()
    public String goToEditOrClient(@ModelAttribute("admin")Admin admin ){

        for(Admin ad : adminDao.getAll()){
            if (ad.getLogin().equals(admin.getLogin()) && ad.getPassword().equals(admin.getPassword()))
                return ""
        }

        return "redirect:/edit";
    }

}

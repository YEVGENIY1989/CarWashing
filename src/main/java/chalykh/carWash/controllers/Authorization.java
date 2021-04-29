package chalykh.carWash.controllers;


import chalykh.carWash.dao.AdminDao;
import chalykh.carWash.dao.UserDao;
import chalykh.carWash.domain.Admin;

import chalykh.carWash.domain.User;
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

    private AdminDao adminDao;
    private Model model;
    private boolean isFailedAthor;
    private UserDao userDao;

    @Autowired
    public Authorization(AdminDao adminDao, UserDao userDao){
        this.adminDao = adminDao;
        this.userDao = userDao;
    }

   @GetMapping
    public String authorizationAdmin(@ModelAttribute("admin")Admin admin, Model model){

        if (isFailedAthor)
            model.addAttribute("error", "Ошибка авторизации. Неправильный логин или пароль");

       User user = userDao.findById(1);

       model.addAttribute("user", user);

       return "authorization.html";
    }

    @PostMapping()
    public String goToEditOrClient(@ModelAttribute("admin")Admin admin ){

        for(Admin ad : adminDao.getAll()){
            if (ad.getLogin().equals(admin.getLogin()) && ad.getPassword().equals(admin.getPassword()))
                return "redirect:/edit";
        }
        isFailedAthor = true;
        return "redirect:/";
    }

}

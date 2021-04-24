package chalykh.carWash.controllers;

import chalykh.carWash.dao.ServiceDao;
import chalykh.carWash.domain.ServiceCarWash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("edit")
public class EditService {

    ServiceDao serviceDao;

    @Autowired
    public EditService(ServiceDao serviceDao){
        this.serviceDao = serviceDao;
    }

    @GetMapping()
    public String addService(Model model){


        serviceDao.deleteRowOfNewService("Мойка");
        System.out.println("In GET in EditService controller");
        return "editService.html";
    }



}

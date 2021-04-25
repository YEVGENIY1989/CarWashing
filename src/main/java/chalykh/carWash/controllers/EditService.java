package chalykh.carWash.controllers;

import chalykh.carWash.dao.ServiceDao;
import chalykh.carWash.domain.ServiceCarWash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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


        model.addAttribute("serviceList", serviceDao.getAll());

        return "editService.html";
    }

    @PostMapping()
    public String deleteFromServiceList(@RequestParam String nameOfService){
        serviceDao.deleteRowOfNewService(nameOfService);
        return "redirect:/edit";
    }

    @PostMapping("/add")
    public String addToServiceList(@RequestParam String newNameOfService, @RequestParam int cost){
        ServiceCarWash serviceCarWash = new ServiceCarWash(newNameOfService, cost);
        serviceDao.insertNewService(serviceCarWash);
        return "redirect:/edit";
    }



}

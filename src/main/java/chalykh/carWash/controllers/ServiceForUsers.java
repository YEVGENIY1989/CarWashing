package chalykh.carWash.controllers;

import chalykh.carWash.dao.ClientDao;
import chalykh.carWash.dao.ServiceDao;
import chalykh.carWash.domain.ServiceCarWash;
import chalykh.carWash.helper.DataAndTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/carWash")
public class ServiceForUsers {

    private DataAndTime dataAndTime;
    private ServiceDao serviceDao;
    private ClientDao clientDao;


    @Autowired
    public ServiceForUsers(ServiceDao serviceDao, ClientDao clientDao){
        this.clientDao = clientDao;
        this.serviceDao = serviceDao;
        dataAndTime = new DataAndTime();
    }

    @GetMapping()
    public String mainPageServiceForUsers(Model model){

        model.addAttribute("dataAndTime", dataAndTime);
        model.addAttribute("serviseList", serviceDao);

        return "carWash";
    }

}

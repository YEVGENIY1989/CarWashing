package chalykh.carWash.controllers;

import chalykh.carWash.dao.ClientDao;
import chalykh.carWash.dao.ServiceDao;
import chalykh.carWash.domain.Client;
import chalykh.carWash.domain.ServiceCarWash;
import chalykh.carWash.helper.DataAndTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/carWash")
public class ServiceForUsers {

    private DataAndTime dataAndTime;
    private ServiceDao serviceDao;
    private ClientDao clientDao;
    private Map<String, List<String>> freeTime;

    @Autowired
    public ServiceForUsers(ServiceDao serviceDao, ClientDao clientDao){
        this.clientDao = clientDao;
        this.serviceDao = serviceDao;
        dataAndTime = new DataAndTime();
        freeTime = new HashMap<>();
    }

    @GetMapping()
    public String mainPageServiceForUsers(Model model){


        model.addAttribute("data", dataAndTime.getDatesWeek());
        model.addAttribute("time", dataAndTime.getTimeOfDay());

        model.addAttribute("serviseList", serviceDao.getAll());
        model.addAttribute("client", new Client("1","1"));

        return "carWash";
    }

    @PostMapping()
    public String createNewClientService(@RequestParam String selectService, @ModelAttribute("client")Client client){

        System.out.println(selectService);
        return "redirect:/carWash";
    }

}

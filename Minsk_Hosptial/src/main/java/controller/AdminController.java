package controller;

import entity.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService service;

    @RequestMapping("/addAccount.do")
    @ResponseBody
    public String addAdmin(Doctor doctor){
        if(service.insertDoctor(doctor))
            return "yes";
        return "no";
    }
}

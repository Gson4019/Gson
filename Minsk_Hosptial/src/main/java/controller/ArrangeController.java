package controller;

import entity.Workarrange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.ArrangeService;

@Controller
@RequestMapping("/arrange")
public class ArrangeController {
    @Autowired
    private ArrangeService service;

    @RequestMapping("/addArrange.do")
    @ResponseBody
    public String addArrange(Workarrange arrange){
        if(service.AddWork(arrange))
            return "yes";
        return "no";
    }
}

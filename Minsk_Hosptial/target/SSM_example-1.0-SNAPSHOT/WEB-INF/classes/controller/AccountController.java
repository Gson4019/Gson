package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.AccountService;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService service;

    @RequestMapping("/addAccount.do")
    @ResponseBody
    public String addAccount(String account, String password){
        if(service.insertAccount(account,password)){
            return "yes";
        }
        return "no";
    }

    @RequestMapping("/queryPasswordByAccount.do")
    @ResponseBody
    public String queryPasswordByAccount(String account){
        return service.queryPasswordByAccount(account);
    }

    @RequestMapping("/updatePwd.do")
    @ResponseBody
    public String updatePwd(String account,String password){
        if(service.updatePwd(account,password))
            return "yes";
        return "no";
    }
}

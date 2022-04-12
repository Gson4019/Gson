package controller;

import entity.Account;
import entity.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.DoctorService;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService service;

    @RequestMapping(value = "/doctorLogin.do",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String doctorLogin(String account,String password, HttpSession session){
        if(service.loginCheck(account,password)){
            session.setAttribute("account",new Account(account,password));
            return "yes";
        }
        return "no";
    }

    /*控制器方法相应Ajax请求，返回doctor的json格式*/
    @RequestMapping("/selectDoctorByDno.do")
    @ResponseBody
    public Doctor selectDoctorByDno(Integer Dno){
        Doctor doctor = service.SelectByDno(Dno);
        return doctor;
    }

    /*控制器方法相应Ajax请求，返回doctor的json格式*/
    @RequestMapping("/queryDoctorByAccount.do")
    @ResponseBody
    public Doctor queryDoctorByAccount(HttpSession session){
        Account account = (Account) session.getAttribute("account");
        Doctor doctor = service.queryDoctorByAccount(account.getAccount());
        session.setAttribute("doctor",doctor);
        return doctor;
    }

    @RequestMapping(value = "/queryAccount.do",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String queryAccount(HttpSession session){
        Doctor doctor = (Doctor) session.getAttribute("doctor");
        return service.queryAccount(doctor.getDno());
    }

    @RequestMapping(value = "/updateDoctorInfo.do",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String updateDoctorInfo(Doctor doctor,HttpSession session){
        Doctor init_doctor = (Doctor) session.getAttribute("doctor");
        doctor.setDno(init_doctor.getDno());
        System.out.println(doctor);
        if(service.updateDoctorInfo(doctor) > 0)
            return "yes";
        return "no";
    }
}

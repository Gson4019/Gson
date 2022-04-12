package controller;

import entity.Patient_Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.TicketService;

import javax.servlet.http.HttpSession;

@Controller
public class TicketController {
    @Autowired
    private TicketService service;

    @RequestMapping("/queryTicketAndSetQueueNum.do")
    @ResponseBody
    public Patient_Ticket QueryTicket(HttpSession session){
        Patient_Ticket ticket = (Patient_Ticket) session.getAttribute("ticket");
        //here distribute queue number to ticket
        service.addQueueNum(ticket);
        return ticket;
    }
}

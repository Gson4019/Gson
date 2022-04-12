package service;

import dao.TicketDao;
import entity.Patient_Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService{
    @Autowired
    private TicketDao dao;

    @Override
    public boolean insertTicket(Patient_Ticket ticket){

        if(dao.insertTicket(ticket) == 1)
            return true;
        return false;
    }

    @Override
    public Patient_Ticket queryTicketByPno(int Pno){
        return dao.queryTicketByPno(Pno);
    }

    @Override
    public boolean addQueueNum(Patient_Ticket ticket){
        if(dao.addQueueNum(ticket)>0)
            return true;
        return false;
    }

}

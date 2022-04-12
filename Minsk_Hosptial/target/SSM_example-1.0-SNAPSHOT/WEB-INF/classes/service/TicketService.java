package service;

import entity.Patient_Ticket;

public interface TicketService {
    boolean insertTicket(Patient_Ticket ticket);

    Patient_Ticket queryTicketByPno(int Pno);

    boolean addQueueNum(Patient_Ticket ticket);

}

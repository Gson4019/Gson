package dao;

import entity.Patient_Ticket;

public interface TicketDao {

    int insertTicket(Patient_Ticket ticket);

    Patient_Ticket queryTicketByPno(int Pno);

    int addQueueNum(Patient_Ticket ticket);
}

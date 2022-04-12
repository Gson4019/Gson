package service;

import entity.Patient;
import entity.Patient_Ticket;

import java.util.List;

public interface PatientService{
    Patient queryPatientByQueueNum(int queuenum);

    boolean insertPatient(Patient patient);

    boolean addRoomName(Patient patient);

    boolean addQueueNum(Patient patient);

    boolean insertTicket(Patient_Ticket ticket);

    List<Patient> queryPatients();

    int QueryMaxQueueNum();

    boolean DeletePatientByQueueNum(int QueueNum);

    boolean DeleteTicketByQueueNum(int QueueNum);

    boolean UpdateStatusToCall(int QueueNum);

    boolean UpdateStatusToPass(int QueueNum);

    boolean add_Picture_Description(int pno,String picture,String description);

    String get_PictureByQueueNum(int queuenum);

    String get_DescriptionByQueueNum(int queuenum);

    boolean add_diagnosis_text_medicine_text(int QueueNum,String diagnosis_text,String medicine_text);
}

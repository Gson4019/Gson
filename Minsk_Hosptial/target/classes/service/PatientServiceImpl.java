package service;

import dao.PatientDao;
import entity.Patient;
import entity.Patient_Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientDao dao;

    @Override
    public Patient queryPatientByQueueNum(int queuenum){
        return dao.queryPatientByQueueNum(queuenum);
    }

    @Override
    public boolean insertPatient(Patient patient){
        if(dao.insertPatient(patient)>0)
            return true;
        return false;
    }

    @Override
    public boolean addRoomName(Patient patient){
        if(dao.addRoomName(patient)>0)
            return true;
        return false;
    }

    public boolean addQueueNum(Patient patient){
        if(dao.addQueueNum(patient)>0)
            return true;
        return false;
    }

    @Override
    public boolean insertTicket(Patient_Ticket ticket){
        if(dao.insertTicket(ticket)>0)
            return true;
        return false;
    }

    @Override
    public List<Patient> queryPatients(){
        return dao.queryPatients();
    }

    @Override
    public int QueryMaxQueueNum(){
        return dao.QueryMaxQueueNum();
    }

    @Override
    public boolean DeletePatientByQueueNum(int QueueNum){
        if(DeleteTicketByQueueNum(QueueNum)){
            if(dao.DeletePatientByQueueNum(QueueNum)>0)
                return true;}
        return false;
    }

    @Override
    public boolean DeleteTicketByQueueNum(int QueueNum){
        if(dao.DeleteTicketByQueueNum(QueueNum)>0)
            return true;
        return false;
    }

    @Override
    public boolean UpdateStatusToCall(int QueueNum){
        if(dao.UpdateStatusToCall(QueueNum)>0)
            return true;
        return false;
    }

    @Override
    public boolean UpdateStatusToPass(int QueueNum){
        if(dao.UpdateStatusToPass(QueueNum)>0)
            return true;
        return false;
    }

    @Override
    public boolean add_Picture_Description(int pno,String picture,String description){
        if(dao.add_Picture_Description(pno,picture,description) > 0)
            return true;
        return false;
    }

    @Override
    public String get_PictureByQueueNum(int queuenum){
        return dao.get_PictureByQueueNum(queuenum);
    }

    @Override
    public String get_DescriptionByQueueNum(int queuenum){
        return dao.get_DescriptionByQueueNum(queuenum);
    }

    @Override
    public boolean add_diagnosis_text_medicine_text(int QueueNum,String diagnosis_text,String medicine_text){
        if(dao.add_diagnosis_text_medicine_text(QueueNum,diagnosis_text,medicine_text) > 0)
            return true;
        return false;
    }

}

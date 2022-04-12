package dao;

import entity.Patient;
import entity.Patient_Ticket;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PatientDao {
    Patient queryPatientByQueueNum(int queuenum);

    int insertPatient(Patient patient);

    int addRoomName(Patient patient);

    int addQueueNum(Patient patient);

    int insertTicket(Patient_Ticket ticket);

    List<Patient> queryPatients();

    int QueryMaxQueueNum();

    int DeletePatientByQueueNum(int QueueNum);

    int DeleteTicketByQueueNum(int QueueNum);

    int UpdateStatusToCall(int QueueNum);

    int UpdateStatusToPass(int QueueNum);

    int add_Picture_Description(@Param("pno") int pno,@Param("picture") String picture,@Param("description") String description);

    String get_PictureByQueueNum(int queuenum);

    String get_DescriptionByQueueNum(int queuenum);

    int add_diagnosis_text_medicine_text(@Param("QueueNum")int QueueNum,@Param("diagnosis_text")String diagnosis_text,@Param("medicine_text")String medicine_text);

}

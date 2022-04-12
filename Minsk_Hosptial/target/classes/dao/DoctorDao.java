package dao;

import entity.Doctor;

public interface DoctorDao {

    Doctor selectDoctorByDno(int Dno);

    String selectPassword(String account);

    Doctor queryDoctorByAccount(String account);

    String queryAccount(int Dno);

    int updateDoctorInfo(Doctor doctor);
}

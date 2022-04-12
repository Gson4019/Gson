package service;

import entity.Doctor;

public interface DoctorService {

    public Doctor SelectByDno(int Dno);

    public boolean loginCheck(String account,String password);

    Doctor queryDoctorByAccount(String account);

    String queryAccount(int Dno);

    int updateDoctorInfo(Doctor doctor);
}

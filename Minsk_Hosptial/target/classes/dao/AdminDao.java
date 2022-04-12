package dao;

import entity.Doctor;

public interface AdminDao {

    int insertDoctor(Doctor doctor);   //return the number of rows affected

    int deleteDoctor(Doctor doctor);

    Doctor queryDoctorByDno(int Dno);

}

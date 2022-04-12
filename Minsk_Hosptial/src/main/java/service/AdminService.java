package service;

import entity.Doctor;

public interface AdminService {

    public boolean insertDoctor(Doctor doctor);

    public boolean deleteDoctor(int Dno);

    public Doctor queryDoctorByDno(int Dno);
}

package service;

import dao.AdminDao;
import entity.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao dao;

    @Override
    public boolean insertDoctor(Doctor doctor){

        if(dao.insertDoctor(doctor) == 1)       //rows affected == 1
            return true;
        return false;
    }

    @Override
    public boolean deleteDoctor(int Dno){
        Doctor doctor = dao.queryDoctorByDno(Dno);
        int rows = dao.deleteDoctor(doctor);
        if(rows == 1)
            return true;
        return false;
    }

    @Override
    public Doctor queryDoctorByDno(int Dno){
        return dao.queryDoctorByDno(Dno);
    }

}

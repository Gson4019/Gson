package service;

import dao.DoctorDao;
import entity.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorDao dao;

    @Override
    public boolean loginCheck(String account,String password){
        String pwd = dao.selectPassword(account);
        if(password.equals(pwd)){                 //判断字符串相等用equals函数
            return true;
        }
        return false;
    }

    @Override
    public Doctor SelectByDno(int Dno){
        Doctor doctor = dao.selectDoctorByDno(Dno);
        return doctor;
    }

    @Override
    public Doctor queryDoctorByAccount(String account){
        return dao.queryDoctorByAccount(account);
    }

    @Override
    public String queryAccount(int Dno){
        return dao.queryAccount(Dno);
    }

    @Override
    public int updateDoctorInfo(Doctor doctor){
        return dao.updateDoctorInfo(doctor);
    }
}

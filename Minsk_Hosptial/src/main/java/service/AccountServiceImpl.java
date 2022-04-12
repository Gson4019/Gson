package service;

import dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountDao dao;

    @Override
    public String queryPasswordByAccount(String account){
        String pwd =  dao.queryPasswordByAccount(account);
        return pwd;
    }

    @Override
    public boolean insertAccount(String account,String password){
        if(dao.insertAccount(account,password) == 1)
            return true;
        return false;
    }
    @Override
    public boolean updatePwd(String account,String password){
        if(dao.updatePwd(account,password) > 0)
            return true;
        return false;
    }

}

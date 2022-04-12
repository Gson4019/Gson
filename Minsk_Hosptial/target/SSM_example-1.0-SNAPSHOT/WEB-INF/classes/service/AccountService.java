package service;

public interface AccountService {

    String queryPasswordByAccount(String account);

    boolean insertAccount(String account,String password);

    boolean updatePwd(String account,String password);
}

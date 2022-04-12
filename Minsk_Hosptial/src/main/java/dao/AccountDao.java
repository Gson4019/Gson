package dao;

import org.apache.ibatis.annotations.Param;

public interface AccountDao {

    String queryPasswordByAccount(String account);

    int insertAccount(String account,String password);

    int updatePwd(@Param("account") String account,@Param("password") String password);
}

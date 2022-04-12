package service;

import dao.ArrangeDao;
import entity.Workarrange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArrangeServiceImpl implements ArrangeService {
    @Autowired
    private ArrangeDao dao;

    @Override
    public List<Workarrange> queryWorkArrangeByWeekNum(int WeekNum){
        return dao.queryWorkArrangeByWeekNum(WeekNum);
    }

    @Override
    public boolean AddWork(Workarrange workarrange){
        int rows = dao.AddWork(workarrange);
        if(rows == 1)
            return true;
        return false;
    }

}

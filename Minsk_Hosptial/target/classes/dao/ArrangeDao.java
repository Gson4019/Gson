package dao;

import entity.Workarrange;

import java.util.List;

public interface ArrangeDao {
    List<Workarrange> queryWorkArrangeByWeekNum(int WeekNum);

    int AddWork(Workarrange workarrange);
}

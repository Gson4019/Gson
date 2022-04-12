package service;

import entity.Workarrange;

import java.util.List;

public interface ArrangeService {
    public List<Workarrange> queryWorkArrangeByWeekNum(int WeekNum);

    public boolean AddWork(Workarrange workarrange);
}

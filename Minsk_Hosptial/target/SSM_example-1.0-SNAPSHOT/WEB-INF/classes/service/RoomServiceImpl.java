package service;

import dao.RoomDao;
import entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RoomServiceImpl implements RoomService{
    @Autowired
    private RoomDao dao;

    public boolean insertRoom(Room room){
        if(dao.insertRoom(room) > 0)
            return true;
        return false;
    }

    public Room queryRoomByRno(int Rno){
        return dao.queryRoomByRno(Rno);
    }
}

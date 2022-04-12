package dao;

import entity.Room;

public interface RoomDao {

    int insertRoom(Room room);

    Room queryRoomByRno(int Rno);
}

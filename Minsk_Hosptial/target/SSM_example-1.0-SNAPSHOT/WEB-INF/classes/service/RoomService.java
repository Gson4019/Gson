package service;

import entity.Room;
import org.springframework.stereotype.Service;

public interface RoomService {

    boolean insertRoom(Room room);

    Room queryRoomByRno(int Ron);

}

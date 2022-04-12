package controller;

import entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.RoomService;

@Controller
public class RoomController {
    @Autowired
    private RoomService service;

    @RequestMapping("/insertRoom.do")
    @ResponseBody
    public String insertRoom(Room room) {
        if (service.insertRoom(room))
            return "yes";
        return "no";
    }
}

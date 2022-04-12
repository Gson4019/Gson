package entity;

public class Workarrange {
    private int Wno;
    private Doctor doctor;
    private Room room;
    private String BeginTime;
    private String EndTime;
    private int weekNum;

    public int getWeekNum() {
        return weekNum;
    }

    public void setWeekNum(int weekNum) {
        this.weekNum = weekNum;
    }

    public int getWno() {
        return Wno;
    }

    public void setWno(int wno) {
        Wno = wno;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getBeginTime() {
        return BeginTime;
    }

    public void setBeginTime(String beginTime) {
        BeginTime = beginTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    @Override
    public String toString() {
        return "Workarrange{" +
                "Wno=" + Wno +
                ", weekNum=" + weekNum +
                ", doctor=" + doctor +
                ", room=" + room +
                ", BeginTime='" + BeginTime + '\'' +
                ", EndTime='" + EndTime + '\'' +
                '}';
    }
}

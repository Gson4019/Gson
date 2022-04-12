package entity;

public class Room {
    private int Rno;
    private String Rname;
    private String BeginTime;
    private String EndTime;
    private String respon_person;

    public int getRno() {
        return Rno;
    }

    public void setRno(int rno) {
        Rno = rno;
    }

    public String getRname() {
        return Rname;
    }

    public void setRname(String rname) {
        Rname = rname;
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

    public String getRespon_person() {
        return respon_person;
    }

    public void setRespon_person(String respon_person) {
        this.respon_person = respon_person;
    }

    @Override
    public String toString() {
        return "Room{" +
                "Rno=" + Rno +
                ", Rname='" + Rname + '\'' +
                ", BeginTime='" + BeginTime + '\'' +
                ", EndTime='" + EndTime + '\'' +
                ", respon_person='" + respon_person + '\'' +
                '}';
    }
}

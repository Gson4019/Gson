package entity;

public class Patient_Ticket {
    private int Tno;
    private String Rname;
    private String Psex;
    private int QueueNum;
    private String Pname;
    private int Pno;
    private String Pkind;

    public Patient_Ticket() {
    }

    public Patient_Ticket(String rname, String psex, int queueNum, String pname, int pno, String pkind) {
        Rname = rname;
        Psex = psex;
        QueueNum = queueNum;
        Pname = pname;
        Pno = pno;
        Pkind = pkind;
    }

    public int getTno() {
        return Tno;
    }

    public void setTno(int tno) {
        Tno = tno;
    }

    public String getRname() {
        return Rname;
    }

    public void setRname(String rname) {
        Rname = rname;
    }

    public String getPsex() {
        return Psex;
    }

    public void setPsex(String psex) {
        Psex = psex;
    }

    public int getQueueNum() {
        return QueueNum;
    }

    public void setQueueNum(int queueNum) {
        QueueNum = queueNum;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String pname) {
        Pname = pname;
    }

    public int getPno() {
        return Pno;
    }

    public void setPno(int pno) {
        Pno = pno;
    }

    public String getPkind() {
        return Pkind;
    }

    public void setPkind(String pkind) {
        Pkind = pkind;
    }

    @Override
    public String toString() {
        return "Patient_Ticket{" +
                "Tno=" + Tno +
                ", Rname='" + Rname + '\'' +
                ", Psex='" + Psex + '\'' +
                ", QueueNum=" + QueueNum +
                ", Pname='" + Pname + '\'' +
                ", Pno=" + Pno +
                ", Pkind='" + Pkind + '\'' +
                '}';
    }
}


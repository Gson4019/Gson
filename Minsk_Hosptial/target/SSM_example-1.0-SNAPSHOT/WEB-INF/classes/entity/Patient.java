package entity;

import java.util.Arrays;

public class Patient {
    private int Pno;
    private String Pname;
    private String Psex;
    private int Page;
    private String Pkind;
    private int QueueNum;
    private String RoomName;
    private String status;
    private String picture;
    private String description;
    private String diagnosis_text;
    private String medicine_text;

    public Patient() {
    }

    public Patient(String pname, String psex, int page, String pkind) {
        Pname = pname;
        Psex = psex;
        Page = page;
        Pkind = pkind;
    }

    public int getPno() {
        return Pno;
    }

    public void setPno(int pno) {
        Pno = pno;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String pname) {
        Pname = pname;
    }

    public String getPsex() {
        return Psex;
    }

    public void setPsex(String psex) {
        Psex = psex;
    }

    public int getPage() {
        return Page;
    }

    public void setPage(int page) {
        Page = page;
    }

    public String getPkind() {
        return Pkind;
    }

    public void setPkind(String pkind) {
        Pkind = pkind;
    }

    public int getQueueNum() {
        return QueueNum;
    }

    public void setQueueNum(int queueNum) {
        QueueNum = queueNum;
    }

    public String getRoomName() {
        return RoomName;
    }

    public void setRoomName(String roomName) {
        RoomName = roomName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDiagnosis_text() {
        return diagnosis_text;
    }

    public void setDiagnosis_text(String diagnosis_text) {
        this.diagnosis_text = diagnosis_text;
    }

    public String getMedicine_text() {
        return medicine_text;
    }

    public void setMedicine_text(String medicine_text) {
        this.medicine_text = medicine_text;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "Pno=" + Pno +
                ", Pname='" + Pname + '\'' +
                ", Psex='" + Psex + '\'' +
                ", Page=" + Page +
                ", Pkind='" + Pkind + '\'' +
                ", QueueNum=" + QueueNum +
                ", RoomName='" + RoomName + '\'' +
                ", status='" + status + '\'' +
                ", picture='" + picture + '\'' +
                ", description='" + description + '\'' +
                ", diagnosis_text='" + diagnosis_text + '\'' +
                ", medicine_text='" + medicine_text + '\'' +
                '}';
    }
}

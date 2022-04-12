package entity;

public class Doctor {
    private int Dno;
    private Account account;
    private String Dname;
    private String Dsex;
    private String major;
    private String telephone;
    private String message;

    public Doctor() {
    }

    public Doctor(int dno, String dname, String dsex, String major, String telephone, String message) {
        Dno = dno;
        Dname = dname;
        Dsex = dsex;
        this.major = major;
        this.telephone = telephone;
        this.message = message;
    }

    public int getDno() {
        return Dno;
    }

    public void setDno(int dno) {
        Dno = dno;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getDname() {
        return Dname;
    }

    public void setDname(String dname) {
        Dname = dname;
    }

    public String getDsex() {
        return Dsex;
    }

    public void setDsex(String dsex) {
        Dsex = dsex;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "Dno=" + Dno +
                ", account=" + account +
                ", Dname='" + Dname + '\'' +
                ", Dsex='" + Dsex + '\'' +
                ", major='" + major + '\'' +
                ", telephone='" + telephone + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

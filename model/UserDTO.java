package model;

public class UserDTO {
    private String userId;
    private String userPw;
    private String pwCheck;
    private String name;
    private String personId;
    private int phongNum;
    private String address;
    private String job;
    private double height;
    private double weight;

    public UserDTO(String userId, String userPw, String pwCheck, String name, String personId, int phongNum, String address, String job, double height, double weight) {
        this.userId = userId;
        this.userPw = userPw;
        this.pwCheck = pwCheck;
        this.name = name;
        this.personId = personId;
        this.phongNum = phongNum;
        this.address = address;
        this.job = job;
        this.height = height;
        this.weight = weight;
    }

    public String toString() {
        return "UserDTO{id='" + this.userId + "', pw='" + this.userPw + "', pwCheck='" + this.pwCheck + "', name='" + this.name + "', personId='" + this.personId + "', phongNum='" + this.phongNum + "', address='" + this.address + "', job='" + this.job + "', height=" + this.height + "', weight=" + this.weight + "'}";
    }

    public void setId(String userId) {
        this.userId = userId;
    }

    public void setPw(String userPw) {
        this.userPw = userPw;
    }

    public void setPwCheck(String pwCheck) {
        this.pwCheck = pwCheck;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public void setPhongNum(int phongNum) {
        this.phongNum = phongNum;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getId() {
        return this.userId;
    }

    public String getPw() {
        return this.userPw;
    }

    public String getPwCheck() {
        return this.pwCheck;
    }

    public String getName() {
        return this.name;
    }

    public String getPersonId() {
        return this.personId;
    }

    public int getPhongNum() {
        return this.phongNum;
    }

    public String getAddress() {
        return this.address;
    }

    public String getJob() {
        return this.job;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }
}
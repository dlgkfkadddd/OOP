package builder;

import model.UserDTO;

public class UserBuilder {
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

    public UserBuilder() {
    }

    public UserBuilder userId(String userId) {
        this.userId = userId;
        return this;
    }

    public UserBuilder userPw(String userPw) {
        this.userPw = userPw;
        return this;
    }

    public UserBuilder pwCheck(String pwCheck) {
        this.pwCheck = pwCheck;
        return this;
    }

    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder personId(String personId) {
        this.personId = personId;
        return this;
    }

    public UserBuilder phongNum(int phongNum) {
        this.phongNum = phongNum;
        return this;
    }

    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }

    public UserBuilder job(String job) {
        this.job = job;
        return this;
    }

    public UserBuilder height(double height) {
        this.height = height;
        return this;
    }

    public UserBuilder weight(double weight) {
        this.weight = weight;
        return this;
    }

    public UserDTO build() {
        return new UserDTO(this.userId, this.userPw, this.pwCheck, this.name, this.personId, this.phongNum, this.address, this.job, this.height, this.weight);
    }
}
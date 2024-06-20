package edu.gqy.mvc.povo;

public class UserWithSalary {

    private String userId;
    private String userPwd;
    private String name;
    private String sex;
    private String birth;
    private String nation;
    private String hobby;
    private String memo;
    private Double salary;

    public UserWithSalary() {
    }

    public UserWithSalary(String userId, String userPwd, String name, String sex, String birth, String nation, String hobby, String memo, Double salary) {
        this.userId = userId;
        this.userPwd = userPwd;
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.nation = nation;
        this.hobby = hobby;
        this.memo = memo;
        this.salary = salary;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "UserWithSalary{" +
                "userId='" + userId + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birth='" + birth + '\'' +
                ", nation='" + nation + '\'' +
                ", hobby='" + hobby + '\'' +
                ", memo='" + memo + '\'' +
                ", salary=" + salary +
                '}';
    }
}

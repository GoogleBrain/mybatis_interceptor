package git.yampery.cryptic.pojo;

import git.yampery.cryptic.annotation.DecryptField;
import git.yampery.cryptic.annotation.EncryptField;

public class TUser {
    private Integer id;

    private String userName;

    @EncryptField
    @DecryptField
    private String phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "TUser{" +
                "userName='" + userName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
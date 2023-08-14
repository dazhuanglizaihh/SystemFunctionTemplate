package Po;

import java.util.Date;

public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private Date createtime;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}

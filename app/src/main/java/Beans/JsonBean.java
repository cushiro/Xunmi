package Beans;

/**
 * Created by cushiro on 15/8/31.
 */
public class JsonBean {
    public boolean status;
    public User user;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Beans.User getUser() {
        return user;
    }

    public void setUser(Beans.User user) {
        this.user = user;
    }
}

package six.daodemo;

import org.springframework.stereotype.Component;

@Component
public class InputDataService {
    private final InputData id;

    public InputDataService(InputData id) {
        this.id = id;
    }
    public int getUid() {
        return id.getUid();
    }
    public String getFirstName() {
        return id.getFirst_name();
    }
    public String getLastName() {
        return id.getLast_name();
    }
    public String getBranch() {return id.getBranch();}
    public void setUid(int uid) {
        id.setUid(uid);
    }
    public void setFirstName(String firstName) {
        id.setFirst_name(firstName);
    }
    public void setLastName(String lastName) {
        id.setLast_name(lastName);
    }
    public void setBranch(String branch) {
        id.setBranch(branch);
    }
}

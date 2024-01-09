import java.io.*;

public class Resident implements Serializable {
    private String name;
    private String room;
    private String password;

    public Resident() {
        this("unassigned", "000", "XY12#$ab");
    }

    public Resident(String name, String room, String pwd)
            throws IllegalArgumentException {
        setName(name);
        setRoom(room);
        setPassword(pwd);
    }

    public String getName() {
        return name;
    }

    public String getRoom() {
        return room;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setPassword(String pwd) {
        int length = pwd.length();

        if (length < 8) {
            throw new IllegalArgumentException();
        } else {
            this.password = pwd;
        }
    }
}

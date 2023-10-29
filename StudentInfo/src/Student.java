import java.util.*;

public class Student {
    private int id;
    private String name;
    private String surname;
    private Calendar date;

    public Student(int ssn, String newName, String newSurname) {
        id = ssn;
        name = newName;
        surname = newSurname;
        date = Calendar.getInstance();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setId(int b) {
        id = b;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setSurname(String newSurname) {
        surname = newSurname;
    }

    public int getDate() {
        return date.getWeekYear();
    }

}

public class Test {
    public static void main(String[] args) {
        Student student = new Student(111223333, "Ekin", "Ozekin");

        System.out.println("Student's name: " + student.getName());
        System.out.println("Student's surname: " + student.getSurname());
        System.out.println("Student id: " + student.getId());
        System.out.println("Date: " + student.getDate());
    }
}

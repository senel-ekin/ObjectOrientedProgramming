import java.io.*;
import java.util.*;

public class Ch8EntranceMonitor {
    private Dorm manager;
    private Door door;
    private InputHandler input;
    private Scanner scanner;

    public Ch8EntranceMonitor() {
        manager = new Dorm();
        scanner = new Scanner(System.in);
        input = new InputHandler();
        door = new Door();
    }

    public static void main(String[] args) {
        Ch8EntranceMonitor sentry = new Ch8EntranceMonitor();
        sentry.start();
    }

    public void start() {
        openFile();
        String roster = manager.getResidentList();
        System.out.println(roster);
        processInputData();
    }

    public void openFile() {
        String filename;

        while (true) {
            System.out.println("File to open ('x' to cancel): ");
            filename = scanner.next();

            if (filename.equals("x")) {
                System.out.println("Program is canceled.");
                System.exit(0);
            }

            try {
                manager.openFile(filename);
                return;
            } catch (FileNotFoundException e) {
                System.out.println("No such file: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Error in reading file: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }
    }

    private void processInputData() {
        String name, room, pwd;
        while (true) {
            input.getInput();

            name = input.getName();
            room = input.getRoom();
            pwd = input.getPassword();

            validate(name, room, pwd);
        }
    }

    private void validate(String name, String room, String password) {
        Resident res = manager.getResident(name);

        if (res == null) {
            System.out.println("Invalid Entry");
        } else if (res.getName().equals(name) &&
                   res.getRoom().equals(room) &&
                   res.getPassword().equals(password)) {
            door.open();
        } else {
            System.out.println("Invalid Entry");
        }
    }
}

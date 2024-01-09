import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Ch8EntranceMonitor {
    private Dorm manager;
    private Scanner scanner;

    public Ch8EntranceMonitor() {
        manager = new Dorm();
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Ch8EntranceMonitor sentry = new Ch8EntranceMonitor();
        sentry.start();
    }

    public void start() {
        openFile();
        String roster = manager.getResidentList();
        System.out.println(roster);
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
                System.out.println("No such file");
            } catch (IOException e) {
                System.out.println("Error in reading file");
            }
        }
    }
}

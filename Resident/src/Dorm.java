import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class Dorm {
    private List<Resident> residentList;

    public Dorm() {
        this.residentList = new ArrayList<>();
    }

    public Dorm(String filename) throws IOException {
        residentList = new ArrayList<>(); // residentList'i oluştur

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            residentList = (List<Resident>) ois.readObject();
        } catch (FileNotFoundException e) {
            // Belirtilen dosya bulunamazsa FileNotFoundException fırlatılır
            throw e;
        } catch (IOException e) {
            // Dosya okunamazsa IOException fırlatılır
            throw e;
        } catch (ClassNotFoundException e) {
            // Okunan nesne tipi bulunamazsa ClassNotFoundException fırlatılır
            throw new IOException("Error reading file: Class not found");
        }
    }

    public void openFile(String filename) throws IOException {
        File file = new File(filename);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + filename);
        }

        residentList.clear();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            residentList = (List<Resident>) ois.readObject();
        } catch (ClassNotFoundException | FileNotFoundException e) {
            e.printStackTrace();
            throw new IOException("Error reading file: " + e.getMessage());
        }
    }

    public void saveFile(String filename) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(residentList);
        }
    }

    public void add(Resident resident) throws IllegalArgumentException {
        if (residentList.stream().anyMatch(r -> r.getName().equals(resident.getName()))) {
            throw new IllegalArgumentException("A resident with the same name already exists.");
        }
        residentList.add(resident);
    }

    public void delete(String name) {
        residentList.removeIf(resident -> resident.getName().equals(name));
    }

    public Resident getResident(String name) {
        return residentList.stream()
                .filter(resident -> resident.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public String getResidentList() {
        StringBuilder result = new StringBuilder();
        for (Resident resident : residentList) {
            result.append(resident.getName())
                    .append(", ")
                    .append(resident.getRoom())
                    .append(", ")
                    .append(resident.getPassword())
                    .append(System.lineSeparator());
        }
        return result.toString();
    }
}

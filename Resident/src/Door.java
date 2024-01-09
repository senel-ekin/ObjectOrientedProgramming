public class Door {
    private boolean locked;

    // Default constructor
    public Door() {
        this.locked = true;
    }

    // Method to open the door
    public void open() {
        System.out.println("The door is now open.");
        locked = false;
    }

    // Method to check if the door is locked
    public boolean isLocked() {
        return locked;
    }
}

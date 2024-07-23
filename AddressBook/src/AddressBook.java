class AddressBook {
    private static final int DEFAULT_SIZE = 25;
    private Person[] entry;

    public AddressBook() {
        this(DEFAULT_SIZE);
    }
    public AddressBook(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size must be positive.");
        }
        entry = new Person[size];
        System.out.println("array of " + size + " is created.");
    }
}

import java.util.*;

class Ch10ProcessPersonArray {
    public static void main(String[] args) {
        Person[]  person;
        person = new Person[5];

        Scanner scanner = new Scanner(System.in);

        String name, inpStr;
        int age;
        char gender;

        for (int i = 0; i < person.length; i++) {
            System.out.print("Enter name: ");
            name = scanner.next();

            System.out.print("Enter age: ");
            age  = scanner.nextInt();

            System.out.print("Enter gender: ");
            inpStr = scanner.next();
            gender = inpStr.charAt(0);

            person[i] = new Person();

            person[i].setName(name);
            person[i].setAge(age);
            person[i].setGender(gender);
        }

        // Search for a particular person
        System.out.print("Name to search: ");
        String searchName = scanner.next();
        int i = 0;
        while (i < person.length && !person[i].getName().equals(searchName)) {
            i++;
        }
        if (i == person.length) {
            System.out.println(searchName + " was not in the array");
        } else {
            System.out.println("Found " + searchName + " at position " + i);
        }

        scanner.close();
    }
}

public class Elements {
    private String elementName;
    private int numberOfAtoms;
    private String elementSymbol;
    private double elementMass;
    private int elementPeriod;
    private int elementGroup;

    public Elements (String name, int atom, String symbol, double mass, int period, int group) {
        elementName = name;
        numberOfAtoms = atom;
        elementSymbol = symbol;
        elementMass = mass;
        elementPeriod = period;
        elementGroup = group;
    }

    public void PrintElement() {
        System.out.println("Element name: " + elementName);
        System.out.println("Atom number of the element: " + numberOfAtoms);
        System.out.println("Symbol of the element: " + elementSymbol);
        System.out.println("Mass of the element: " + elementMass);
        System.out.println("Period of the element: " + elementPeriod);
        System.out.println("Element group: " + elementGroup);
    }

    public String getElementName() {
        return elementName;
    }

    public int getNumberOfAtoms() {
        return numberOfAtoms;
    }

    public String getElementSymbol() {
        return elementSymbol;
    }

    public double getElementMass() {
        return elementMass;
    }

    public int getElementPeriod() {
        return elementPeriod;
    }

    public int getElementGroup() {
        return elementGroup;
    }
}

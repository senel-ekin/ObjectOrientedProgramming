public class CircleWithStaticMembersTest {
    public static void main(String[] args) {
        CircleWithStaticMembers c1 = new CircleWithStaticMembers();
        System.out.println("Number of Circle: " + CircleWithStaticMembers.getNumberOfObjects());
        CircleWithStaticMembers c2 = new CircleWithStaticMembers(2);
        System.out.println("Number of Circle: " + CircleWithStaticMembers.getNumberOfObjects());
        CircleWithStaticMembers c3 = new CircleWithStaticMembers(6);
        System.out.println("Number of Circle: " + CircleWithStaticMembers.getNumberOfObjects());
    }
}

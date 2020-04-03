package lab7;

/**
 *
 * @author mterpstra
 */
public class Person {
    private static int nextId = 1;

    public String firstName;
    public String lastName;
    public final String ID;

    public Person() {
        this(null, null, genID());
    }

    public Person(String f, String l) {
        this(f, l, genID());
    }

    public Person(String f, String l, String i) {
        firstName = f;
        lastName = l;
        ID = i;
    }

    private static String genID() {
        return String.format("C%07d", nextId++);
    }

    public void sayHelloTo(String them) {
        System.out.println("Hello " + them + ", my name is " + firstName);
    }

    public void sayHelloTo(Person them) {
        sayHelloTo(them.firstName);
    }

    public String toString() {
        return "Person " + ID + ": " + firstName + " " + lastName;
    }
}

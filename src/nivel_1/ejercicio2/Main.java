package nivel_1.ejercicio2;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Oscar", "Méndez", 30);

        GenericMethods.printArguments(person, "Hola Oscar!", 42);

        GenericMethods.printArguments(3.14, "Java", person);

        GenericMethods.printArguments('A', 100, true);

    }
}

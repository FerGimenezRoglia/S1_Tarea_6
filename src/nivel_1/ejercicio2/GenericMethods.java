package nivel_1.ejercicio2;

public class GenericMethods {

    public static <T1, T2, T3> void printArguments(T1 argument1, T2 argument2, T3 argument3) {
        System.out.println("Arguments 1: " + argument1);
        System.out.println("Arguments 2: " + argument2);
        System.out.println("Arguments 3: " + argument3);
        System.out.println();
    }

}

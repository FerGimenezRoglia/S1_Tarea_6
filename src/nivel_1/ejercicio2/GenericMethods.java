package nivel_1.ejercicio2;

public class GenericMethods {

    public static <T1, T2, T3> void printArguments(T1 arg1, T2 arg2, T3 arg3) {
        System.out.println("Arguments 1: " + arg1);
        System.out.println("Arguments 2: " + arg2);
        System.out.println("Arguments 3: " + arg3);
        System.out.println();
    }

}

package nivel_1.ejercicio1;

public class Main {

    public static void main(String[] args) {

        NoGenericMethods objeto1 = new NoGenericMethods("Value1", "Value2", "Value3");
        System.out.println("Objeto 1:");
        System.out.println(objeto1);

        NoGenericMethods objeto2 = new NoGenericMethods("Value3", "Value1", "Value2");
        System.out.println("\nObjeto 2:");
        System.out.println(objeto2);

        NoGenericMethods objeto3 = new NoGenericMethods("Value2", "Value3", "Value1");
        System.out.println("\nObjeto 3:");
        System.out.println(objeto3);

        objeto1.setValue1("ModifiedValue1");
        objeto2.setValue2("ModifiedValue2");
        objeto3.setValue3("ModifiedValue3");

        System.out.println("\nObjeto 1 modificado:");
        System.out.println(objeto1);
    }
}


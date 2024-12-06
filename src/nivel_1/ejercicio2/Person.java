package nivel_1.ejercicio2;

public class Person {

    private String nombre;
    private String apellido;
    private int edad;

    public Person(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return  nombre + apellido + "_" + edad + " años.";
    }
}

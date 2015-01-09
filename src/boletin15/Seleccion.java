package boletin15;

public class Seleccion {

    private String nombre;
    private String apellidos;
    private int id;
    private int edad;

    public Seleccion() {

    }

    public Seleccion(String n, String a, int id, int e) {

        nombre = n;
        apellidos = a;
        this.id = id;
        edad = e;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void concentrarse() {
        System.out.println("concentrase a seleccion");
    }

    public void viajar() {
        System.out.println("viaxa a seleccion");
    }

    @Override
    public String toString() {
        return "Seleccion{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", id=" + id + ", edad=" + edad + '}';

    }

}

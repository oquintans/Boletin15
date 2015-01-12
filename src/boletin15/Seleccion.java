package boletin15;

/**
 * Superclase de las clases Entrenador,futbolista y masajista.
 * @author oquintansocampo
 * @version 1.0
 */
public class Seleccion {

    private String nombre;
    private String apellidos;
    private int id;
    private int edad;

    /**
     *
     */
    public Seleccion() {

    }

    /**
     *
     * @param n
     * @param a
     * @param id
     * @param e
     */
    public Seleccion(String n, String a, int id, int e) {

        nombre = n;
        apellidos = a;
        this.id = id;
        edad = e;
    }

    /**
     * Recibe el valor de la variable nombre.
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el valor de la variable nombre.
     * @param nombre nombre de la seleccion.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     *
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     *
     */
    public void concentrarse() {
        System.out.println("concentrase a seleccion");
    }

    /**
     *
     */
    public void viajar() {
        System.out.println("viaxa a seleccion");
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + "Seleccion{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", id=" + id + ", edad=" + edad + '}';

    }

}

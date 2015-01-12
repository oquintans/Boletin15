package boletin15;

/**
 *
 * @author oquintansocampo
 */
public class Entrenador extends Seleccion {

    private String ideFederacion;

    /**
     *
     */
    public Entrenador() {

        super();
    }

    /**
     *
     * @param n
     * @param a
     * @param id
     * @param e
     * @param ideFederacion
     */
    public Entrenador(String n, String a, int id, int e, String ideFederacion) {
        super(n, a, id, e);
        this.ideFederacion = ideFederacion;
    }

    /**
     *
     * @return
     */
    public String getIdeFederacion() {
        return ideFederacion;
    }

    /**
     *
     * @param ideFederacion
     */
    public void setIdeFederacion(String ideFederacion) {
        this.ideFederacion = ideFederacion;
    }

    /**
     *
     */
    public void dirigirPartido() {

    }

    /**
     *
     */
    public void dirigirEntrenamiento() {

    }

    /**
     *
     */
    @Override
    public void viajar() {
        System.out.println("viaxan os xogadores");
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + "Entrenador{" + "ideFederacion=" + ideFederacion + '}';
    }

}

package boletin15;

/**
 *
 * @author oquintansocampo
 */
public class Futbolista extends Seleccion {

    private int dorsal;
    private int demarcacion;

    /**
     *
     */
    public Futbolista() {
        super();
    }

    /**
     *
     * @param n
     * @param a
     * @param id
     * @param e
     * @param dor
     * @param dem
     */
    public Futbolista(String n, String a, int id, int e, int dor, int dem) {
        super(n, a, id, e);
        dorsal = dor;
        demarcacion = dem;
    }

    /**
     *
     * @return
     */
    public int getDorsal() {
        return dorsal;
    }

    /**
     *
     * @param dorsal
     */
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    /**
     *
     * @return
     */
    public int getDemarcacion() {
        return demarcacion;
    }

    /**
     *
     * @param demarcacion
     */
    public void setDemarcacion(int demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public void viajar() {
        System.out.println("viaxan os xogadores");
    }

    @Override
    public String toString() {
        return super.toString() + "Futbolista{" + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }

}

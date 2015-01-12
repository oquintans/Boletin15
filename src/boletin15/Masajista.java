package boletin15;

/**
 *
 * @author oquintansocampo
 */
public class Masajista extends Seleccion {

    private String titulacion;
    private int añosExp;

    /**
     *
     */
    public Masajista() {
        super();
    }

    /**
     *
     * @param titulacion
     * @param añosExp
     * @param n
     * @param a
     * @param id
     * @param e
     */
    public Masajista(String titulacion, int añosExp, String n, String a, int id, int e) {
        super(n, a, id, e);
        this.titulacion = titulacion;
        this.añosExp = añosExp;
    }

    /**
     *
     * @return
     */
    public String getTitulacion() {
        return titulacion;
    }

    /**
     *
     * @param titulacion
     */
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    /**
     *
     * @return
     */
    public int getAñosExp() {
        return añosExp;
    }

    /**
     *
     * @param añosExp
     */
    public void setAñosExp(int añosExp) {
        this.añosExp = añosExp;
    }

    @Override
    public void viajar() {
        System.out.println("viaxan os xogadores");
    }

    @Override
    public String toString() {
        return super.toString() + "Masajista{" + "titulacion=" + titulacion + ", a\u00f1osExp=" + añosExp + '}';
    }

}

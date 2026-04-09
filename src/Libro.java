public class Libro extends Publicacion {
    private int numeroPaginas;
    private int aniPublicacion;

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = Math.max(0, numeroPaginas);
    }

    public int getAniPublicacion() {
        return aniPublicacion;
    }

    public void setAniPublicacion(int aniPublicacion) {
        this.aniPublicacion = aniPublicacion;
    }

    public Libro() {
    }

    public Libro( String titulo, double precio, int numeroPaginas, int aniPublicacion) {
        super(titulo, precio);
        setNumeroPaginas(numeroPaginas);
        setAniPublicacion(aniPublicacion);
    }

    @Override
    public String toString() {
        return "Libro: " + super.toString() + ", Numero Paginas =" + numeroPaginas
                + ", Anio Publicacion = " + aniPublicacion + ".";
    }

}
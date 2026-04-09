public class Disco extends Publicacion{
    private int duracionMinutos;

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = Math.max(0, duracionMinutos);
    }

    public Disco() {
    }

    public Disco(String titulo, double precio, int duracionMinutos) {
        super(titulo, precio);
        setDuracionMinutos(duracionMinutos);
    }

    @Override
    public String toString() {
        return "Disco: " + super.toString() + ", Duracion en Minutos=" + duracionMinutos + ".";
    }

}
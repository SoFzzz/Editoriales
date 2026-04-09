public class Video extends Publicacion {

    private LENGUAJES idioma;
    private float duracionHoras;

    public LENGUAJES getIdioma() {
        return idioma;
    }
    public void setIdioma(LENGUAJES idioma) {
        this.idioma = idioma;
    }
    public float getDuracionHoras() {
        return duracionHoras;
    }
    public void setDuracionHoras(float duracionHoras) {
        this.duracionHoras = Math.max(0, duracionHoras);
    }
    public Video() {
    }
    public Video(String titulo, double precio, LENGUAJES idioma, float duracionHoras) {
        super(titulo, precio);
        setIdioma(idioma);
        setDuracionHoras(duracionHoras);
    }
    @Override
    public String toString() {
        return "Video: " + super.toString() + ", Idioma =" + idioma + ", Duracion en Horas =" + duracionHoras + ".";
    }

}
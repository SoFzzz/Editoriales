public abstract class Publicacion {

    private String titulo;
    private double precio;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo == null ? "" : titulo.trim();
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = Math.max(0, precio);
    }

    public Publicacion() {
    }

    public Publicacion(String titulo, double precio) {
        setTitulo(titulo);
        setPrecio(precio);
    }
    @Override
    public String toString() {
        return "Publicacion: Titulo =" + titulo + ", Precio =" + precio + ".";
    }

}
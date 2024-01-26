package lab2p2_joseseron;

/**
 *
 * @author joser
 */
public class Articulo {

    String titulo, autor, tema, fechaPublicacion;
    boolean accesoEnLinea;

    //contructores
    public Articulo(String titulo, String autor, String tema, String fechaPublicacion, boolean accesoEnLinea) {
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;
        this.fechaPublicacion = fechaPublicacion;
        this.accesoEnLinea = accesoEnLinea;

        //mutadores
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public boolean isAccesoEnLinea() {
        return accesoEnLinea;
    }

    public void setAccesoEnLinea(boolean accesoEnLinea) {
        this.accesoEnLinea = accesoEnLinea;

    }

    //ma
    @Override
    public String toString() {
        return "Articulo{" + "titulo=" + titulo + ", autor=" + autor + ", tema=" + tema + ", fechaPublicacion=" + fechaPublicacion + ", accesoEnLinea=" + accesoEnLinea + '}';
    }

}

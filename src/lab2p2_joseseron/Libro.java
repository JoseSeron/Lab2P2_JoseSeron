
package lab2p2_joseseron;

/**
 *
 * @author joser
 */
public class Libro {
    
    
    //att
    String titulo;
    String autor;
    String genero;
    String yearPublicacion;
    String disponibilidad;
    
    
    //constructores

    public Libro(String titulo, String autor, String genero, String yearPublicacion,String disponibilidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.yearPublicacion = yearPublicacion;
        this.disponibilidad = disponibilidad;
    }

    //mutadores
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getYearPublicacion() {
        return yearPublicacion;
    }

    public void setYearPublicacion(String yearPublicacion) {
        this.yearPublicacion = yearPublicacion;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }


    
    //ma\

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", yearPublicacion=" + yearPublicacion + ", disponibilidad=" + disponibilidad + '}';
    }


    
}

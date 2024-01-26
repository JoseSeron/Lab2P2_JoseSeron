
package lab2p2_joseseron;

/**
 *
 * @author joser
 */
public class CursosLinea {
   //att
    String titulo, instructor, duracionSemanas, plataforma;

    public CursosLinea(String titulo, String instructor, String duracionSemanas, String plataforma) {
        this.titulo = titulo;
        this.instructor = instructor;
        this.duracionSemanas = duracionSemanas;
        this.plataforma = plataforma;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getDuracionSemanas() {
        return duracionSemanas;
    }

    public void setDuracionSemanas(String duracionSemanas) {
        this.duracionSemanas = duracionSemanas;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "CursosLinea{" + "titulo=" + titulo + ", instructor=" + instructor + ", duracionSemanas=" + duracionSemanas + ", plataforma=" + plataforma + '}';
    }
    
    
         
}

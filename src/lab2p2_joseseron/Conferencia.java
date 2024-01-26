
package lab2p2_joseseron;

/**
 *
 * @author joser
 */
public class Conferencia {
    
    //att
    String titulo, conferencista, fecha, duracionConf, link;

    public Conferencia(String titulo, String conferencista, String fecha, String duracionConf, String link) {
        this.titulo = titulo;
        this.conferencista = conferencista;
        this.fecha = fecha;
        this.duracionConf = duracionConf;
        this.link = link;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConferencista() {
        return conferencista;
    }

    public void setConferencista(String conferencista) {
        this.conferencista = conferencista;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDuracionConf() {
        return duracionConf;
    }

    public void setDuracionConf(String duracionConf) {
        this.duracionConf = duracionConf;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Conferencia{" + "titulo=" + titulo + ", conferencista=" + conferencista + ", fecha=" + fecha + ", duracionConf=" + duracionConf + ", link=" + link + '}';
    }
    
    
}

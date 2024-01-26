
package lab2p2_joseseron;

/**
 *
 * @author joser
 */
public class Usuario {
    //att
    String nombreUsuario, contra, tipoUsuario;

    public Usuario(String nombreUsuario, String contra, String tipoUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.contra = contra;
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombreUsuario=" + nombreUsuario + ", contra=" + contra + ", tipoUsuario=" + tipoUsuario + '}';
    }
    
    
}

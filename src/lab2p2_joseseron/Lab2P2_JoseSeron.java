package lab2p2_joseseron;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author joser
 */
public class Lab2P2_JoseSeron {

    public static Scanner intInput = new Scanner(System.in);
    public static Scanner strInput = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList recursos = new ArrayList();
        ArrayList<usuarios> listaUsuarios = new ArrayList();

        int menuPrincipal = 1;

        //usuarios enduro
        //3 usuarios, un profesor un bibliotecario y un profesor
        Usuario profesor = new Usuario("OsmanMejia", "osmanm504", "profesor");
        Usuario estudiante = new Usuario("JoseSeron", "seron2004", "estudiante");
        Usuario bibliotecario = new Usuario("AllanBecker", "yeayeafusho", "bibliotecario");

        boolean sesionIniciada = false;

        System.out.println("-------Inicio de Sesion-------");
        String usuarioIngresado, contraIngresada, contraVerificacion = null;

        do {
            System.out.println("Ingrese Nombre de Usuario:\n"
                    + "Profesor: " + profesor.getNombreUsuario()
                    + "\nEstudiante: " + estudiante.getNombreUsuario()
                    + "\nBibliotecario: " + bibliotecario.getNombreUsuario());
            usuarioIngresado = strInput.nextLine();

        } while (((usuarioIngresado.equals(profesor.getNombreUsuario())) == false) && ((usuarioIngresado.equals(estudiante.getNombreUsuario())) == false) && ((usuarioIngresado.equals(bibliotecario.getNombreUsuario())) == false));
        
        if (usuarioIngresado.equals(profesor.getNombreUsuario())) {
            contraVerificacion = profesor.getContra();
        } else if (usuarioIngresado.equals(estudiante.getNombreUsuario())) {
            contraVerificacion = estudiante.getContra();
        } else if (usuarioIngresado.equals(bibliotecario.getNombreUsuario())) {
            contraVerificacion = bibliotecario.getContra();
        }

        do {
            System.out.println("Ingrese Contrasena:\n"
                    + "Profesor: " + profesor.getContra()
                    + "\nEstudiante: " + estudiante.getContra()
                    + "\nBibliotecario: " + bibliotecario.getContra());
            contraIngresada = strInput.nextLine();

        } while (contraIngresada.equals(contraVerificacion)==false);

        while (menuPrincipal != 0) {
            System.out.println("Menu Principal\n\n"
                    + "1-Listar Recursos\n"
                    + "2-Crear Recurso\n"
                    + "3-Eliminar Recurso\n"
                    + "4-Modificaer Recurso\n"
                    + "5-Salir");

            int opcionPrincipal = intInput.nextInt();

            switch (opcionPrincipal) {
                case 1: // listar

                case 2: // crear

                    break;
                case 3: //eliminar

                    break;
                case 4: //modificar

                    break;
                case 5: //salir
                    System.out.println("Saliendo del programa...");
                    menuPrincipal = 0;
                    break;
                default:

                    throw new AssertionError();
            }
        } //while menu principal

    }

}

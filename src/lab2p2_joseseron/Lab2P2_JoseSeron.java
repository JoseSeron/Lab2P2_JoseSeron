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
        Usuario profesor = new Usuario("OsmanMejia", "osmanm504" , "profesor");

        System.out.println("-------Inicio de Sesion-------");
        System.out.print("Ingrese Nombre de Usuario: ");
        
        
        while (menuPrincipal != 0) {
            System.out.println("Menu Principal\n\n"
                    + "1-Listar Recursos\n"
                    + "2-Crear Recurso\n"
                    + "3-Eliminar Recurso\n"
                    + "4-Modificaer Recurso\n"
                    + "5-Salir");

            int opcionPrincipal = intInput.nextInt();
            
            
            //3 usuarios, un profesor un bibliotecario y un profesor
            
            //Profesor
            

            switch (opcionPrincipal) {
                case 1: // listar

                    break;
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

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

        //usuarios enduro
        //3 usuarios, un profesor un bibliotecario y un profesor
        Usuario profesor = new Usuario("OsmanMejia", "osmanm504", "profesor");
        Usuario estudiante = new Usuario("JoseSeron", "seron2004", "estudiante");
        Usuario bibliotecario = new Usuario("AllanBecker", "yeayeafusho", "bibliotecario");

        boolean sesionIniciada = false;
        boolean infito = false;

        System.out.println("-------Inicio de Sesion-------");

        while (!infito) {
            String usuarioIngresado, contraIngresada, contraVerificacion = null;
            do {
                System.out.println("Ingrese Nombre de Usuario:\n"
                        + "Profesor: " + profesor.getNombreUsuario()
                        + "\nEstudiante: " + estudiante.getNombreUsuario()
                        + "\nBibliotecario: " + bibliotecario.getNombreUsuario());

                usuarioIngresado = strInput.nextLine();

                if (usuarioIngresado.equals(profesor.getNombreUsuario())) {
                    contraVerificacion = profesor.getContra();
                } else if (usuarioIngresado.equals(estudiante.getNombreUsuario())) {
                    contraVerificacion = estudiante.getContra();
                } else if (usuarioIngresado.equals(bibliotecario.getNombreUsuario())) {
                    contraVerificacion = bibliotecario.getContra();
                }

            } while (((usuarioIngresado.equals(profesor.getNombreUsuario())) == false) && ((usuarioIngresado.equals(estudiante.getNombreUsuario())) == false) && ((usuarioIngresado.equals(bibliotecario.getNombreUsuario())) == false));

            do {
                System.out.println("Ingrese Contrasena:\n"
                        + "Profesor: " + profesor.getContra()
                        + "\nEstudiante: " + estudiante.getContra()
                        + "\nBibliotecario: " + bibliotecario.getContra());
                contraIngresada = strInput.nextLine();

            } while (contraIngresada.equals(contraVerificacion) == false);

            int menuPrincipal = 1;

            while (menuPrincipal != 0) {
                System.out.println("Menu Principal\n\n"
                        + "1-Listar Recursos\n"
                        + "2-Crear Recurso\n"
                        + "3-Eliminar Recurso\n"
                        + "4-Modificaer Recurso\n"
                        + "5-Cambiar de Usuario\n"
                        + "6-Salir del programa\n");

                int opcionPrincipal = intInput.nextInt();

                switch (opcionPrincipal) {
                    case 1: // listar
                        if (recursos.isEmpty()) {
                            System.out.println("No hay recursos en el inventario");
                            break;
                        } else {
                            System.out.println("-----------Inventario-----------");
                            for (Object ite : recursos) {
                                System.out.println(recursos.indexOf(ite) + "-" + ite);
                            }

                        }
                        break;
                    case 2: // crear
                        if (usuarioIngresado.equals(estudiante.getNombreUsuario())) {
                            System.out.println("Estuadiantes no pueden crear recursos.\n");
                            break;
                        } else {
                            System.out.println("Que tipo de recurso desea ingresar?\n"
                                    + "1. Libro\n"
                                    + "2. Articulo\n"
                                    + "3. Curso en Linea\n"
                                    + "4. Conferencia\n");
                            int tipoRecurso = intInput.nextInt();

                            switch (tipoRecurso) {
                                case 1: // libro
                                    System.out.println("-----Ingresar Libro------");
                                    System.out.println("Ingrese el titulo del libro: ");
                                    String titulo = strInput.nextLine();
                                    System.out.println("Ingrese el autor del libro: ");
                                    String autor = strInput.nextLine();
                                    System.out.println("Ingrese el genero del libro: ");
                                    String genero = strInput.nextLine();
                                    System.out.println("Ingrese el año de publicacion del libro: ");
                                    String year = strInput.nextLine();
                                    System.out.println("Ingrese la disponibilidad del libro: ");
                                    String disponibilidad = strInput.nextLine();

                                    Libro nuevoLibro = new Libro(titulo, autor, genero, year, disponibilidad);
                                    recursos.add(nuevoLibro);

                                    break;
                                case 2: // articulo
                                    System.out.println("-----Ingresar Articulo------");
                                    System.out.println("Ingrese el titulo: ");
                                    String tituloArt = strInput.nextLine();
                                    System.out.println("Ingrese el autor: ");
                                    String autorArt = strInput.nextLine();
                                    System.out.println("Ingrese el tema: ");
                                    String temaArt = strInput.nextLine();
                                    System.out.println("Ingrese la fecha de publicacion (mm/yyyy): ");
                                    String fechaArt = strInput.nextLine();
                                    String dispo = "Disponible";

                                    Articulo nuevoArticulo = new Articulo(tituloArt, autorArt, temaArt, fechaArt, dispo);
                                    recursos.add(nuevoArticulo);

                                    break;
                                case 3: //cursos
                                    System.out.println("-------Ingresar Curso-------");
                                    System.out.println("Ingrese el titulo: ");
                                    String tituloCur = strInput.nextLine();
                                    System.out.println("Ingrese el instructor: ");
                                    String instructorCur = strInput.nextLine();
                                    System.out.println("Ingrese la duracion del curso (# semanas): ");
                                    String duracionCur = strInput.nextLine();
                                    System.out.println("Ingrese el tema: ");
                                    String dispoCur = "Disponible";

                                    CursosLinea nuevoCurso = new CursosLinea(tituloCur, instructorCur, duracionCur, dispoCur);
                                    recursos.add(nuevoCurso);

                                    break;
                                case 4: //conferencia
                                    System.out.println("-------Ingresar Conferencia-------");
                                    System.out.println("Ingrese el titulo: ");
                                    String tituloCon = strInput.nextLine();
                                    System.out.println("Ingrese el conferencista: ");
                                    String conferencistaCon = strInput.nextLine();
                                    System.out.println("Ingrese la fecha de la conferencia (mm/yyyy): ");
                                    String fechaCon = strInput.nextLine();
                                    System.out.println("Ingrese la duracion en horas : ");
                                    String DuracionCon = strInput.nextLine();
                                    System.out.println("Ingrese el link: ");
                                    String linkCon = strInput.nextLine();

                                    Conferencia nuevaConferencia = new Conferencia(tituloCon, conferencistaCon, fechaCon, DuracionCon, linkCon);
                                    recursos.add(nuevaConferencia);

                                    break;
                                default:
                                    throw new AssertionError();
                            }
                        }
                        break;
                    case 3: //eliminar
                        if (usuarioIngresado.equals(estudiante.getNombreUsuario())) {
                            System.out.println("Estuadiantes no pueden eliminar recursos.\n");
                            break;
                        } else if (usuarioIngresado.equals(profesor.getNombreUsuario())) {
                            System.out.println("Profesores no pueden modificar recursos.\n");
                            break;
                        } else {
                            System.out.println("-----Eliminar Recurso-----");

                            int indiceEliminar;
                            do {
                                System.out.println("Ingrese el numero del recurso que desea eliminar: ");
                                indiceEliminar = intInput.nextInt();
                                recursos.remove(indiceEliminar);
                            } while ((indiceEliminar < 0) || (indiceEliminar > recursos.size() - 1));

                        }
                        break;
                    case 4: //modificar
                        if (usuarioIngresado.equals(estudiante.getNombreUsuario())) {
                            System.out.println("Estuadiantes no pueden modificar recursos.\n");
                            break;
                        } else if (usuarioIngresado.equals(profesor.getNombreUsuario())) {
                            System.out.println("Profesores no pueden modificar recursos.\n");
                            break;
                        } else {
                            System.out.println("------Modificar Recurso-------");
                            int recursoMod;

                            do {
                                System.out.println("Que ingrese el indice del recurso que desea modificar: ");
                                recursoMod = intInput.nextInt();
                                recursos.remove(recursoMod);
                            } while ((recursoMod < 0) || (recursoMod > recursos.size() - 1));

                            System.out.println("Que tipo de recurso desea ingresar en es pocision?\n"
                                    + "1. Libro"
                                    + "2. Articulo"
                                    + "3. Curso en Linea"
                                    + "4. Conferencia");
                            int tipoRecurso = intInput.nextInt();

                            switch (tipoRecurso) {
                                case 1: // libro
                                    System.out.println("-----Ingresar Libro------");
                                    System.out.println("Ingrese el titulo del libro: ");
                                    String titulo = strInput.nextLine();
                                    System.out.println("Ingrese el autor del libro: ");
                                    String autor = strInput.nextLine();
                                    System.out.println("Ingrese el genero del libro: ");
                                    String genero = strInput.nextLine();
                                    System.out.println("Ingrese el año de publicacion del libro: ");
                                    String year = strInput.nextLine();
                                    System.out.println("Ingrese la disponibilidad del libro: ");
                                    String disponibilidad = strInput.nextLine();

                                    Libro nuevoLibro = new Libro(titulo, autor, genero, year, disponibilidad);
                                    recursos.add(recursoMod, nuevoLibro);

                                    break;
                                case 2: // articulo
                                    System.out.println("-----Ingresar Articulo------");
                                    System.out.println("Ingrese el titulo: ");
                                    String tituloArt = strInput.nextLine();
                                    System.out.println("Ingrese el autor: ");
                                    String autorArt = strInput.nextLine();
                                    System.out.println("Ingrese el tema: ");
                                    String temaArt = strInput.nextLine();
                                    System.out.println("Ingrese la fecha de publicacion (mm/yyyy): ");
                                    String fechaArt = strInput.nextLine();
                                    String dispo = "Disponible";

                                    Articulo nuevoArticulo = new Articulo(tituloArt, autorArt, temaArt, fechaArt, dispo);
                                    recursos.add(recursoMod, nuevoArticulo);

                                    break;
                                case 3: //cursos
                                    System.out.println("-------Ingresar Curso-------");
                                    System.out.println("Ingrese el titulo: ");
                                    String tituloCur = strInput.nextLine();
                                    System.out.println("Ingrese el instructor: ");
                                    String instructorCur = strInput.nextLine();
                                    System.out.println("Ingrese la duracion del curso (# semanas): ");
                                    String duracionCur = strInput.nextLine();
                                    System.out.println("Ingrese el tema: ");
                                    String dispoCur = "Disponible";

                                    CursosLinea nuevoCurso = new CursosLinea(tituloCur, instructorCur, duracionCur, dispoCur);
                                    recursos.add(recursoMod, nuevoCurso);

                                    break;
                                case 4: //conferencia
                                    System.out.println("-------Ingresar Conferencia-------");
                                    System.out.println("Ingrese el titulo: ");
                                    String tituloCon = strInput.nextLine();
                                    System.out.println("Ingrese el conferencista: ");
                                    String conferencistaCon = strInput.nextLine();
                                    System.out.println("Ingrese la fecha de la conferencia (mm/yyyy): ");
                                    String fechaCon = strInput.nextLine();
                                    System.out.println("Ingrese la duracion en horas : ");
                                    String DuracionCon = strInput.nextLine();
                                    System.out.println("Ingrese el link: ");
                                    String linkCon = strInput.nextLine();

                                    Conferencia nuevaConferencia = new Conferencia(tituloCon, conferencistaCon, fechaCon, DuracionCon, linkCon);
                                    recursos.add(recursoMod, nuevaConferencia);

                                    break;
                                default:
                                    throw new AssertionError();
                            }

                        }
                        break;
                    case 5: //salir
                        System.out.println("Cambiar de Usuario");
                        menuPrincipal = 0;
                        break;

                    case 6: //salir
                        System.out.println("Salir del Programa");
                        menuPrincipal = 0;
                        infito = true;

                        break;

                    default:

                        throw new AssertionError();
                }
            } //while menu principal

        }
    }
}

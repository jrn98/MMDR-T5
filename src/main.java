import Modelo.*;

import java.util.ArrayList;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        int op, id = 0, number = 0, year = 0;
        String province = "", name = "", email = "";
        var s = new Scanner(System.in);
        boolean logged = false, on = true;
        MarkUserRace mark = null;
        User loggedUser = null;
        ArrayList<User> users = null;
        ArrayList<Race> races = null;
        ArrayList<MarkUserRace> marks = null;
        GestionApp gestion = new GestionApp(users, races);

        do {


            if (!logged) {
                System.out.println("Bienvenido a Mis Marcas de Running. Usted no esta logeado");
                System.out.println("**************************");
                System.out.println("1.   Buscar Carreras.");
                System.out.println("2.   Ver Marcas de Carreras.");
                System.out.println("3.   Registrarse.");
                System.out.println("4.   Iniciar Cesion.");
                System.out.println("5.   Salir.");
                System.out.println("Introduzca la opcion deseada");
                op = Integer.parseInt(s.nextLine());
                switch (op) {
                    case 1:
                        while (op != 5) {
                            System.out.println("1.   Mostrar todas las carreras.");
                            System.out.println("2.   Buscar carrera por id.");
                            System.out.println("3.   Buscar carrera por provincia.");
                            System.out.println("4.   Buscar carrera por txeto en el nombre.");
                            System.out.println("5.   Vovler.");
                            op = Integer.parseInt(s.nextLine());
                            switch (op) {

                                case 1:
                                    gestion.getRaces();
                                    break;
                                case 2:
                                    gestion.findRAceId(id);
                                    break;
                                case 3:
                                    gestion.findRaceProvince(province);
                                    break;
                                case 4:
                                    gestion.findRaceText(name);
                                    break;

                                case 5:
                                    System.out.println("Volviendo");
                                    break;
                            }
                        }
                        break;
                    case 2:
                        while (op != 4) {
                            System.out.println("1.   Mostrar todas las marcas de una carrera.");
                            System.out.println("2.   Mostrar N primeras marcas en una carrera.");
                            System.out.println("3.   Mostrar las marcas de una carrera para N añño.");
                            System.out.println("4.   Vovler.");
                            op = Integer.parseInt(s.nextLine());
                            switch (op) {

                                case 1:
                                    gestion.findAllMrksRace(id);
                                    break;
                                case 2:
                                    gestion.findNumberMrksRace(id, number);
                                    break;
                                case 3:
                                    gestion.findAllMrksRaceYear(id, year);
                                    break;
                                case 4:
                                    break;

                            }
                        }
                        break;
                    case 3:
                        //TODO aqui va el Registro, antes estaba el loggin
                        break;
                    case 4:
                        //TODO aqui va el loggin,antes estaba el registro
                        logged = true;
                        break;
                    case 5:
                        System.out.println("Hasta luego.");
                        on = false;
                        break;
                    default:
                }

            }

            if (logged) {
                System.out.println("Bienvenido a Mis Marcas de Running.");
                System.out.println("Te has loggeado como ");/*TODO agregar nombre del usuario logeado*/
                System.out.println("*******************************************");
                System.out.println("*1.   Buscar Carreras.                     *");
                System.out.println("*2.   Ver Marcas de Carreras.              *");
                System.out.println("*3.   Ver mi Perfil de Usuario.            *");
                System.out.println("*4.   Cambiar mis Datos Personales.        *");
                System.out.println("*5.   Ver msi Marcas Personales.           *");
                System.out.println("*6.   Introducir una Marca en una Carrera. *");
                System.out.println("*7.   Ver marcas de Usuarios.        *");
                System.out.println("*8.   Borrar mi Perfil de Usuario.        *");
                System.out.println("*9.   Salir.                               *");
                System.out.println("Introduzca la opcion deseada");
                op = Integer.parseInt(s.nextLine());
                //TODO tenemos que ver donde guardamos al usuario que esta loggeado
                switch (op) {
                    case 1:
                        gestion.getRaces();
                        break;
                    case 2:
                        gestion.getUsuario(id).getMarcas();

                        break;
                    case 3: //TODO aqui va mi usuario, como lo guardamos? con la posicion?
                        gestion.getUsers();
                        break;
                    case 4:
                        //tenemos que crear una funcion para modificar, esta posiblemente sea desde el main

                        break;
                    case 5://la posicion debe ser la del loggeado
                        gestion.getUsuario(1).getMarcas();
                        break;
                    case 6:
                        gestion.addMark(mark, loggedUser.getEmail());
                        break;
                    case 7:
                        gestion.findMarksUser(email);
                        break;
                    case 8:
                        gestion.deleteUser(loggedUser);
                        break;
                    case 9:
                        System.out.println("Hasta luego.");
                        on = false;
                        break;
                    default:
                }

            }
        } while (on);

    }

    public void Mokito() {
    }

}
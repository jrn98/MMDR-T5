import Modelo.*;

import java.util.ArrayList;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        int op;
        var s = new Scanner(System.in);
        boolean logged = false, on = true;
        ArrayList<User> users = null;
        ArrayList<Race> races = null;
        ArrayList<MarkUserRace> marks = null;

        do {


            if (!logged) {
                System.out.printf("Bienvenido a Mis Marcas de Running. Usted no esta logeado");
                System.out.printf("**************************");
                System.out.printf("1.   Buscar Carreras.");
                System.out.printf("2.   Ver Marcas de Carreras.");
                System.out.printf("3.   Iniciar sesion.");
                System.out.printf("4.   Registrarse.");
                System.out.printf("5.   Salir.");
                System.out.println("Introduzca la opcion deseada");
                op = Integer.parseInt(s.nextLine());
                switch (op) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        System.out.printf("Hasta luego.");
                        on = false;
                        break;
                    default:
                }

            }
            if (logged) {
                System.out.printf("Bienvenido a Mis Marcas de Running.");
                System.out.println("Te has loggeado como ");/*TODO agregar nombre del usuario logeado*/
                System.out.printf("*******************************************");
                System.out.printf("*1.   Buscar Carreras.                     *");
                System.out.printf("*2.   Ver Marcas de Carreras.              *");
                System.out.printf("*3.   Ver mi Perfil de Usuario.            *");
                System.out.printf("*4.   Cambiar mis Datos Personales.        *");
                System.out.printf("*5.   Ver msi Marcas Personales.           *");
                System.out.printf("*6.   Introducir una Marca en una Carrera. *");
                System.out.printf("*7.   Ver marcas de Usuarios.        *");
                System.out.printf("*8.   Borrar mi Perfil de Usuario.        *");
                System.out.printf("*9.   Salir.                               *");
                System.out.println("Introduzca la opcion deseada");
                op = Integer.parseInt(s.nextLine());

                switch (op) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        System.out.printf("Hasta luego.");
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
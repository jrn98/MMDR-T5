import Modelo.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        int op, id = 0, number = 0, year = 0;
        String province = "", name = "", email = "";
        var s = new Scanner(System.in);
        boolean logged = false, on = true, registrado = false;
        MarkUserRace mark = null;
        User loggedUser = null;
        ArrayList<User> users = new ArrayList<User>();
        ArrayList<Race> races = new ArrayList<Race>();
        ArrayList<MarkUserRace> marks = new ArrayList<MarkUserRace>();
        GestionApp gestion = new GestionApp(users, races);
        /*
        var run1 = new Race(1, "San Anton", "Jaen", "Jaen" "https://carrerasanantonjaen.com/");
        var run2 = new Race(2, "Media Maratón Sevilla", "Sevilla"," Sevilla , "https://www.edpmediomaratondesevilla.es/");
        var run3 = new Race(3, "Media Maraton de Barcelona", "Barcelona", "Barcelona", "https://edreamsmitjabarcelona.com/");
        var run4 = new Race(4,"Maraton de zaragoza", "Zaragoza", "Zaragoza", https://www.zaragozamaraton.com/);
         */
        do {


            if (!logged) {
                System.out.println("Bienvenido a Mis Marcas de Running. Usted no esta logeado");
                System.out.println("********************************");
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
                                    pintaCarreras(gestion.getCarreeras());
                                    System.out.println("Pulse una tecla + enter para continuar");
                                    s.nextLine();
                                    break;
                                case 2:
                                    if (gestion.findRAceId(id) == null) {
                                        System.out.println("No existe ninguna carrera para este id");
                                    } else {
                                        System.out.println(gestion.findRAceId(id));
                                    }
                                    System.out.println("Pulse una tecla + enter para continuar");
                                    s.nextLine();
                                    break;
                                case 3:
                                    System.out.println("Ingrese la provincia en la que quiere buscar:");
                                    province = s.nextLine();
                                    if (gestion.findRaceProvince(province).isEmpty()) {
                                        System.out.println("No existe ninguna carrera para esta provincia");
                                    } else {
                                        pintaCarreras(gestion.findRaceProvince(province));
                                    }
                                    System.out.println("Pulse una tecla + enter para continuar");
                                    s.nextLine();
                                    break;
                                case 4:
                                    System.out.println("Ingrese el nombre de la carrera que  quiere buscar:");
                                    name = s.nextLine();
                                    if (gestion.findRaceText(name).isEmpty()) {
                                        System.out.println("No existe ninguna carrera con este nombre");
                                    } else {
                                        pintaCarreras(gestion.findRaceText(name));
                                    }

                                    System.out.println("Pulse una tecla + enter para continuar");
                                    s.nextLine();

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
                            System.out.println("3.   Mostrar las marcas de una carrera para N anno.");
                            System.out.println("4.   Vovler.");
                            op = Integer.parseInt(s.nextLine());
                            switch (op) {

                                case 1:
                                    pintaCarreras(gestion.getRaces());
                                    System.out.println("Ingrese el id de la carrera ");
                                    id = Integer.parseInt(s.nextLine());
                                    if (gestion.findAllMrksRace(id).isEmpty()) {
                                        System.out.println("No existen marcas para esta carrera aun");
                                    } else {
                                        pintaMarcas(gestion.findAllMrksRace(id));
                                    }
                                    System.out.println("Pulse una tecla + enter para continuar");
                                    s.nextLine();

                                    break;
                                case 2://TODO si el size del findNumberMarkRace es menor que el que pide el usuario decirle que no hay mas
                                    if (gestion.findNumberMrksRace(id, number).isEmpty()) {
                                        System.out.println("No existen marcas para esta carrera aun");
                                    } else {
                                        pintaMarcas(gestion.findNumberMrksRace(id, number));
                                    }

                                    System.out.println("Pulse una tecla + enter para continuar");
                                    s.nextLine();

                                    break;
                                case 3:

                                    pintaCarreras(gestion.getRaces());
                                    System.out.println("Ingrese el id de la carrera ");
                                    id = Integer.parseInt(s.nextLine());
                                    System.out.println("Ingrese el año del que desea ver las marcas");
                                    year = Integer.parseInt(s.nextLine());

                                    if (gestion.findAllMrksRaceYear(id, year).isEmpty()) {
                                        System.out.println("No existen marcas para esta carrera y año aun");
                                    } else {
                                        pintaMarcas(gestion.findAllMrksRaceYear(id, year));
                                    }
                                    System.out.println("Pulse una tecla + enter para continuar");
                                    s.nextLine();


                                    break;
                                case 4://TODO decidir que mostraremos en los volver
                                    break;

                            }
                        }
                        break;
                    case 3:
                        //TODO aqui va el Registro, antes estaba el loggin
                        if (!gestion.addUser(registre(gestion))) break;

                    case 4:
                        //TODO aqui va el loggin,antes estaba el registro
                        System.out.println("caso 4 loggin");
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

    public static void pintaCarreras(ArrayList<Race> races) {
        for (Race R :
                races) {
            System.out.println(R);

        }
    }

    public static void pintaMarcas(ArrayList<NameMark> marks) {
        for (NameMark N :
                marks) {
            System.out.println(N);

        }
    }

    public static User registre(GestionApp gestionApp) {
        User user = null;
        var s = new Scanner(System.in);
        String email, clave, nombre, apellido, fechaNacAux, numMovilaux;
        long numMoil = 0;
        boolean bien = false;
        GregorianCalendar fechaNac = new GregorianCalendar();
        SimpleDateFormat dMy = new SimpleDateFormat("dd/MM/yyyy");


        do {

            System.out.println("Ingrese su correo (ingrese -1 para salir)");
            email = s.nextLine();
            if (email.equals("-1")) return user;
        } while (!emailValid(email));

        do {


            System.out.println("Ingrese su contraseña, debe tener minimo 8 caracteres, un numero y una letra (ingrese -1 para salir)");
            clave = s.nextLine();
            if (clave.equals("-1")) return user;
            if (clave.length() < 8)
                System.out.println("La clave debe tener almenos 8 caracterees");
            if (!clave.toLowerCase().matches("(.*)[a-z](.*)"))
                System.out.println("La clave debe contener almenos una letra");
            if (!clave.matches("(.*)[0-9](.*)"))
                System.out.println("La contrseña debe contener almenos un numero");

        } while (clave.length() < 8 || !clave.toLowerCase().matches("(.*)[a-z](.*)") || !clave.matches("(.*)[0-9](.*)"));

        do {

            System.out.println("Ingrese su nombre (ingrese -1 para salir)");
            nombre = s.nextLine();
            if (nombre.equals("-1")) return user;
            if (nombre.toLowerCase().matches("(.*)[0-9](.*)")) System.out.println("No debe contener numeros");
        } while (nombre.toLowerCase().matches("(.*)[0-9](.*)"));

        do {
            System.out.println("Ingrese su apellido (ingrese -1 para salir)");
            apellido = s.nextLine();

            if (apellido.equals("-1")) return user;
            if (apellido.toLowerCase().matches("(.*)[0-9](.*)")) System.out.println("No debe contener numeros");
        } while (apellido.toLowerCase().matches("(.*)[0-9](.*)"));


        do {
            //TODO verirficar porque el constructor pide que iniicialize el numero de telefono
            System.out.println("Ingrese su numero de movil (ingrese -1 para salir)");
            numMovilaux = s.nextLine();
            if (numMovilaux.equals("-1")) return user;
            try {
                if (numMovilaux.length() == 9 && !numMovilaux.matches("(.*)[a-z](.*)")) {
                    numMoil = Long.parseLong(numMovilaux);
                    bien = true;
                } else {
                    bien = false;
                }
            } catch (Exception e) {

                System.out.println("Porfavor verifique el numero");
                bien = false;
            }


        } while (!bien);

        do {


            System.out.println("Ingrese su fecha de nacimiento con el formato dd/mm/aaaa (ingrese -1 para salir)");
            fechaNacAux = s.nextLine();
            if (fechaNacAux.equals("-1")) return user;
            try {
                fechaNac.setTime(dMy.parse(fechaNacAux));
                bien = true;
            } catch (ParseException e) {
                e.printStackTrace();
                bien = false;
            }


        } while (!bien);

        user = new User(email, clave, nombre, apellido, numMoil, fechaNac);


        return user;
    }

    public static boolean emailValid(String email) {
        return email.contains("@") && email.contains(".") && email.indexOf(".", email.indexOf("@")) > email.indexOf("@");

    }

}
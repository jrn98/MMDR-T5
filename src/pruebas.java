import Modelo.GestionApp;
import Modelo.MarkUserRace;
import Modelo.Race;
import Modelo.User;

import java.util.ArrayList;
import java.util.Scanner;

public class pruebas {
    public static void main(String[] args) {
        int op, id = 0, number = 0, year = 0;
        String province = "", name = "", email = "";
        var s = new Scanner(System.in);
        boolean logged = false, on = true, registrado = false;
        MarkUserRace mark = null;
        User loggedUser = null;
        ArrayList<User> users = null;
        ArrayList<Race> races = null;
        ArrayList<MarkUserRace> marks = null;
        GestionApp gestion = new GestionApp(users, races);
        /*
        var run1 = new Race(1, "San Anton", "Jaen", "Jaen" "https://carrerasanantonjaen.com/");
        var run2 = new Race(2, "Media Maratón Sevilla", "Sevilla"," Sevilla , "https://www.edpmediomaratondesevilla.es/");
        var run3 = new Race(3, "Media Maraton de Barcelona", "Barcelona", "Barcelona", "https://edreamsmitjabarcelona.com/");
        var run4 = new Race(4,"Maraton de zaragoza", "Zaragoza", "Zaragoza", https://www.zaragozamaraton.com/);

        email = s.nextLine();
        if (email.contains("@")) {
            System.out.println("La posicion del arroba es " + email.indexOf("@"));
            if (email.contains(".")) {
                System.out.println("La posicion del punto es " + email.indexOf(".", email.indexOf("@")));
            }
        }
 */


        String str = new String("The quick brown fox jumps over the lazy dog1.");
        System.out.println();
        System.out.print("Regex: (.*)quick brown fox(.*) " );
        System.out.println(str.matches("(.*)[a-z](.*)"));

        System.out.println(str.matches("(.*)[1-9](.*)"));

        System.out.print("Regex: (.*)quick brown wolf(.*) " );
        System.out.println(str.matches("(.*)quick brown wolf(.*)"));
        System.out.println();

    }
}

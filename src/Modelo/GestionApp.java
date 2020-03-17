package Modelo;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class GestionApp {
    ArrayList<User> users;
    ArrayList<Race> races;

    public GestionApp(ArrayList<User> users, ArrayList<Race> races) {
        this.users = users;
        this.races = races;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Race> getRaces() {
        return races;
    }

    public void setRaces(ArrayList<Race> races) {
        this.races = races;
    }

    public User getUsuario(int pos) {
        return users.get(pos);
    }

    public Race getCarrera(int pos) {
        return races.get(pos);
    }

    //regresa todas las races???
    public ArrayList<Race> getCarreeras() {
        ArrayList<Race> races = null;
        return races;
    }

    // busca el email y regresa la posicion de ese usuario
    public int findUser(String email) {
        int pos = 0;
        return pos;
    }

    //agregar usuario
    public boolean addUser(User newUser) {
        if (newUser == null) return false;
        users.add(newUser);
        return true;
    }

    //borrar usuario
    public boolean deleteUser(User user) {
        boolean deleted = true;
        return deleted;
    }

    //agregar carrera
    public boolean addRace(Race newRace) {
        boolean added = true;
        return added;
    }

    //agregar marca
    public boolean addMark(MarkUserRace marca, String email) {
        boolean added = true;
        return added;
    }

    //encontrar usuarios dado un String
    public ArrayList<User> findUserText(String text) {
        ArrayList<User> foundUsers = null;
        return foundUsers;
    }

    //encontrar carreras dado un String
    public ArrayList<Race> findRaceText(String name) {
        ArrayList<Race> foundRaces = new ArrayList<Race>();
        for (Race R : races
        ) {
            if (R.getNombre().toUpperCase().contains(name.toUpperCase())) foundRaces.add(R);

        }


        return foundRaces;
    }

    //encontrar carreras dada la provincia
    public ArrayList<Race> findRaceProvince(String province) {
        ArrayList<Race> foundRaces = new ArrayList<Race>();

        for (Race R : races
        ) {
            if (R.getProvincia().toUpperCase().contains(province.toUpperCase())) foundRaces.add(R);

        }


        return foundRaces;
    }

    // TODO encontrar carrera dado el id, me parece raro
    public Race findRAceId(int id) {
        for (Race R :
                races) {
            if (R.getId() == id) return R;

        }
        return null;
    }

    //encontrar Marcas dado el email del usuario
    public ArrayList<MarkUserRace> findMarksUser(String email) {
        ArrayList<MarkUserRace> foundMarks = null;
        return foundMarks;
    }

    //encontrar las marcas publicas de un usaurio dado el email
    public ArrayList<MarkUserRace> findPublicMarksUser(String email) {
        ArrayList<MarkUserRace> foundMarks = null;
        return foundMarks;
    }

    //encontrar las marcas de un usuario en cierto año
    public ArrayList<MarkUserRace> findMarksYearUser(int year, String email) {
        ArrayList<MarkUserRace> foundMarks = null;
        return foundMarks;
    }

    //encontrar las mejores N marcas que hay en una carrera
    public ArrayList<NameMark> findNumberMrksRace(int id, int n) {
        ArrayList<NameMark> foundMarks = new ArrayList<NameMark>();
        NameMark nameMark = null;
        int limit = 0;
        for (User U : users) {

            for (MarkUserRace M : U.getMarcas()) {

                if (M.getRace().getId() == id) {
                    nameMark = new NameMark(M.getRace().getNombre(), M.getTiempo(), M.getAnio());

                    foundMarks.add(nameMark);

                }

            }

        }
        if (foundMarks.size() != 0) {
            Collections.sort(foundMarks);


            while (foundMarks.size() > n) {
                foundMarks.remove(foundMarks.size() - 1);
            }
        }

        return foundMarks;
    }

    //encontrar todas las marcas de una carrera
    public ArrayList<NameMark> findAllMrksRace(int id) {
        ArrayList<NameMark> foundMarks = new ArrayList<NameMark>();
        NameMark nameMark = null;
        for (User U : users) {

            for (MarkUserRace M : U.getMarcas()) {

                if (M.getRace().getId() == id) {
                    nameMark = new NameMark(M.getRace().getNombre(), M.getTiempo(), M.getAnio());

                    foundMarks.add(nameMark);
                }
            }

        }

        return foundMarks;

    }

    //encontrar todas als marcas de una carrera en cierto año
    public ArrayList<NameMark> findAllMrksRaceYear(int id, int year) {
        ArrayList<NameMark> foundMarks = new ArrayList<NameMark>();
        NameMark nameMark = null;
        for (User U : users) {

            for (MarkUserRace M : U.getMarcas()) {

                if (M.getRace().getId() == id && M.getAnio() == year) {
                    nameMark = new NameMark(M.getRace().getNombre(), M.getTiempo(), M.getAnio());

                    foundMarks.add(nameMark);
                }
            }

        }

        return foundMarks;

    }


}

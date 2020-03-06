package Modelo;

import java.util.ArrayList;
import java.util.Calendar;

public class User {
    String email;
    String clave;
    String nombre;
    String apellidos;
    String numMovil;
    Calendar fechaNac;
    int contadorMarcas;
    ArrayList<MarkUserRace> marcas;

    public User(String email, String clave, String nombre, String apellidos, String numMovil, Calendar fechaNac, int contadorMarcas, ArrayList<MarkUserRace> marcas) {
        this.email = email;
        this.clave = clave;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numMovil = numMovil;
        this.fechaNac = fechaNac;
        this.contadorMarcas = contadorMarcas;
        this.marcas = marcas;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumMovil() {
        return numMovil;
    }

    public void setNumMovil(String numMovil) {
        this.numMovil = numMovil;
    }

    public Calendar getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Calendar fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getContadorMarcas() {
        return contadorMarcas;
    }

    public void setContadorMarcas(int contadorMarcas) {
        this.contadorMarcas = contadorMarcas;
    }

    public ArrayList<MarkUserRace> getMarcas() {
        return marcas;
    }

    public void setMarcas(ArrayList<MarkUserRace> marcas) {
        this.marcas = marcas;
    }

    //TODO que regrese el nombre completo separado x un espacio
    public String getNombreCompleto() {
        String nombreCompleto = "";
        return nombreCompleto;
    }

    //TODO que se ingrese una marca y regrese true si se ingreso bien
    public boolean addMarca(MarkUserRace marca) {
        boolean ingresada = true;
        return ingresada;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "email='" + email + '\'' +
                ", clave='" + clave + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numMovil='" + numMovil + '\'' +
                ", fechaNac=" + fechaNac +
                ", contadorMarcas=" + contadorMarcas +
                ", marcas=" + marcas +
                '}';
    }
}

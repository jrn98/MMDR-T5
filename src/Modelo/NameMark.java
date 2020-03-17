package Modelo;

import java.util.Calendar;

public class NameMark implements Comparable<NameMark> {
    String nombre;
    Calendar tiempo;
    int anio;

    public NameMark(String nombre, Calendar tiempo, int anio) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Calendar getTiempo() {
        return tiempo;
    }

    public void setTiempo(Calendar tiempo) {
        this.tiempo = tiempo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "---------------------------------------------" +
                "Nombre='" + nombre + '\n' +
                "Tiempo=" + tiempo + "\n" +
                "Anio=" + anio + "\n" +
                "---------------------------------------------";
    }

    //TODO ver q hace esto, compara los tiempos de varias marcas???


    @Override
    public int compareTo(NameMark nameMark) {
        return this.tiempo.compareTo(nameMark.getTiempo());
    }
}

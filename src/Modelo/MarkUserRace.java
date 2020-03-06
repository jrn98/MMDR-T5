package Modelo;

import java.util.Calendar;

public class MarkUserRace {
    int id;
    Race race;
    int anio;
    Calendar tiempo;
    int clasificacionGeneral;
    int clasificacionCategoria;
    boolean publica;

    public MarkUserRace(int id, Race race, int anio, Calendar tiempo, int clasificacionGeneral, int clasificacionCategoria, boolean publica) {
        this.id = id;
        this.race = race;
        this.anio = anio;
        this.tiempo = tiempo;
        this.clasificacionGeneral = clasificacionGeneral;
        this.clasificacionCategoria = clasificacionCategoria;
        this.publica = publica;
    }
//TODO constructorcopia

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Calendar getTiempo() {
        return tiempo;
    }

    public void setTiempo(Calendar tiempo) {
        this.tiempo = tiempo;
    }

    public int getClasificacionGeneral() {
        return clasificacionGeneral;
    }

    public void setClasificacionGeneral(int clasificacionGeneral) {
        this.clasificacionGeneral = clasificacionGeneral;
    }

    public int getClasificacionCategoria() {
        return clasificacionCategoria;
    }

    public void setClasificacionCategoria(int clasificacionCategoria) {
        this.clasificacionCategoria = clasificacionCategoria;
    }

    public boolean isPublica() {
        return publica;
    }

    public void setPublica(boolean publica) {
        this.publica = publica;
    }

    @Override
    public String toString() {
        return "MarkUserRace{" +
                "id=" + id +
                ", race=" + race +
                ", anio=" + anio +
                ", tiempo=" + tiempo +
                ", clasificacionGeneral=" + clasificacionGeneral +
                ", clasificacionCategoria=" + clasificacionCategoria +
                ", publica=" + publica +
                '}';
    }


    //TODO ver que coño hace esto y para que lo quiero, sera para comprar 2 y ordenarlas?
    public int compareTo(MarkUserRace marca) {
        int num = 0;
        return num;
    }

}

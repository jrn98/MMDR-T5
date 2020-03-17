package Modelo;

public class Race {
    int id;
    String nombre;
    String localidad;
    String provincia;
    String web;

    public Race(int id, String nombre, String localidad, String provincia, String web) {
        this.id = id;
        this.nombre = nombre;
        this.localidad = localidad;
        this.provincia = provincia;
        this.web = web;
    }
    public Race(Race race) {
        this.id = race.getId();
        this.nombre = race.getNombre();
        this.localidad = race.getLocalidad();
        this.provincia = race.getProvincia();
        this.web = race.getWeb();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    @Override
    public String toString() {
        return "-----------------------------------------------------------------------------\n" +
                "id=" + id +
                "nombre='" + nombre + '\n' +
                "localidad='" + localidad + '\n' +
                "provincia='" + provincia + '\n' +
                "web='" + web + '\n' +
                "-----------------------------------------------------------------------------"
                ;
    }
}

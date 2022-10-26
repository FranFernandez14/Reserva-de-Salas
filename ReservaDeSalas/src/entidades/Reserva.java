package entidades;

import java.time.LocalDate;
import java.time.LocalTime;


public class Reserva {

    private Persona persona;
    private Sala sala;
    private LocalDate fecha;
    private LocalTime hora;
    private int duracion;

    public Reserva(Persona persona, Sala sala, LocalDate fecha, LocalTime hora, int duracion) {
        this.persona = persona;
        this.sala = sala;
        this.fecha = fecha;
        this.hora = hora;
        this.duracion = duracion;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    

 
}

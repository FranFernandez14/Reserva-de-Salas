package entidades;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Sala {

    private int capacidad;
    private ArrayList<Reserva> reservas;

    public Sala(int capacidad) {
        this.capacidad = capacidad;
        this.reservas=new ArrayList<Reserva>();
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void reservarSala(LocalDate fecha, LocalTime hora, int duracion) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre:");
        String nombre = input.next();
        System.out.println("Ingrese el apellido:");
        String apellido = input.next();
        System.out.println("Ingrese el DNI:");
        String DNI = input.next();
        Persona p = new Persona(nombre, apellido, DNI);
        Reserva reserva = new Reserva(p, this, fecha, hora, duracion);
        this.getReservas().add(reserva);
    }

    public boolean consultarDisponibilidad(LocalDate fecha, LocalTime hora, int duracion) {
        boolean a = true;
        for (int i = 0; i < this.getReservas().size(); i++) {
            if (this.getReservas().get(i).getFecha().equals(fecha)) {
                LocalTime h = LocalTime.of(this.getReservas().get(i).getHora().getHour() + duracion, this.getReservas().get(i).getHora().getMinute());
                if (this.getReservas().get(i).getHora().isAfter(hora) && hora.isBefore(h)) {
                    a = false;
                }
            }
        }
        return a;
    }

    public void consultarReservas() {
        for (int i = 0; i < this.getReservas().size(); i++) {
            System.out.println((i + 1) + ". " + this.getReservas().get(i).getPersona().toString() + " - " + this.getReservas().get(i).getFecha().toString() + " - " + this.getReservas().get(i).getHora().toString());
        }

    }

}

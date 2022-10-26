package reservadesalas;

import entidades.Persona;
import entidades.Reserva;
import entidades.Sala;
import java.time.LocalDate;
import java.time.LocalTime;

public class ReservaDeSalas {

    public static void main(String[] args) {

        Sala sala1 = new Sala(20);
        Sala sala2 = new Sala(30);
        Sala sala3 = new Sala(15);
        Sala sala4 = new Sala(18);

        Persona persona0 = new Persona("Lionel", "Scaloni", "0");
        Persona persona1 = new Persona("Emiliano", "Martinez", "22");
        Persona persona2 = new Persona("Cristian", "Romero", "13");
        Persona persona3 = new Persona("Marcos", "Acuña", "8");
        Persona persona4 = new Persona("Gonzalo", "Montiel", "4");
        Persona persona5 = new Persona("Leandro", "Paredes", "5");
        Persona persona6 = new Persona("Nicolás", "Otamendi", "19");
        Persona persona7 = new Persona("Rodrigo", "De Paul", "7");
        Persona persona8 = new Persona("Giovani", "Lo Celso", "20");
        Persona persona9 = new Persona("Lautaro", "Martínez", "22");
        Persona persona10 = new Persona("Lionel", "Messi", "10");
        Persona persona11 = new Persona("Angel", "Di maría", "11");

        Reserva reserva0 = new Reserva(persona0, sala1, LocalDate.of(2023, 5, 16), LocalTime.of(17, 0), 3);
        sala1.getReservas().add(reserva0);
        Reserva reserva1 = new Reserva(persona1, sala2, LocalDate.of(2023, 9, 2), LocalTime.of(20, 30), 2);
        sala2.getReservas().add(reserva1);
        Reserva reserva2 = new Reserva(persona2, sala3, LocalDate.of(2023, 4, 27), LocalTime.of(21, 0), 3);
        sala3.getReservas().add(reserva2);
        Reserva reserva3 = new Reserva(persona3, sala4, LocalDate.of(2022, 10, 28), LocalTime.of(22, 0), 5);
        sala4.getReservas().add(reserva3);
        Reserva reserva4 = new Reserva(persona4, sala1, LocalDate.of(2023, 1, 1), LocalTime.of(19, 0), 7);
        sala1.getReservas().add(reserva4);
        Reserva reserva5 = new Reserva(persona5, sala2, LocalDate.of(2023, 6, 29), LocalTime.of(15, 0), 6);
        sala2.getReservas().add(reserva5);
        Reserva reserva6 = new Reserva(persona6, sala3, LocalDate.of(2023, 2, 12), LocalTime.of(17, 30), 2);
        sala3.getReservas().add(reserva6);
        Reserva reserva7 = new Reserva(persona7, sala4, LocalDate.of(2023, 5, 24), LocalTime.of(19, 0), 5);
        sala4.getReservas().add(reserva7);
        Reserva reserva8 = new Reserva(persona8, sala1, LocalDate.of(2023, 4, 9), LocalTime.of(21, 0), 4);
        sala1.getReservas().add(reserva8);
        Reserva reserva9 = new Reserva(persona9, sala2, LocalDate.of(2023, 8, 22), LocalTime.of(21, 30), 3);
        sala2.getReservas().add(reserva9);
        Reserva reserva10 = new Reserva(persona10, sala3, LocalDate.of(2023, 6, 24), LocalTime.of(18, 0), 4);
        sala3.getReservas().add(reserva10);
        Reserva reserva11 = new Reserva(persona11, sala4, LocalDate.of(2023, 2, 14), LocalTime.of(22, 0), 6);
        sala4.getReservas().add(reserva11);

        Menu menu=new Menu();
        menu.menu(sala1, sala2, sala3, sala4);

    }

}

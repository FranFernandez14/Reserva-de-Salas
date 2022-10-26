package reservadesalas;

import entidades.Persona;
import entidades.Reserva;
import entidades.Sala;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Menu {

    Scanner input = new Scanner(System.in);

    public void menu(Sala sala1, Sala sala2, Sala sala3, Sala sala4) {
        int respuesta = 5;

        while (respuesta != 3) {
            System.out.println("----------------MENU----------------");
            System.out.println("1. Realizar reserva de sala");
            System.out.println("2. Consultar reservas por sala");
            System.out.println("3. Salir");
            respuesta = input.nextInt();
            switch (respuesta) {
                case 1:
                    int cantPersonas;
                    int duracion;
                    System.out.println("Seleccione la sala deseada:");
                    System.out.println("1. Sala 1 (Capacidad: " + sala1.getCapacidad() + " personas)");
                    System.out.println("2. Sala 2 (Capacidad: " + sala2.getCapacidad() + " personas)");
                    System.out.println("3. Sala 3 (Capacidad: " + sala3.getCapacidad() + " personas)");
                    System.out.println("4. Sala 4 (Capacidad: " + sala4.getCapacidad() + " personas)");
                    int respuesta2 = input.nextInt();
                    switch (respuesta2) {
                        case 1:
                            System.out.println("Ingrese la cantidad de personas:");
                            cantPersonas = input.nextInt();
                            if (cantPersonas > sala1.getCapacidad() || cantPersonas < 1) {
                                System.out.println("La cantidad de personas es incorrecta");
                                break;
                            } else {
                                LocalDate fecha = LocalDate.of(1, 1, 1);
                                while (fecha.isBefore(LocalDate.now())) {
                                    System.out.println("Ingrese el dia:");
                                    int dia = input.nextInt();
                                    System.out.println("Ingrese el mes:");
                                    int mes = input.nextInt();
                                    System.out.println("Ingrese el año:");
                                    int anio = input.nextInt();

                                    fecha = LocalDate.of(anio, mes, dia);

                                    if (fecha.isBefore(LocalDate.now())) {
                                        System.out.println("La fecha ingresada es invalida, vuelva a intentarlo.");
                                    }
                                }

                                System.out.println("Seleccione la hora:");
                                LocalTime hora = this.hora();

                                System.out.println("Ingrese la duracion de su estadia en la sala:");
                                duracion = input.nextInt();

                                if (sala1.consultarDisponibilidad(fecha, hora, duracion) == true) {
                                    sala1.reservarSala(fecha, hora, cantPersonas);
                                } else {
                                    System.out.println("La sala no esta disponible en ese horario.");
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Ingrese la cantidad de personas:");
                            cantPersonas = input.nextInt();
                            if (cantPersonas > sala2.getCapacidad() || cantPersonas < 1) {
                                System.out.println("La cantidad de personas es incorrecta");
                                break;
                            } else {
                                LocalDate fecha = LocalDate.of(1, 1, 1);
                                while (fecha.isBefore(LocalDate.now())) {
                                    System.out.println("Ingrese el dia:");
                                    int dia = input.nextInt();
                                    System.out.println("Ingrese el mes:");
                                    int mes = input.nextInt();
                                    System.out.println("Ingrese el año:");
                                    int anio = input.nextInt();

                                    fecha = LocalDate.of(anio, mes, dia);

                                    if (fecha.isBefore(LocalDate.now())) {
                                        System.out.println("La fecha ingresada es invalida, vuelva a intentarlo.");
                                    }
                                }

                                System.out.println("Seleccione la hora:");
                                LocalTime hora = this.hora();

                                System.out.println("Ingrese la duracion de su estadia en la sala:");
                                duracion = input.nextInt();

                                if (sala2.consultarDisponibilidad(fecha, hora, duracion) == true) {
                                    sala2.reservarSala(fecha, hora, cantPersonas);
                                } else {
                                    System.out.println("La sala no esta disponible en ese horario.");
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Ingrese la cantidad de personas:");
                            cantPersonas = input.nextInt();
                            if (cantPersonas > sala3.getCapacidad() || cantPersonas < 1) {
                                System.out.println("La cantidad de personas es incorrecta");
                                break;
                            } else {
                                LocalDate fecha = LocalDate.of(1, 1, 1);
                                while (fecha.isBefore(LocalDate.now())) {
                                    System.out.println("Ingrese el dia:");
                                    int dia = input.nextInt();
                                    System.out.println("Ingrese el mes:");
                                    int mes = input.nextInt();
                                    System.out.println("Ingrese el año:");
                                    int anio = input.nextInt();

                                    fecha = LocalDate.of(anio, mes, dia);

                                    if (fecha.isBefore(LocalDate.now())) {
                                        System.out.println("La fecha ingresada es invalida, vuelva a intentarlo.");
                                    }
                                }

                                System.out.println("Seleccione la hora:");
                                LocalTime hora = this.hora();

                                System.out.println("Ingrese la duracion de su estadia en la sala:");
                                duracion = input.nextInt();

                                if (sala3.consultarDisponibilidad(fecha, hora, duracion) == true) {
                                    sala3.reservarSala(fecha, hora, cantPersonas);
                                } else {
                                    System.out.println("La sala no esta disponible en ese horario.");
                                }
                            }
                            break;
                        case 4:
                            System.out.println("Ingrese la cantidad de personas:");
                            cantPersonas = input.nextInt();
                            if (cantPersonas > sala4.getCapacidad() || cantPersonas < 1) {
                                System.out.println("La cantidad de personas es incorrecta");
                                break;
                            } else {
                                LocalDate fecha = LocalDate.of(1, 1, 1);
                                while (fecha.isBefore(LocalDate.now())) {
                                    System.out.println("Ingrese el dia:");
                                    int dia = input.nextInt();
                                    System.out.println("Ingrese el mes:");
                                    int mes = input.nextInt();
                                    System.out.println("Ingrese el año:");
                                    int anio = input.nextInt();

                                    fecha = LocalDate.of(anio, mes, dia);

                                    if (fecha.isBefore(LocalDate.now())) {
                                        System.out.println("La fecha ingresada es invalida, vuelva a intentarlo.");
                                    }
                                }
                                System.out.println("Seleccione la hora:");
                                LocalTime hora = this.hora();

                                System.out.println("Ingrese la duracion de su estadia en la sala:");
                                duracion = input.nextInt();

                                if (sala4.consultarDisponibilidad(fecha, hora, duracion) == true) {
                                    sala4.reservarSala(fecha, hora, cantPersonas);
                                } else {
                                    System.out.println("La sala no esta disponible en ese horario.");
                                }
                            }
                            break;
                        default:
                            System.out.println("Error - La opcion elegida no es valida");
                    }

                    break;
                case 2:
                    System.out.println("Seleccione la sala para consultar reservas:");
                    System.out.println("1. Sala 1");
                    System.out.println("2. Sala 2");
                    System.out.println("3. Sala 3");
                    System.out.println("4. Sala 4");
                    int respuesta3 = input.nextInt();

                    switch (respuesta3) {
                        case 1:
                            sala1.consultarReservas();
                            break;
                        case 2:
                            sala2.consultarReservas();
                            break;
                        case 3:
                            sala3.consultarReservas();
                            break;
                        case 4:
                            sala4.consultarReservas();
                            break;
                        default:
                            System.out.println("La opcion elegida es incorrecta");
                    }
                    break;
                case 3:
                    System.out.println("Muchas gracias");
                    break;

                default:
                    System.out.println("La respuesta elegida no es valida");
            }

        }

    }

    public LocalTime hora() {
        LocalTime h = null;

        System.out.println("1. 15 hs");
        System.out.println("2. 15.30 hs");
        System.out.println("3. 16 hs");
        System.out.println("4. 16.30 hs");
        System.out.println("5. 17 hs");
        System.out.println("6. 17.30 hs");
        System.out.println("7. 18 hs");
        System.out.println("8. 18.30 hs");
        System.out.println("9. 19 hs");
        System.out.println("10. 19.30 hs");
        System.out.println("11. 20 hs");
        System.out.println("12. 20.30 hs");
        System.out.println("13. 21 hs");
        System.out.println("14. 21.30 hs");
        System.out.println("15. 22 hs");
        int respuesta = input.nextInt();

        while (respuesta < 1 && respuesta > 15) {
            System.out.println("Error, vuelva a intentarlo.");
            respuesta = input.nextInt();
        }

        switch (respuesta) {
            case 1:
                h = LocalTime.of(15, 0);
                break;
            case 2:
                h = LocalTime.of(15, 30);
                break;
            case 3:
                h = LocalTime.of(16, 0);
                break;
            case 4:
                h = LocalTime.of(16, 30);
                break;
            case 5:
                h = LocalTime.of(17, 0);
                break;
            case 6:
                h = LocalTime.of(17, 30);
                break;
            case 7:
                h = LocalTime.of(18, 0);
                break;
            case 8:
                h = LocalTime.of(18, 30);
                break;
            case 9:
                h = LocalTime.of(19, 0);
                break;
            case 10:
                h = LocalTime.of(19, 30);
                break;
            case 11:
                h = LocalTime.of(20, 0);
                break;
            case 12:
                h = LocalTime.of(20, 30);
                break;
            case 13:
                h = LocalTime.of(21, 0);
                break;
            case 14:
                h = LocalTime.of(21, 30);
                break;
            case 15:
                h = LocalTime.of(22, 0);
                break;

            default:
                break;
        }

        return h;
    }
}

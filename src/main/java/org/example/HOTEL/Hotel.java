package org.example.HOTEL;

import java.util.Arrays;

public class Hotel {
    private String name;

    private Chambre[] chambres;
    private Reservation[] reservations;
    private Clients[] clients;

    public Hotel(String name, Chambre[] chambres, Reservation[] reservations, Clients[] clients) {
        this.name = name;
        this.chambres = chambres;
        this.reservations = reservations;
        this.clients = clients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Chambre[] getChambres() {
        return chambres;
    }

    public void setChambres(Chambre[] chambres) {
        this.chambres = chambres;
    }

    public Reservation[] getReservations() {
        return reservations;
    }

    public void setReservations(Reservation[] reservations) {
        this.reservations = reservations;
    }

    public Clients[] getClients() {
        return clients;
    }

    public void setClients(Clients[] clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", chambres=" + Arrays.toString(chambres) +
                ", reservations=" + Arrays.toString(reservations) +
                ", clients=" + Arrays.toString(clients) +
                '}';
    }
}

package org.example.HOTEL;

public class Reservation {

    private String numberReservation;
    private boolean statusReserve;

    {
        statusReserve = true;
    }
  private Clients client;
    private Chambre chambre;

    public Reservation(String numberReservation, boolean statusReserve, Clients client, Chambre chambre) {
        this.numberReservation = numberReservation;
        this.statusReserve = statusReserve;
        this.client = client;
        this.chambre = chambre;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "numberReservation='" + numberReservation + '\'' +
                ", statusReserve=" + statusReserve +
                ", client=" + client +
                ", chambre=" + chambre +
                '}';
    }
}

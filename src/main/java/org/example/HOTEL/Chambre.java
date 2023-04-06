package org.example.HOTEL;

public class Chambre {

    private String numberChambre;

    private boolean statusReserve;

    {
        statusReserve = true;
    }

    private String number;
    private String tarifs;
    private String capacity;

    public Chambre(String numberChambre, String number, String tarifs, String capacity) {
        this.numberChambre = numberChambre;
        this.number = number;
        this.tarifs = tarifs;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Chambre{" +
                "numberChambre='" + numberChambre + '\'' +
                ", statusReserve=" + statusReserve +
                ", number='" + number + '\'' +
                ", tarifs='" + tarifs + '\'' +
                ", capacity='" + capacity + '\'' +
                '}';
    }
}

package org.example.poo;

public class Phone extends Product{
   private int price;

    public Phone(int id, String name, int price) {
        super(id, name);
        this.price = price;
    }

    public Phone(int price) {
        this.price = price;
    }


    public void quiSuisJe(){
        super.quiSuisJe();
        System.out.println("je suis un phone");
    }
    @Override
    public String toString() {
        return "Phone{" +
                "price=" + price +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

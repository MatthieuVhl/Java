package org.example.Book;

public class Publisher {
    private static  int nb;
    private  int id;
    String publisherName;

    public Publisher(int id , String publisherName) {
        this.id = ++nb;
        this.publisherName = publisherName;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "publisherName=" + publisherName +
                '}';
    }
}

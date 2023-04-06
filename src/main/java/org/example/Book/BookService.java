package org.example.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    public List<Book> filterBooksByAuthor(Auteur auteur, Book[] books) {
        List<Book> bookT = new ArrayList<Book>();

        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books[i].getAuteur().length; j++) {
                if (auteur == books[i].getAuteur()[j]) {
                    bookT.add(books[i]);
                }
            }
        }
        return bookT;
    }

    public List<Book> filterBooksByPublisher(Publisher publisher,Book[] books){
        List<Book>bookp = new ArrayList<Book>();
        for (int i = 0; i < books.length; i++) {
           if(publisher == books[i].getPublisher()){
               bookp.add(books[i]);
           }
        }
        return bookp;
    }

    public List<Book> filterBooksAfterSpecifiedYear(int date,Book[] books){
        List<Book>bookd = new ArrayList<Book>();
        for (int i = 0; i < books.length; i++) {
            if(date > books[i].getDate()){
                bookd.add(books[i]);
            }
        }
        return bookd;
    }
}

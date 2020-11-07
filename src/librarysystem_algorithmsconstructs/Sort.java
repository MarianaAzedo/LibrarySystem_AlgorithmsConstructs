/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem_algorithmsconstructs;

import java.util.ArrayList;

/**
 *
 * @author marianaazedo
 */
public class Sort {
    
    //Method order Books by order Title alphabetical (bubble sort)
    public ArrayList<Books> sortBooksTitle(ArrayList<Books> books) {

        for (int i = 0; i < books.size(); i++) {
            for (int j = 0; j < books.size() - 1; j++) {
                if (books.get(j).getTitle().compareTo(books.get(j + 1).getTitle()) > 0) {
                    Books temp = books.get(j);
                    books.set(j, books.get(j + 1));
                    books.set(j + 1, temp);
                }
            }
        }
        return books;
    }

    //Method order Books by order Author alphabetical (bubble sort)
    public ArrayList<Books> sortBooksAuthor(ArrayList<Books> books) {

        for (int i = 0; i < books.size(); i++) {
            for (int j = 0; j < books.size() - 1; j++) {
                if (books.get(j).getAuthor().compareTo(books.get(j + 1).getAuthor()) > 0) {
                    Books temp = books.get(j);
                    books.set(j, books.get(j + 1));
                    books.set(j + 1, temp);
                }
            }
        }
        return books;
    }

    //Method order Readers by ID order alphabetical (bubble sort)
    public ArrayList<Readers> sortReadersId(ArrayList<Readers> readers) {
        for (int i = 0; i < readers.size(); i++) {
            for (int j = 0; j < readers.size() - 1; j++) {
                if (readers.get(j).getId() > readers.get(j + 1).getId()) {
                    Readers temp = readers.get(j);
                    readers.set(j, readers.get(j + 1));
                    readers.set(j + 1, temp);
                }
            }
        }
        return readers;
    }
    
    //Method order Readers by Name order alphabetical (bubble sort)
    public ArrayList<Readers> sortReadersName(ArrayList<Readers> readers) {

        for (int i = 0; i < readers.size(); i++) {
            for (int j = 0; j < readers.size() - 1; j++) {
                if (readers.get(j).getName().compareTo(readers.get(j + 1).getName()) > 0) {
                    Readers temp = readers.get(j);
                    readers.set(j, readers.get(j + 1));
                    readers.set(j + 1, temp);
                }
            }
        }
        return readers;
    }
    
}

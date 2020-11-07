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
public class Search {
    
    //Method to Search for specific book by author 
    public boolean SBookauthor(ArrayList<Books> book, String author) {
        boolean found = false;
        for (Books b : book) {
            if (b.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(b);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Author not found (404)");

        }
        return found;
    }
    
    //Method to Search for specific book by title 
    public boolean SBooktitle(ArrayList<Books> book, String title) {
        boolean found = false;
        for (Books b : book) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                System.out.println(b);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Book not found (404)");

        }
        return found;
    }

    //Method to Search for specific book by Type 
    public boolean SBooktype(ArrayList<Books> book, String type) {
        boolean found = false;
        for (Books b : book) {
            if (b.getType().equalsIgnoreCase(type)) {
                System.out.println(b);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Type not found (404)");

        }
        return found;
    }

   

    //Method to Search Reader by name 
    public boolean SReaderName(ArrayList<Readers> reader, String name) {
        boolean found = false;
        for (Readers r : reader) {
            if (r.getName().equalsIgnoreCase(name)) {
                System.out.println(r);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Reader not found (404)");
        }

        return found;
    }

    //Method to Search Reader by ID 
    public boolean SReaderID(ArrayList<Readers> reader, int id) {
        boolean found = false;
        for (Readers r : reader) {
            if (r.getId() == id) {
                System.out.println(r);
                return found = true;
            }
        }
        if (found == false) {
            System.out.println("ID not found (404)");
            return found;
        }

        return found;
    }
}

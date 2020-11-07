/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem_algorithmsconstructs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author marianaazedo
 */
public class Data {

    //Method to load Books.txt
    public ArrayList<Books> Bookstxt() throws FileNotFoundException, IOException {

        FileInputStream file = new FileInputStream("books.txt");
        String line = "";
        ArrayList<Books> books = new ArrayList<Books>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(file))) {
            line = br.readLine();
            while (line != null) {
                String[] parts = line.split(",");
                books.add(new Books(Integer.parseInt(parts[0]), parts[1], parts[2], Integer.parseInt(parts[3]), parts[4]));
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;

    }

    //Method to load Readers.txt
    public ArrayList<Readers> Readerstxt() throws FileNotFoundException {

        FileInputStream file = new FileInputStream("readers.txt");
        String line = "";
        ArrayList<Readers> readers = new ArrayList<Readers>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(file))) {
            line = br.readLine();
            while (line != null) {
                String[] parts = line.split(",");
                readers.add(new Readers(Integer.parseInt(parts[0]), parts[1], parts[2]));
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readers;
    }


    //Method to register the books borrowed
    public String RegisterBooksBorrowed(String[] borrows) throws IOException {

        try {
            BufferedWriter writeBorrow = new BufferedWriter(new FileWriter("borrows.txt", true));
            writeBorrow.write(borrows[0] + "," + borrows[1] + "," + borrows[2] + "\n");
            writeBorrow.close();
        } catch (IOException e) {
            System.out.println("Error: make sure the book name is correct");
            e.printStackTrace();
        }

        return "Borrow Registered sucessfully";
    }

    //Method to register the books returned
    public String RegisterBooksReturned(String[] returns) throws IOException {

        try {
            BufferedWriter writeReturns = new BufferedWriter(new FileWriter("returns.txt", true));
            writeReturns.write(returns[0] + "," + returns[1] + "," + returns[2] + "\n");
            writeReturns.close();
        } catch (IOException e) {
            System.out.println("An error has ocurred");
            e.printStackTrace();
        }

        return "Return Registered sucessfully";
    }

    //Method to list all the books borrowed by Reader Id
    public ArrayList<Borrows> AllBorrowsbyReaderID(int id) throws FileNotFoundException {
        FileInputStream file = new FileInputStream("borrows.txt");
        String strline = "";
        ArrayList<Borrows> borrows = new ArrayList<Borrows>();
        ArrayList<Borrows> newList = new ArrayList<Borrows>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(file))) {
            strline = br.readLine();
            while (strline != null) {
                String[] parts = strline.split(",");

                borrows.add(new Borrows(Integer.parseInt(parts[0]), parts[1], parts[2]));
                strline = br.readLine();
            }
            for (int i = 0; i < borrows.size(); i++) {
                if (id == borrows.get(i).readerId) {
                    newList.add(borrows.get(i));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newList;
    }

}

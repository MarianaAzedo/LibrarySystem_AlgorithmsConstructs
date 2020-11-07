/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem_algorithmsconstructs;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author marianaazedo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        Data data = new Data();
        Search search = new Search();
        Sort sort = new Sort();

        ArrayList<Books> myBooks = data.Bookstxt();
        ArrayList<Readers> myReaders = data.Readerstxt();
        Scanner sc = new Scanner(System.in);
        Boolean loop = true;

        /**
         * Print to test each method created
         * System.out.println(data.SBooktitle(myBooks, "The Shock of the New"
         * )); //print Books by name
         * System.out.println(data.SReaderID(myReaders,6)); //print by readers
         * id System.out.println(data.SReaderName(myReaders, "Nacho")); //print
         * by readers name System.out.println(data.SBookauthor(myBooks, "Robert
         * Hughes")); //print Books by author
         * System.out.println(data.sortBooksId(myBooks)); //print sort Books by
         * ID System.out.println(data.sortReadersId(myReaders)); //print Readers
         * sort by ID
         */
        
        //menu
        do {
            System.out.println("-----Library System-----");
            System.out.println("(Type 1): to Search Book By Author");
            System.out.println("(Type 2): to Search Book By Title");
            System.out.println("(Type 3): to Search Book By Type");
            System.out.println("(Type 4): to List Book By Author");
            System.out.println("(Type 5): to List Book By Title");
            System.out.println("(Type 6): to Search Reader By Name");
            System.out.println("(Type 7): to Search Reader By ID");
            System.out.println("(Type 8): to List Reader By I");
            System.out.println("(Type 9): to List Reader By Name");
            System.out.println("(Type 10): to Borrow a book");
            System.out.println("(Type 11): to Return the book");
            System.out.println("(Type 12): to List books borrowed by Reader ID");
            System.out.println("(Type 0): to Exit");

            try {
                int input = Integer.parseInt(sc.nextLine());
                switch (input) {
                    case 1:
                        System.out.println("Type author name:"); // Input to the user type the author.
                        String author = sc.nextLine();
                        System.out.println(search.SBookauthor(myBooks, author));
                        break;
                    case 2:
                        System.out.println("Type book title:"); // Input to the user type the book title.
                        String title = sc.nextLine();
                        System.out.println(search.SBooktitle(myBooks, title));
                        break;
                    case 3:
                        System.out.println("Type book type:"); // Input to the user type the book type.
                        String type = sc.nextLine();
                        System.out.println(search.SBooktype(myBooks, type));
                        break;
                    case 4:
                        System.out.println("List Book Authors:"); // Input to list all authors.
                        System.out.println(sort.sortBooksAuthor(myBooks));
                        break;
                    case 5:
                        System.out.println("List Books Titles:"); // Input to list all books titles.
                        System.out.println(sort.sortBooksTitle(myBooks));
                        break;
                    case 6:
                        System.out.println("Type Reader Name:"); // Input to the user type the reader name.
                        String name = sc.nextLine();
                        System.out.println(search.SReaderName(myReaders, name));
                        break;
                    case 7:
                        System.out.println("Type Reader ID:"); // Input to the user type the reader ID.
                        String id = sc.nextLine();
                        System.out.println(search.SReaderID(myReaders, Integer.parseInt(id)));
                        break;
                    case 8:
                        System.out.println("List Readers ID:"); // Input to list all readers ID.
                        System.out.println(sort.sortReadersId(myReaders));
                        break;
                    case 9:
                        System.out.println("List Readers Name:"); // Input to list all readers name.
                        System.out.println(sort.sortReadersName(myReaders));
                        break;
                    case 10: // Input to borrow a book
                        System.out.println("Type Reader ID:");
                        String Id = sc.nextLine();
                        
                        System.out.println("Type Book Name:");
                        String book = sc.nextLine();
                        
                        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); //Date format
                        LocalDateTime now = LocalDateTime.now(); //Take the date
                        String strDate = dt.format(now); //convert the date
                        
                        String[] array = {Id, book, strDate};
                        
                        System.out.println(data.RegisterBooksBorrowed(array));
                        break;   
                    case 11: // Input to return the book
                        System.out.println("Type Reader ID:");
                        String IdReader = sc.nextLine();
                        
                        System.out.println("Type Book Name:");
                        String bookName = sc.nextLine();
                        
                        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); //Date format
                        LocalDateTime Dnow = LocalDateTime.now(); //Take the date
                        String DateFormater = date.format(Dnow); //convert the date
                        
                        String[] returnArray = {IdReader, bookName, DateFormater};
                        
                        System.out.println(data.RegisterBooksReturned(returnArray));
                        break;
                    case 12: // Input to return the book borrowed by reader ID
                        System.out.println("Type Reader ID");
                        String ReaderBorrowsId = sc.nextLine();
                        System.out.println(data.AllBorrowsbyReaderID(Integer.parseInt(ReaderBorrowsId)));
                        break;
                    case 0:
                        loop = false;
                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        } while (loop);

    }

}

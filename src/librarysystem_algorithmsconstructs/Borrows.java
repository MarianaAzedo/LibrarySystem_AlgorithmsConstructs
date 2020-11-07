/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem_algorithmsconstructs;

import java.util.Date;

/**
 *
 * @author marianaazedo
 */
public class Borrows {
    
    int readerId;
    String bookName;
    String date;
    
    public Borrows(int readerId, String bookName, String date){
        this.readerId = readerId;
        this.bookName = bookName;
        this.date = date;
    }
    
    @Override
    public String toString(){
        return "Reader ID: "+readerId+"\n"+
                "Book: "+bookName+"\n"+
                "Date Borrowed: "+date+"\n";                
    }
}

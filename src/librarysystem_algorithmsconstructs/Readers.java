/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem_algorithmsconstructs;

/**
 *
 * @author marianaazedo
 */
public class Readers {
    private int id;
    private String name;
    private String address;
    
    public Readers(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    
    @Override
    public String toString (){
      return "Id: "+getId()+"\n"+
                "Name: "+getName()+"\n"+
                "Address: "+getAddress()+"\n";
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
}

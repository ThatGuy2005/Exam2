/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Csongor
 */
class UrZokni {    
    private String azonosito;    
    private int tisztasagPont;    
    public UrZokni(String azonosito, int tisztasagPont) {
        // azonosito = azonosito assigns value to itself
        // to make it clear that we want to assign to the member variable
        // we use this.azonosito. This assigns the azonosito to the member
        // variable of the instance when constructed.
        if(tisztasagPont < 0) {
            throw new IllegalArgumentException("The tisztasagPont can't be negative");
        } else if (azonosito == null || azonosito.isBlank()) {
            throw new IllegalArgumentException("The azonosito can't be null or blank");
        }
        this.azonosito = azonosito;   
       
        this.tisztasagPont = tisztasagPont;    
    }    
    public void mosas(int pluszPont) 
    {        
        if(pluszPont < 0) {
            throw new IllegalArgumentException("The pluszPont can't be negative");
        }
        tisztasagPont += pluszPont;    
    }    
    public int getTisztasagPont() 
    {        return tisztasagPont;    }    
    public String cimke() 
    {        return azonosito + ": " + tisztasagPont;    }
    public String getAzonosito() 
    {
        return this.azonosito;
    }
}

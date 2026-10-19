/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Csongor
 */
class TeleportalosUrZokni extends UrZokni {    
    private String galaxis;    
    public TeleportalosUrZokni(String azonosito,int tisztasagPont,String galaxis) 
    {       
        super(azonosito, tisztasagPont);        
        this.galaxis = galaxis;    
    }    
    @Override    public String cimke() 
    {        return "Teleport zokni: " + getAzonosito() + "\nTisztasagPont:" 
            + getTisztasagPont() +"\nGalaxis: " + this.galaxis;    
    } 
}

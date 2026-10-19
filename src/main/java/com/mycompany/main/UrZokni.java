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
    public String azonosito;    
    private int tisztasagPont;    
    public UrZokni(String azonosito, int tisztasagPont) {        
        this.azonosito = azonosito;        
        this.tisztasagPont = tisztasagPont;    
    }    
    public void mosas(int pluszPont) 
    {        tisztasagPont += pluszPont;    }    
    public int getTisztasagPont() 
    {        return tisztasagPont;    }    
    public String cimke() 
    {        return azonosito + ": " + tisztasagPont;    } 
}

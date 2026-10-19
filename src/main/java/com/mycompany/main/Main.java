
package com.mycompany.main;


public class Main {   
    public static void main(String[] args) {        
        UrZokni z = new TeleportalosUrZokni("ZOKNI-42", 4, "Andromeda");
        z.mosas(6);
        System.out.println(z.cimke());
    } 
}

package com.mycompany.main;


public class Main {   
    public static void main(String[] args) {
        UrZokni zokniOne = new UrZokni("ZOKNIUS MAXIMUS", 10);
        UrZokni zokniTwo = new TeleportalosUrZokni("ZOKNIUS MAXIMUS THE SECOND", 10, "THIS");
        System.out.println(zokniOne.cimke());
        System.out.println(zokniTwo.cimke());
        UrZokni z = new TeleportalosUrZokni("ZOKNI-42", 4, "Andromeda");
        z.mosas(6);
        System.out.println(z.cimke());
    } 
}
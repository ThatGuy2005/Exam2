
package com.mycompany.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static int elsoHianyzoZokni(int[] sorszamok) {
        // If no elemnts return 1
        if(sorszamok.length == 0)
            return 1;
        // Find the maximum and minimum positive values
        int min = sorszamok[0];
        int max = 0;
        int missingPositive = 0;
        
        for(int i : sorszamok) {
            if(min > i && i > 0) {
                min = i;
            }
            if(i > max && i > 0) {
                max = i;
            }
        }
        // If all are negative return 1
        if( max < 0) {
            return 1;
        }
        // create an array to represent all positive values between min and max
        boolean[] allNumbers = new boolean[max-min+1];
        // look for gaps
        boolean allTrue = true;
        
        // Look which values are in the interval
        int k = 0;
        for (int i = min; i <= max; i++)
        {
            for(int j = 0; j < sorszamok.length;j++) {
                if(sorszamok[j] == i)
                {
                    allNumbers[k] = sorszamok[j] == i;
                    break;
                }
            }
            k++;
        }
        // Look if all values are in the interval
        for(boolean i : allNumbers) {
            if(!i) {
                allTrue = false;
            }
        }
        // if all values in the interval are there then return the next value
        if(allTrue)
        {
            return max+1;
        }
        // If not look for the first missing positive and then return it
        for (int i = 0; i < allNumbers.length;i++) {
            if (!allNumbers[i])
            {
                missingPositive = min + i;
                break;
            }
        }
        
        return missingPositive;
    }
    public static void main(String[] args) {
        UrZokni zokniOne = new UrZokni("ZOKNIUS MAXIMUS", 10);
        // It does not matter that the type is UrZokni, overriding is decided at runtime.
        // So if a method is overriden, the implementation will change and that will
        // be used, sice we pass the child to the parent.
        UrZokni zokniTwo = new TeleportalosUrZokni("ZOKNIUS MAXIMUS THE SECOND", 10, "THIS");
        System.out.println(zokniOne.cimke());
        System.out.println(zokniTwo.cimke());
        UrZokni z = new TeleportalosUrZokni("ZOKNI-42", 4, "Andromeda");
        z.mosas(6);
        System.out.println(z.cimke());
        
        // Tests for the algorithm.
        
        int[] sorszamok = {4, 1, 2, 2, 0, -5};
        int ans = elsoHianyzoZokni(sorszamok);
        System.out.println(ans);
        System.out.println(elsoHianyzoZokni(    new int[] {1, 2, 3}));
    } 
}
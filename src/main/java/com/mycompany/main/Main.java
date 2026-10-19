
package com.mycompany.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static int elsoHianyzoZokni(int[] sorszamok) {
        if(sorszamok.length == 0)
            return 1;
        
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
        if( max < 0) {
            return 1;
        }
        boolean[] allNumbers = new boolean[max-min+1];
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
        UrZokni zokniTwo = new TeleportalosUrZokni("ZOKNIUS MAXIMUS THE SECOND", 10, "THIS");
        System.out.println(zokniOne.cimke());
        System.out.println(zokniTwo.cimke());
        UrZokni z = new TeleportalosUrZokni("ZOKNI-42", 4, "Andromeda");
        z.mosas(6);
        System.out.println(z.cimke());
        int[] sorszamok = {4, 1, 2, 2, 0, -5};
        int ans = elsoHianyzoZokni(sorszamok);
        System.out.println(ans);
    } 
}
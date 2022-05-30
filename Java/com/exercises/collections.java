package com.exercises;

import java.util.*;

public class collections {
    public static void main(String[] args) {
        ArrayList <Integer> okok =new ArrayList<>();
        ArrayList <Integer> tikke =new ArrayList<>();
    
        okok.add(1);
        okok.add(2);
        okok.add(2);
        tikke.add(3);
        tikke.add(56);
        tikke.addAll(okok);
        tikke.remove(4);
    
        tikke.add(2,59);
        System.out.println(tikke);

        
        

    }
}

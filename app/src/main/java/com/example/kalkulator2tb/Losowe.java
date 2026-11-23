package com.example.kalkulator2tb;

import java.util.ArrayList;
import java.util.Random;

public class Losowe {
    public static int losuj(int ile, int a, int b, ArrayList<Losowe> arrayList){
        Random random = new Random();

        for (int i = 0; i < ile; i++) {
            int liczba = random.nextInt(b-a+1)+a;
            arrayList.add(liczba);
        }

    }
}

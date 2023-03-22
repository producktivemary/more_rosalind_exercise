package com.company;

import java.util.ArrayList;

public class genetics_utilities {

    public void transcribingDNAintoRNA(String dna) {
        ArrayList<Character> rna = new ArrayList<>();
        String sRna = "";
        for (char a: dna.toCharArray()) {
            if (a == 'T') {
                a = 'U';
            }
            sRna += a;
        }

        System.out.println(sRna);
    }
}

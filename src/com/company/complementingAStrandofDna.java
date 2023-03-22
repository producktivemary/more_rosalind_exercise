package com.company;

import org.jetbrains.annotations.NotNull;

public class complementingAStrandofDna {

    public String reverseComplement(@NotNull String dna) {
        String reverseComplement = "";
        String reverseDna = "";
        // reverse String
        for (int i = dna.length() -1; i >= 0; i--) {
            reverseDna += dna.charAt(i);

        }
        System.out.println(reverseDna);

        // for A -> T, for C -> G
        for (int i = 0; i < reverseDna.length(); i++) {
            if (reverseDna.charAt(i) == 'A') {
                reverseComplement += 'T';
            }
            if (reverseDna.charAt(i) == 'T') {
                reverseComplement += 'A';
            }
            if (reverseDna.charAt(i) == 'G') {
                reverseComplement += 'C';
            }
            if (reverseDna.charAt(i) == 'C') {
                reverseComplement += 'G';
            }
        }

        return reverseComplement;
    }
}

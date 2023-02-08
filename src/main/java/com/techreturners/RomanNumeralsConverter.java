package com.techreturners;
import java.util.*;

public class RomanNumeralsConverter {

    static String[] capitals = {"I","V","X","L","C","D","M","",""};


    public String ConvertDigit(int digit, int pos) {
        String result = "";

        // Cannot deal with numbers <= 0 returns ""
        // Or numbers greater than 3888 or so

        String c1 = capitals[pos];
        String c2 = capitals[pos+1];
        String c3 = capitals[pos+2];


        switch (digit) {
            case 1:
                result = c1;
                break;
            case 2:
                result = c1+c1;
                break;
            case 3:
                result = c1+c1+c1;
                break;
            case 4:
                result = c1+c2;
                break;
            case 5:
                result = c2;
                break;
            case 6:
                result = c2+c1;
                break;
            case 7:
                result = c2+c1+c1;
                break;
            case 8:
                result = c2+c1+c1+c1;
                break;
            case 9:
                result = c1+c3;
                break;
        }

        return result;
    }

    public String Convert(int arabicNumber) {
        String result = "";
        for (int i =0; arabicNumber > 0 ; i++) {
            // Chop of end digit and convert to Roman Numeral, add to string.
            result = ConvertDigit((arabicNumber % 10), i*2) + result;
            arabicNumber = arabicNumber / 10;
            }
        return result;
    }

}

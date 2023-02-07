package com.techreturners;

public class RomanNumeralsConverter {
    public String Convert(int arabicNumber) {
        String result = "";

        for (int i = 0; i < arabicNumber; i++) {

            if (i == 3)
                result = "IV";
            else if (i == 4)
                result = "V";
            else if (i == 8)
                result = "IX";
            else if (i == 9)
                result = "X";
            else if ( i < 3 || i > 4 )
                result += "I";
        }
        return result;
    }
}

package com.techreturners;
import java.util.*;

public class RomanNumeralsConverter {

    public String ConvertDigit(int digit, char symbol) {
        String result = "";

        for (int i = 0; i < digit; i++) {

            if (i == 3)
                result = "IV";
            else if (i == 4)
                result = "V";
            else if (i == 8)
                result = "I" + symbol;
            else if (i == 9)
                result = String.valueOf(symbol);
            else if ( i < 3 || i > 4 )
                result += "I";
        }
        return result;
    }

    public String Convert(int arabicNumber) {
        String result = "";

        // Reverse digits
        LinkedList<Integer> stack = new LinkedList<Integer>();
        int i = 0;
        while (arabicNumber > 0) {
            if (i==0)
                stack.push( (arabicNumber % 10) );
            else
                stack.push( (arabicNumber % 10) * 10);
            i++;
            arabicNumber = arabicNumber / 10;
        }

        String capitals = "XLCM";

        // Split numbers and call function
        int count = 0;
        int num = 0;
        String current = "";
        while (!stack.isEmpty()) {
            num = stack.pop();
            result += ConvertDigit(num, capitals.charAt(count));// + result;
            //arabicNumber = arabicNumber / 10;
            count++;
        }

        return result;
    }
}

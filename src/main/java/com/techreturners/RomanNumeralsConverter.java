package com.techreturners;
import java.util.*;

public class RomanNumeralsConverter {

    static char[] capitals = {'X', 'L','C','M'};

    public String ConvertDigit(int digit) {
        String result = "";

        int left = 1;
        // If 20 treat as 10 HACK
        if (digit >= 20) {
            left = digit /10;
            digit = 10;
        }

        for (int i = 0; i < digit; i++) {

            if (i == 3)
                result = "IV";
            else if (i == 4)
                result = "V";
            else if (i == 8)
                result = "I" + capitals[0];
            else if (i == 9) {
                result = "";
                switch (left) {
                case 1: result = "X"; break;
                case 2: result = "XX"; break;
                case 3: result = "XXX"; break;
                case 4: result = "XL"; break;
                case 5: result = "L"; break;
                case 6: result = "LX"; break;
                case 7: result = "LXX"; break;
                case 8: result = "LXXX"; break;
                case 9: result = "XC"; break;
                }
            }
            else if (i == 10)
                result = "C";
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


        // Split numbers and call function
        String current = "";
        while (!stack.isEmpty()) {
            result += ConvertDigit(stack.pop());// + result;
        }

        return result;
    }
}

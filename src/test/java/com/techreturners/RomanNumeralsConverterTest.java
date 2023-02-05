package com.techreturners;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RomanNumeralsConverterTest {


    @Test
    public void ConvertOneToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "I", romanNumeralsConverter.Convert(1));
    }

    @Test
    public void ConvertTwoToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "II", romanNumeralsConverter.Convert(2));
    }
}

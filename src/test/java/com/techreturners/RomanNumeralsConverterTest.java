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
    @Test
    public void ConvertThreeToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "III", romanNumeralsConverter.Convert(3));
    }
    @Test
    public void ConvertFourToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "IV", romanNumeralsConverter.Convert(4));
    }
    @Test
    public void ConvertFiveToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "V", romanNumeralsConverter.Convert(5));
    }
    @Test
    public void ConvertSixToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "VI", romanNumeralsConverter.Convert(6));
    }
    @Test
    public void ConvertSevenToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "VII", romanNumeralsConverter.Convert(7));
    }
    @Test
    public void ConvertEightToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "VIII", romanNumeralsConverter.Convert(8));
    }

    @Test
    public void ConvertNineToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "IX", romanNumeralsConverter.Convert(9));
    }

    @Test
    public void ConvertTenToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "X", romanNumeralsConverter.Convert(10));
    }

    @Test
    public void ConvertElevenToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "XI", romanNumeralsConverter.Convert(11));
    }
    @Test
    public void ConvertTwelveToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "XII", romanNumeralsConverter.Convert(12));
    }



    @Test
    public void ConvertFourteenToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "XIV", romanNumeralsConverter.Convert(14));
    }
}

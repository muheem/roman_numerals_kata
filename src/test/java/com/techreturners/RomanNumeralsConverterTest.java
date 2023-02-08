package com.techreturners;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

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
    @Test
    public void ConvertFifteenToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "XV", romanNumeralsConverter.Convert(15));
    }
    @Test
    public void ConvertEighteenToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "XVIII", romanNumeralsConverter.Convert(18));
    }

    @Test
    public void ConvertNineteenToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "XIX", romanNumeralsConverter.Convert(19));
    }

    @Test
    public void ConvertTwentyToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "XX", romanNumeralsConverter.Convert(20));
    }

    @Test
    public void ConvertTwentyFiveToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "XXV", romanNumeralsConverter.Convert(25));
    }

    @Test
    public void ConvertThirtyToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "XXX", romanNumeralsConverter.Convert(30));
    }
    @Test
    public void ConvertFortyToNumerals() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "XL", romanNumeralsConverter.Convert(40));
    }
    @Test
    public void ConvertFiftyToNumerals() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "L", romanNumeralsConverter.Convert(50));
    }

    @Test
    public void ConvertNinetyToNumerals() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "XC", romanNumeralsConverter.Convert(90));
    }

    @Test
    public void ConvertNinetyNineToNumerals() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "XCIX", romanNumeralsConverter.Convert(99));
    }

    @Test
    public void ConvertOneHundredToNumerals() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "C", romanNumeralsConverter.Convert(100));
    }

    @Test
    public void ConvertOneHundredAndOneToNumerals() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "CI", romanNumeralsConverter.Convert(101));
    }
    @Test
    public void ConvertOneHundredAndNineToNumerals() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "CIX", romanNumeralsConverter.Convert(109));
    }

    @Test
    public void ConvertOneHundredAndTenToNumerals() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "CX", romanNumeralsConverter.Convert(110));
    }

    @Test
    public void ConvertOneHundredAndTwentyFiveToNumerals() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "CXXV", romanNumeralsConverter.Convert(125));
    }

    @Test
    public void ConvertOneHundredAndNinetyNineToNumerals() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "CXCIX", romanNumeralsConverter.Convert(199));
    }

    @Test
    public void ConvertTwoHundredToNumerals() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "CC", romanNumeralsConverter.Convert(200));
    }
    @Test
    public void ConvertTwoHundredAndOneToNumerals() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "CCI", romanNumeralsConverter.Convert(201));
    }

    @Test
    public void ConvertFiveHundredToNumerals() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "D", romanNumeralsConverter.Convert(500));
    }

    @Test
    public void ConvertFiveHundredAndThirtyTwoToNumerals() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "DXXXII", romanNumeralsConverter.Convert(532));
    }

    @Test
    public void ConvertNineHundredAndNinetyToNumerals() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "CMXC", romanNumeralsConverter.Convert(990));
    }

    @Test
    public void ConvertNineHundredAndNinetyNineToNumerals() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "CMXCIX", romanNumeralsConverter.Convert(999));
    }
    @Test
    public void ConvertOneThousandFourHundredAndNinetyToNumerals() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "MCDXC", romanNumeralsConverter.Convert(1490));
    }

    @Test
    public void Convert2222ToNumerals() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "MMCCXXII", romanNumeralsConverter.Convert(2222));
    }

    @Test
    public void Convert3333ToNumerals() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "MMMCCCXXXIII", romanNumeralsConverter.Convert(3333));
    }

    @Test
    public void Convert3888ToNumerals() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "MMMDCCCLXXXVIII", romanNumeralsConverter.Convert(3888));
    }

    @Test
    public void Convert3900ToNumerals() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "MMMCM", romanNumeralsConverter.Convert(3900));
    }

    @Test
    public void ConvertZeroToNumerals() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "", romanNumeralsConverter.Convert(0));
    }

    @Test
    public void ConvertMinusOneToNumerals() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals( "", romanNumeralsConverter.Convert(-1));
    }

 /*
 /*
    @ParameterizedTest
    @CsvFileSource(resources = "roman_numbers.csv", numLinesToSkip = 1)
    public void ConvertNumbersOneToHundredToNumerals(String str, int length) {
        assertEquals( "XX", romanNumeralsConverter.Convert(22));
    }
    */

}

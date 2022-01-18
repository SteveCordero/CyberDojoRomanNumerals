// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class RomanNumeralsTest {
/*
    @Test
    void life_the_universe_and_everything() {
        int expected = 42;
        int actual = Hiker.answer();
        assertEquals(expected, actual);
    }
*/
//Test for only the ones    
    @Test
    void num1asRN() {
        String expected = "I";
        String actual = RomanNumerals.answer(1);
        assertEquals(expected, actual);
    }
    
    @Test
    void num2asRN() {
        String expected = "II";
        String actual = RomanNumerals.answer(2);
        assertEquals(expected, actual);
    }
    
    @Test
    void num3asRN() {
        String expected = "III";
        String actual = RomanNumerals.answer(3);
        assertEquals(expected, actual);
    }
    
    @Test
    void num4asRN() {
        String expected = "IV";
        String actual = RomanNumerals.answer(4);
        assertEquals(expected, actual);
    }
    
    @Test
    void num5asRN() {
        String expected = "V";
        String actual = RomanNumerals.answer(5);
        assertEquals(expected, actual);
    }
    
    @Test
    void num7asRN() {
        String expected = "VII";
        String actual = RomanNumerals.answer(7);
        assertEquals(expected, actual);
    }
    
    @Test
    void num8asRN() {
        String expected = "VIII";
        String actual = RomanNumerals.answer(8);
        assertEquals(expected, actual);
    }
    
    @Test
    void num9asRN() {
        String expected = "IX";
        String actual = RomanNumerals.answer(9);
        assertEquals(expected, actual);
    }
//These are the test for only tens    
    @Test
    void num10asRN() {
        String expected = "X";
        String actual = RomanNumerals.answer(10);
        assertEquals(expected, actual);
    }
    
    @Test
    void num20asRN() {
        String expected = "XX";
        String actual = RomanNumerals.answer(20);
        assertEquals(expected, actual);
    } 
    
    @Test
    void num40asRN() {
        String expected = "XL";
        String actual = RomanNumerals.answer(40);
        assertEquals(expected, actual);
    }
    
    @Test
    void num50asRN() {
        String expected = "L";
        String actual = RomanNumerals.answer(50);
        assertEquals(expected, actual);
    }
    
    @Test
    void num70asRN() {
        String expected = "LXX";
        String actual = RomanNumerals.answer(70);
        assertEquals(expected, actual);
    }
    
    @Test
    void num80asRN() {
        String expected = "LXXX";
        String actual = RomanNumerals.answer(80);
        assertEquals(expected, actual);
    }
    
    @Test
    void num90asRN() {
        String expected = "XC";
        String actual = RomanNumerals.answer(90);
        assertEquals(expected, actual);
    }
 
//These are test for tens and ones digits together
    
    @Test
    void num14asRN() {
        String expected = "XIV";
        String actual = RomanNumerals.answer(14);
        assertEquals(expected, actual);
    }
    
    @Test
    void num38asRN() {
        String expected = "XXXVIII";
        String actual = RomanNumerals.answer(38);
        assertEquals(expected, actual);
    }
    
    @Test
    void num79asRN() {
        String expected = "LXXIX";
        String actual = RomanNumerals.answer(79);
        assertEquals(expected, actual);
    }
    
    @Test
    void num88asRN() {
        String expected = "LXXXVIII";
        String actual = RomanNumerals.answer(88);
        assertEquals(expected, actual);
    }
    
    @Test
    void num44asRN() {
        String expected = "XLIV";
        String actual = RomanNumerals.answer(44);
        assertEquals(expected, actual);
    }
    
    @Test
    void num99asRN() {
        String expected = "XCIX";
        String actual = RomanNumerals.answer(99);
        assertEquals(expected, actual);
    }
    
    @Test
    void num57asRN() {
        String expected = "LVII";
        String actual = RomanNumerals.answer(57);
        assertEquals(expected, actual);
    }
 
//These are testing the hundreds place only
    @Test
    void num100asRN() {
        String expected = "C";
        String actual = RomanNumerals.answer(100);
        assertEquals(expected, actual);
    }
    
    @Test
    void num200asRN() {
        String expected = "CC";
        String actual = RomanNumerals.answer(200);
        assertEquals(expected, actual);   
    }
    
    @Test
    void num400asRN() {
        String expected = "CD";
        String actual = RomanNumerals.answer(400);
        assertEquals(expected, actual);   
    }
    
    @Test
    void num500asRN() {
        String expected = "D";
        String actual = RomanNumerals.answer(500);
        assertEquals(expected, actual);   
    }
    
    @Test
    void num600asRN() {
        String expected = "DC";
        String actual = RomanNumerals.answer(600);
        assertEquals(expected, actual);   
    }
    
    @Test
    void num800asRN() {
        String expected = "DCCC";
        String actual = RomanNumerals.answer(800);
        assertEquals(expected, actual);   
    }
    
    @Test
    void num900asRN() {
        String expected = "CM";
        String actual = RomanNumerals.answer(900);
        assertEquals(expected, actual);   
    }
    
    //These are the test for hundreds and tens
    @Test
    void num640asRN() {
        String expected = "DCXL";
        String actual = RomanNumerals.answer(640);
        assertEquals(expected, actual);   
    }
    
    @Test
    void num479asRN() {
        String expected = "CDLXXIX";
        String actual = RomanNumerals.answer(479);
        assertEquals(expected, actual);   
    }
    
    @Test
    void num999asRN() {
        String expected = "CMXCIX";
        String actual = RomanNumerals.answer(999);
        assertEquals(expected, actual);   
    }
    
//These are the test cases for the thousands only up to 4 thousand
    @Test
    void num1000asRN() {
        String expected = "M";
        String actual = RomanNumerals.answer(1000);
        assertEquals(expected, actual);   
    }
    
    @Test
    void num2000asRN() {
        String expected = "MM";
        String actual = RomanNumerals.answer(2000);
        assertEquals(expected, actual);   
    }
    
    @Test
    void num3000asRN() {
        String expected = "MMM";
        String actual = RomanNumerals.answer(3000);
        assertEquals(expected, actual);  
    }
    
    @Test
    void num4000asRN() {
        String expected = "MMMM";
        String actual = RomanNumerals.answer(4000);
        assertEquals(expected, actual);   
    }
    
    @Test
    void num5000asRN() {
        String expected = "Cant Be A Roman Numeral";
        String actual = RomanNumerals.answer(5000);
        assertEquals(expected, actual);   
    }
    
//these are the test cases for all ones, tens, hundreds, and thousands place together
    @Test
    void num5542asRN() {
        String expected = "Cant Be A Roman Numeral";
        String actual = RomanNumerals.answer(5542);
        assertEquals(expected, actual);   
    }
    
    @Test
    void num4999asRN() {
        String expected = "MMMMCMXCIX";
        String actual = RomanNumerals.answer(4999);
        assertEquals(expected, actual);   
    }
    
    @Test
    void num3457asRN() {
        String expected = "MMMCDLVII";
        String actual = RomanNumerals.answer(3457);
        assertEquals(expected, actual);   
    }
    
//These are test cases for more numbers that cant be converted into roman numerals
    
    @Test
    void num0asRN() {
        String expected = "Cant Be A Roman Numeral";
        String actual = RomanNumerals.answer(0);
        assertEquals(expected, actual);   
    }
    
    @Test
    void numN300asRN() {
        String expected = "Cant Be A Roman Numeral";
        String actual = RomanNumerals.answer(-300);
        assertEquals(expected, actual);   
    }   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package main;

import entity.Binary;
import entity.Decimal;
import entity.Hexadecimal;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class MainTest {
    public MainTest() {
    }

    @Test
    public void testToDecimalString() {
        String binary1 = "1010";
        String expectedDecimal1 = "10";
        assertEquals(expectedDecimal1, Binary.toDecimalString(binary1));
    }
   
    @Test
    public void testToHexadecimalString() {
        String binary1 = "1010";
        String expectedHexadecimal1 = "A";
        assertEquals(expectedHexadecimal1, Binary.toHexadecimalString(binary1));
    }
    
    @Test
    public void testToBinaryStringWithValidInput() {
        String decimal1 = "10";
        String expectedBinary1 = "1010";
        assertEquals(expectedBinary1, Decimal.toBinaryString(decimal1));
    }
    
    @Test
    public void testToBinaryStringWithInvalidInput() {
        // Test case: decimal = "abc" (không phải là một số nguyên hợp lệ)
        String decimal = "abc";
        Decimal.toBinaryString(decimal);
    }
    
     @Test
    public void testToHexadecimalStringWithValidInput() {
        String decimal1 = "10";
        String expectedHexadecimal1 = "A";
        assertEquals(expectedHexadecimal1, Decimal.toHexadecimalString(decimal1));
    }
    
    @Test
    public void testToHexadecimalStringWithInvalidInput() {
        String decimal = "abc";
        Decimal.toHexadecimalString(decimal);
    }
    @Test
    public void testToDecimalStringWithValidInput() {
        String hexadecimal2 = "1F";
        String expectedDecimal2 = "31";
        assertEquals(expectedDecimal2, Hexadecimal.toDecimalString(hexadecimal2));
    }
    
    @Test
    public void testToDecimalStringWithInvalidInput() {
        String hexadecimal2 = "G";
        Hexadecimal.toDecimalString(hexadecimal2);
    }
}

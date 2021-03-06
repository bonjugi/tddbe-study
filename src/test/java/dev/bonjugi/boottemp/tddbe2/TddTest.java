package dev.bonjugi.boottemp.tddbe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class TddTest {

    @Test
    public void  testMultiplication(){
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.time(2));
        assertEquals(Money.dollar(15), five.time(3));
    }

    @Test
    public void  testFrancMultiplication(){
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.time(2));
        assertEquals(Money.franc(15), five.time(3));
    }

    @Test
    public void testEquality(){
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        
        assertFalse(Money.franc(5).equals(Money.franc(6)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(6)));
    }

}

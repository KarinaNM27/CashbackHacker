package ru.netology.service;


import org.junit.Test;
//import org.testng.annotations.Test;
//import org.testng.Assert;

import static org.junit.Assert.assertEquals;
//import static org.testng.Assert.assertEquals;


public class CashbackHackerTest {
    @Test
    public void calculateCashback() {
        CashbackHackService service = new CashbackHackService();
        int expected = 400;
        int amount = 600;
        int result = service.remain(amount);
        assertEquals(expected, result);

    }


    @Test
    public void calculateCashbackIf1000() {
        CashbackHackService service = new CashbackHackService();
        int expected1 = 0;
        int amount = 1000;
        int result1 = service.remain(amount);
        assertEquals(expected1, result1);

    }
}

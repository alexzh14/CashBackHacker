package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainWhenAmountLessThanBoundary() { // сумма покупки меньше границы кешбека
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainWhenAmountEqualsBoundary() { // сумма покупки равна границе кешбека
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainWhenAmountGreaterThanBoundary() { // сумма покупки больше границы кешбека
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainWhenAmountIsZero() { // сумма покупки равна нулю
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}
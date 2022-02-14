package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldCalculate() {
        SQRService service = new SQRService();
        int border1 = 200;
        int border2 = 300;
        int expected = 3;


        int actual = service.calculate(border1, border2);

        assertEquals(actual, expected);

    }

    @Test
    void shouldCalculate1() {
        SQRService service = new SQRService();
        int border1 = 100;
        int border2 = 400;
        int expected = 11;


        int actual = service.calculate(border1, border2);

        assertEquals(actual, expected);

    }

    @Test
    void shouldCalculate2() {
        SQRService service = new SQRService();
        int border1 = 3500;
        int border2 = 4100;
        int expected = 5;


        int actual = service.calculate(border1, border2);

        assertEquals(actual, expected);

    }

    @Test
    void shouldCalculate3() {
        SQRService service = new SQRService();
        int border1 = 8500;
        int border2 = 12000;
        int expected = 7;


        int actual = service.calculate(border1, border2);

        assertEquals(actual, expected);

    }
}
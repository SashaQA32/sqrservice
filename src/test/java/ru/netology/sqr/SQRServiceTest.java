package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldCalculate() {
        SQRService service = new SQRService();
        int expected = 3;
        int number = 3;

        int actual = service.calculate(number);

        assertEquals(actual, expected);

    }
}
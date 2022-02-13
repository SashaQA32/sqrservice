package ru.netology.sqr;

public class SQRService {
    public int calculate(int number) {
        int border1 = 200;
        int border2 = 300;
        int count = 0;
        for (int num = 10; num <= 99; num++) {
            if (num * num >= border1 && num * num <= border2) {
                count++;
            }
        }
        return count;
    }
}

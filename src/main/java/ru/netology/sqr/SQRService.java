package ru.netology.sqr;

public class SQRService {
    public int calculate(int border1, int border2) {

        int count = 0;
        for (int num = 10; num <= 99; num++) {
            if (num * num >= border1 && num * num <= border2) {
                count++;
            }
        }
        return count;
    }
}

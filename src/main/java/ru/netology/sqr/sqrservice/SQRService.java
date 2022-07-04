package ru.netology.sqr.sqrservice;

import static java.lang.Math.sqrt;

public class SQRService {
    public int squarecounter(int lower_bound, int upper_bound) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lower_bound && i * i <= upper_bound) {
                count++;

            }

        }
        return count;
    }
}
package Lesson1.Checking_odd;

import Lesson1.width_height.width_eight;

public class Checking_odd {

    public static void main(String[] args) {
        Checking_odd odd = new Checking_odd();
        System.out.println(odd.isOdd(14));
        System.out.println(odd.isOdd(19));
    }

    boolean isOdd(int n) {
        return n % 2 == 1;
    }
}
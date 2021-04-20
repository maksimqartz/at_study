package Lesson1.Square;

public class Square {

    public static void main(String[] args) {
        Square square = new Square();

        System.out.println(square.getSquare(0));
        System.out.println(square.getSquare(2));
        System.out.println(square.getSquare(100));
    }


    float getSquare(int radius) {
        final float pi = 3.14f;
        return pi * radius * radius;
    }
}
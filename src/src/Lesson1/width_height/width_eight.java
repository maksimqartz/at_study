package Lesson1.width_height;

public class width_eight {

    public static void main(String args[]) {

        width_eight kvadrat = new width_eight();

        System.out.println(kvadrat.comparisonSqPer(2, 7));
        System.out.println(kvadrat.comparisonSqPer(6, 5));
        System.out.println(kvadrat.comparisonSqPer(6, 3));
    }

    boolean comparisonSqPer(int width, int height) {
        int square = width * height;
        int perimeter = 2 * (width + height);
        return square > perimeter;
    }
}
package notes.l5;


import java.util.Arrays;

public class ArrayTask {

    public static void main(String[] args) {
        int[] source = {2, 7, 4, 1, 6, 5, 8, 0};

        int lengthOfArray = getEvenElements(source);
        int[] destination = new int[lengthOfArray];

        int index = 0;
        for (int current : source) {
            if (current % 2 == 0) {
                destination[index] = current;
                index++;
            }
        }
        System.out.println(Arrays.toString(destination));
    }

    private static int getEvenElements(int[] array) {
        int counter = 0;
        for (int current : array) {
            if (current % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

}

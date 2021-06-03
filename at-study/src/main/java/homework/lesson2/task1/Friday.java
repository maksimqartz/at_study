package homework.lesson2.task1;

public class Friday {

    public static void main(String[] args) {
        String[] strings = {"Пятница", "это", "лучший", "день", "недели"};

        new Friday().printFor(strings);
        new Friday().printForEach(strings);
        new Friday().printWhile(strings);
    }

    void printFor(String[] array) {
        String result = "";
        for (int index = 0; index < array.length; index++)
            result += array[index] + " ";
        result = result.trim() + ".";
        System.out.println(result);
    }

    void printForEach(String[] array) {
        String result = "";
        for (String element : array)
            result += element + " ";
        result = result.trim() + ".";
        System.out.println(result);
    }

    void printWhile(String[] array) {
        int index = 0;
        String result = "";
        while (index < array.length)
            result += array[index++] + " ";
        result = result.trim() + ".";
        System.out.println(result);
    }
}
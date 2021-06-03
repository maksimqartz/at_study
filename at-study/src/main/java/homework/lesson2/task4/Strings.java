package homework.lesson2.task4;

import java.util.Arrays;

public class Strings {

    public static void main(String[] args) {
        String first = "hello";
        String second = "world";

        /**
         * Сортировка строки по алфавиту
         */
        char[] firstAsChars = first.toCharArray();
        Arrays.sort(firstAsChars);

        /**
         * Переход к следующему символу, после повтора
         */
        String result = "";
        for (char ch : firstAsChars) {
            String symbol = String.valueOf(ch);
            if (result.contains(symbol))
                continue;
            if (second.contains(symbol)) result += symbol;
        }
        System.out.println(result);
    }
}

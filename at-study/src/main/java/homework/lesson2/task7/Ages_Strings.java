package homework.lesson2.task7;

public class Ages_Strings {
    public static void main(String[] args) {
        Ages_Strings instance = new Ages_Strings();
        System.out.println(instance.getAgeDescription(32) + "\n");
        System.out.println(instance.getAgeDescription(52) + "\n");
        System.out.println(instance.getAgeDescription(66) + "\n");
        System.out.println(instance.getAgeDescription(82) + "\n");
        System.out.println(instance.getAgeDescription(25) + "\n");
        System.out.println(instance.getAgeDescription(44) + "\n");
        System.out.println(instance.getAgeDescription(60) + "\n");
        System.out.println(instance.getAgeDescription(75) + "\n");
        System.out.println(instance.getAgeDescription(22) + "\n");
        System.out.println(instance.getAgeDescription(119) + "\n");
        System.out.println(instance.getAgeDescription(0) + "\n");
    }

    String getAgeDescription(int age) {
        String prefix = "";
        if (age >= 25 && age < 44)
            prefix = "молодой";
        else if (age >= 44 && age < 60)
            prefix = "средний";
        else if (age >= 60 && age < 75)
            prefix = "пожилой";
        else if (age >= 75 && age < 90)
            prefix = "старческий";
        else prefix = "неизвестный";
        return prefix + " возраст";
    }
}
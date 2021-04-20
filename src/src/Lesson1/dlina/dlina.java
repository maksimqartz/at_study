package Lesson1.dlina;

public class dlina {

    public static void main(String[] args) {

        System.out.println(dlina.getDlina(115));
        System.out.println(dlina.getDlina(800));
        System.out.println(dlina.getDlina(278));
    }

    static int getDlina(int cm){
        return cm / 100;
    }
}

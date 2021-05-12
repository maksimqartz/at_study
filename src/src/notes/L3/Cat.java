package notes.L3;

import javafx.animation.ScaleTransition;

import java.util.Random;

public class Cat {
    int age;
    int weight;
    String name;

    final static String description = "Cat";
    static int count = 0;

    static void printCatCount() {
        System.out.println("Current cats: " + count);
    }

    Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        count++;
    }

    void voice() {
        System.out.println("Meow " + age);
    }

    static Cat generateNewCat() {
        Random random = new Random();
        int age = random.nextInt(18);
        int weight = random.nextInt(29);
        return new Cat("RandomCat", age, weight);
    }


    static Cat[] generateCats(int amount) {
        Cat[] cats = new Cat[amount];
        for (int i = 0; i < amount; i++) {
            cats[i] = generateNewCat();
         }
        return cats;
    }
}

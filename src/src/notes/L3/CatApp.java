package notes.L3;

public class CatApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Snowflake", 4, 5);
        Cat cat2 = new Cat("Corn", 6, 7);

        cat1.voice();
        cat2.voice();

        Cat.printCatCount();

        Cat generatedCat = Cat.generateNewCat();
        System.out.println(generatedCat.name);
        System.out.println(generatedCat.age);
        System.out.println(generatedCat.weight);

        System.out.println();

        Cat[] randomCats = Cat.generateCats(9);
        for (Cat current : randomCats) {
            System.out.println("Кот с именем %s, возраст: %d, вес: %d%n", current.name, current.age, current.weight);
        }
    }
}

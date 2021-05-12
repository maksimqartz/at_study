package notes.L3;

public class Application {
    public static void main(String[] args) {
        Human human = new Human();

        System.out.println(human.age);
        System.out.println(human.name);

        Human andy = new Human(46, "Andy");

        System.out.println(human.age);
        System.out.println(human.name);

    }

}

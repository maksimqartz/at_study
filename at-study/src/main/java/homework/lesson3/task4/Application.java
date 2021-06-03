package homework.lesson3.task4;

public class Application {
    public static void main(String[] args) {
        Human sergey = new Human("Сергей");
        Human valeriy = new Human("Валерий");
        Human stanislav = new Human("Станислав");
        Human mikhail = new Human("Михаил");
        Human egor = new Human("Егор");
        Human grigoriy = new Human("Григорий");
        Human aleksandr = new Human("Александр");

        sergey.addFriend(valeriy);
        stanislav.addFriend(valeriy);
        valeriy.addFriend(stanislav);
        stanislav.addFriend(mikhail);
        mikhail.addFriend(aleksandr);
        aleksandr.addFriend(egor);
        aleksandr.addFriend(grigoriy);
        grigoriy.addFriend(sergey);
    }

    private static boolean areFriends(Human human1, Human human2){
        return  human1.isFriendAlreadyAdded(human2);
    }
}

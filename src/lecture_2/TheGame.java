package lecture_2;

import lecture_2.inheritance.Goblin;
import lecture_2.inheritance.Human;
import lecture_2.inheritance.Zombie;

public class TheGame {


    public static void main(String[] args) {
        Goblin goblin = new Goblin(17, "Green Goblin", 3, "Sword", 80);
        Zombie zombie = new Zombie();
        Human human = new Human("Nika", 0);

        goblin.fight();

    }

}

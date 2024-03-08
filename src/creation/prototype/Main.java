package creation.prototype;

import creation.prototype.model.Archer;
import creation.prototype.model.Knight;
import creation.prototype.model.Warrior;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class Main {
    private final static Logger logger = Logger.getLogger("Demonstrate cloning: ");

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println();
        List<String> archerEquipment =
                new ArrayList<>(List.of("light armor", "arrows", "a bow stand"));
        Archer basicArcher = new Archer("bow", 100, archerEquipment);
        logger.info("Created basic archer: " + basicArcher);
        logger.info("Cloning " + basicArcher);
        archerCloning(basicArcher);

        System.out.println();
        List<String> warriorEquipment =
                new ArrayList<>(List.of("heavy armor", "shield"));
        Warrior basicWarrior = new Warrior("sword", 160, warriorEquipment);
        logger.info("Created basic warrior: " + basicWarrior);
        logger.info("Cloning " + basicWarrior);
        warriorCloning(basicWarrior);

        System.out.println();
        List<String> knightEquipment =
                new ArrayList<>(List.of("horse", "middle armor", "shield"));
        Knight basicKnight = new Knight("spear", 200, knightEquipment);
        logger.info("Created basic knight: " + basicKnight);
        logger.info("Cloning " + basicKnight);
        knightCloning(basicKnight);
    }

    private static void archerCloning(Archer archer) throws CloneNotSupportedException {
        logger.info("Clone first archer clone");
        Archer archer1 = archer.doClone();
        logger.info(archer1.toString());

        logger.info("Clone second archer clone");
        Archer archer2 = archer.doClone();
        logger.info(archer2.toString());

        logger.info("Clone third archer clone");
        Archer archer3 = archer.doClone();
        logger.info(archer3.toString());
    }

    private static void warriorCloning(Warrior warrior) throws CloneNotSupportedException {
        logger.info("Clone first warrior clone");
        Warrior warrior1 = warrior.doClone();
        logger.info(warrior1.toString());

        logger.info("Clone second warrior clone");
        Warrior warrior2 = warrior.doClone();
        logger.info(warrior2.toString());

        logger.info("Clone third warrior clone");
        Warrior warrior3 = warrior.doClone();
        logger.info(warrior3.toString());
    }

    private static void knightCloning(Knight knight) throws CloneNotSupportedException {
        logger.info("Clone first knight clone");
        Knight knight1 = knight.doClone();
        logger.info(knight1.toString());

        logger.info("Clone second knight clone");
        Knight knight2 = knight.doClone();
        logger.info(knight2.toString());

        logger.info("Clone third knight clone");
        Knight knight3 = knight.doClone();
        logger.info(knight3.toString());
    }
}

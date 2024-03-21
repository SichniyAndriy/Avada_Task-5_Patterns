package behavioral.memento;

import behavioral.memento.model.Game;
import behavioral.memento.model.GameCaretaker;
import java.util.Locale;
import net.datafaker.Faker;

public class Main {
    public static Faker faker = new Faker(Locale.getDefault());

    public static void main(String[] args) {
        Game game = new Game();
        GameCaretaker gameCaretaker = new GameCaretaker();

        int len = faker.random().nextInt(5, 15);
        for (int i = 0; i < len; i++) {
            game.increaseLevel();
            game.increaseScore(faker.random().nextInt(25, 75));
            gameCaretaker.addSave(game.save());
        }

        gameCaretaker.showSaves();

        game.showState();
        game.restore(gameCaretaker.getSaveByIndex(faker.random().nextInt(len)));
        game.showState();
    }
}

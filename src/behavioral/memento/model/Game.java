package behavioral.memento.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Game {
    private int level = 0;
    private int score = 0;

    public void showState() {
        System.out.println("Стан гри: Level - " + level + " Score - " + score);
    }

    public void increaseLevel() {
        ++level;
    }

    public void increaseScore(int value) {
        score += value;
    }

    public GameStateMemento save() {
        return new GameStateMemento(level, score);
    }

    public void restore(GameStateMemento memento) {
        level = memento.level();
        score = memento.score();
    }
}

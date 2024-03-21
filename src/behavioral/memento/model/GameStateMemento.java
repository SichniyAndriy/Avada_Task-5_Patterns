package behavioral.memento.model;

import java.time.LocalDateTime;

public record GameStateMemento(
        int level,
        int score,
        LocalDateTime date
) {
    public GameStateMemento(int level, int score) {
        this(level, score, LocalDateTime.now());
    }
}

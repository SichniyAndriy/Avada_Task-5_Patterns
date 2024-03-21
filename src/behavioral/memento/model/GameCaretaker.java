package behavioral.memento.model;

import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import lombok.NoArgsConstructor;
import org.apache.log4j.Logger;

@NoArgsConstructor
public class GameCaretaker {
    private final List<GameStateMemento> saves = new LinkedList<>();

    public void addSave(GameStateMemento save) {
        saves.add(save);
    }

    public GameStateMemento getSaveByIndex(final int x) {
        GameStateMemento memento = null;
        try {
            memento = saves.get(x - 1);
        } catch (IndexOutOfBoundsException e) {
            Logger.getLogger("").error(e);
        }
        return memento;
    }

    public void showSaves() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        for (var save: saves) {
            stringBuilder.append(++i).append(" - ");
            stringBuilder.append(dateTimeFormatter.format(save.date())).append(" - ");
            stringBuilder.append("Level: ").append(save.level()).append(" - ");
            stringBuilder.append("Score: ").append(save.score()).append("\n");
        }
        System.out.println(stringBuilder);
    }
}

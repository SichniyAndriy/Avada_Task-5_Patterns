package behavioral.command.model.command;

import behavioral.command.Player;

public abstract class AbstractCommand implements Command {
    protected final Player player;

    protected AbstractCommand(Player player) {
        this.player = player;
    }
}

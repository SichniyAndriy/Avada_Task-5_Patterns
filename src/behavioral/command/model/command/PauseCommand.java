package behavioral.command.model.command;

import behavioral.command.Player;

public class PauseCommand extends AbstractCommand {
    public PauseCommand(Player player) {
        super(player);
    }

    @Override
    public void execute() {
        player.pause();
    }
}

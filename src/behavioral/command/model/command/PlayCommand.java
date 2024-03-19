package behavioral.command.model.command;

import behavioral.command.Player;

public class PlayCommand extends AbstractCommand {
    public PlayCommand(Player player) {
        super(player);
    }

    @Override
    public void execute() {
        player.play();
    }
}

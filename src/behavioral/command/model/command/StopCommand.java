package behavioral.command.model.command;

import behavioral.command.Player;

public class StopCommand extends AbstractCommand {
    public StopCommand(Player player) {
        super(player);
    }

    @Override
    public void execute() {
        player.stop();
    }
}

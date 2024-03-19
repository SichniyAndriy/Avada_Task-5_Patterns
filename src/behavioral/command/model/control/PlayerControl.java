package behavioral.command.model.control;

import behavioral.command.Player;
import behavioral.command.model.command.Command;
import behavioral.command.model.command.PauseCommand;
import behavioral.command.model.command.PlayCommand;
import behavioral.command.model.command.StopCommand;

public class PlayerControl {
    protected final Command playCommand;
    protected final Command pauseCommand;
    protected final Command stopCommand;

    protected PlayerControl(Player player) {
        this.playCommand = new PlayCommand(player);
        this.pauseCommand = new PauseCommand(player);
        this.stopCommand = new StopCommand(player);
    }

    public void play() {
        playCommand.execute();
    }

    public void pause() {
        pauseCommand.execute();
    }

    public void stop() {
        stopCommand.execute();
    }
}

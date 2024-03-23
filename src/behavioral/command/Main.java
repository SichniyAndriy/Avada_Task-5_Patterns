package behavioral.command;

import behavioral.command.model.control.RemoteControl;
import behavioral.command.model.control.TouchControl;

/*
* Pattern Command lets wrap separate instruction in stand-alone class
* Further we could pass it as object from differ sender
*/
public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        System.out.println("Remote control");
        RemoteControl remoteControl = new RemoteControl(player);
        remoteControl.play();
        remoteControl.pause();
        remoteControl.play();
        remoteControl.stop();

        System.out.println("Touch control");
        TouchControl touchControl = new TouchControl(player);
        touchControl.play();
        touchControl.pause();
        touchControl.play();
        touchControl.stop();
    }
}

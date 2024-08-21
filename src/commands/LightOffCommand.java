package commands;

import model.Light;

public class LightOffCommand implements Command{

    public LightOffCommand(Light light){
        light.on();
    }
    @Override
    public void execute() {
        //
    }

    @Override
    public void undo() {
        //
    }
}

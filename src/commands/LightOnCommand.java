package commands;

import model.Light;

public class LightOnCommand implements Command{

    public LightOnCommand(Light light){
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

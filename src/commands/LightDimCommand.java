package commands;

import model.Light;

public class LightDimCommand implements Command{

    public LightDimCommand(Light light,int brightness){
        light.dim(brightness);
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

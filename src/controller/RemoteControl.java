package controller;

import commands.LightOffCommand;
import commands.LightOnCommand;
import model.KitchenLight;
import model.Light;

public class RemoteControl {
    private int slot;
    private int slots;
    private LightOnCommand lightOnCommand;
    private LightOffCommand lightOffCommand;

    private Light light;

    public RemoteControl(int slots){
        this.slots=slots;
        System.out.println(slots);
    }
    public void setCommand(int slot, LightOnCommand cmd1, LightOffCommand cmd2){
        this.slot=slot;
        this.lightOnCommand=cmd1;
        this.lightOffCommand=cmd2;

        if(slot==0){
            light=new KitchenLight();
        }else {
            light=null;
        }

    }

    public void onButtonWasPressed(int slot){
        light.on();
    }

    public void OffButtonWasPressed(int slot){
        light.off();
    }
    public void unDoButtonWasPressed(){
        light=null;

    }
}

package controller;

import commands.LightOffCommand;
import commands.LightOnCommand;
import model.KitchenRoomLight;

public class RemoteControl {
    private int slots;

    public RemoteControl(int slots){
        this.slots=slots;
        System.out.println(slots);
    }
    public void setCommand(int slot, LightOnCommand cmd1, LightOffCommand cmd2){
        if(slot==0){
            KitchenRoomLight kitchenRoomLight=new KitchenRoomLight();
                    kitchenRoomLight.on();
                    kitchenRoomLight.off();

        }


    }

    public void onButtonWasPressed(int slot){
        //
    }

    public void OffButtonWasPressed(int slot){
        //
    }
    public void unDoButtonWasPressed(){
        //
    }
}

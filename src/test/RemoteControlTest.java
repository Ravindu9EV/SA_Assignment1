package test;
import commands.LightDimCommand;
import commands.LightOffCommand;
import commands.LightOnCommand;
import controller.RemoteControl;
import model.KitchenLight;
import model.Light;
import model.LivingRoomLight;

public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remoteControl=new RemoteControl(2);

        Light kitchenLight=new KitchenLight();
        Light livingRoomLight=new LivingRoomLight();


        LightOnCommand kitchenLightOn=new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff=new LightOffCommand(kitchenLight);
        LightDimCommand kitchenLightDim=new LightDimCommand(kitchenLight,50);

        LightOnCommand livingRoomLightOn=new LightOnCommand(livingRoomLight);
        LightOffCommand liviRoomLightOff=new LightOffCommand(livingRoomLight);
        LightDimCommand livingRoomDim=new LightDimCommand(livingRoomLight,30);

        remoteControl.setCommand(0,kitchenLightOn,kitchenLightOff);

        remoteControl.onButtonWasPressed(0);
        remoteControl.OffButtonWasPressed(0);
        remoteControl.unDoButtonWasPressed();

        kitchenLightDim.execute();
        kitchenLightDim.undo();
    }
}

package model;

public class KitchenRoomLight implements Light {



    private int brightnessLevel;
    public KitchenRoomLight(){
        brightnessLevel=100;
    }
    @Override
    public void on() {
        System.out.println("Kitchen Room light is ON at full brightness.");
    }

    @Override
    public void off() {
        System.out.println("Kitchen Room light is OFF.");
    }

    @Override
    public void dim(int level) {
        brightnessLevel=level;
        System.out.println("Kitchen Room light dimmed to "+level+"%.");
    }
}

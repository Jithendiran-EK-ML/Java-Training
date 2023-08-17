package OOPS.Jcars.Model;

import OOPS.Jcars.Utils.GearBox.GearBox.Gear;

public class SRT23 extends SRT21 {
    public SRT23(){
        super(true);
        this.clutch(); // clutch can work here
        runCar();
    }

    public void openDoor(){
        System.out.println("Driver door opened 23");
    }

    public void openDoor(int num){
        if(num > 3) num = 3;
        System.out.println("Driver door opened and "+num+" opened 23");
    }

    public void newFeature(){
        System.out.println("New Feature 23");
    }

    @Override
    public void gearFunc(){
        super.gearFunc();
        System.out.println("Inside 23 Gear");
        gear.setGear(2);
        gear.setDirection(Gear.FORWORD);
    }
}

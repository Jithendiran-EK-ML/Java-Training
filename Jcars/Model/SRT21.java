package Jcars.Model;

import Jcars.Factory.Engine.V8;
import Jcars.Factory.GearBox.Gear4;
import Jcars.Factory.Streeing.Power;
import Jcars.Utils.Car.Car;
import Jcars.Utils.GearBox.GearBox.Gear;

public class SRT21 extends V8 implements Car {

    protected final Gear4 gear;
    private final Power stearing;
    private final String MODEl="SRT21";

    private void powerOn() {
        System.out.println(this.getClass().toString()+" :: "+"powered");
    }

    SRT21(){
        System.out.println("Constructor default");
        powerOn();
        gear = new Gear4();
        stearing = new Power();
        runCar();
    }

    SRT21(boolean isPowerMode) {
        this();
        if (isPowerMode) powerMode();
    }

    // polymorphism
    public void openDoor(){
        System.out.println("Driver door opened");
    }

    public void openDoor(int num){
        if(num > 3) num = 3;
        System.out.println("Driver door opened and "+num+" opened");
    }

    protected void clutch() {
        System.out.println("Clutch is pressed");
    }

    public void depricatedFeature() {
        System.out.println("Depricated 21");
    }

    public void gearFunc(){
        System.out.println("Inside 21 Gear");
        gear.setGear(2);
        gear.setDirection(Gear.FORWORD);
    }

    @Override
    public String getModel() {
        return MODEl;
    }
}

package OOPS.Jcars;
import OOPS.Jcars.Model.Dodge;
import OOPS.Jcars.Model.SRT21;
import OOPS.Jcars.Model.SRT23;
import OOPS.Jcars.Utils.Car.Car;

public class Main {

    static void getModel(Car car){
        System.out.println("MOdel : "+car.getModel());
    }
    public static void main(String[] args) {

        SRT23 demon23 = new SRT23();
        demon23.openDoor();
        demon23.openDoor(2);
        demon23.getRpm();
        demon23.powerMode();
        demon23.getRpm();
        demon23.cutOff();
        demon23.depricatedFeature();
        demon23.newFeature();

        Dodge dodge = new Dodge();
        
        getModel(demon23);
        getModel(dodge);

        // run time polymorphism
        // upcasting
        SRT21 demon = new SRT23();
        demon.openDoor(1);
        demon.getRpm();
        demon.powerMode();
        demon.getRpm();
        demon.cutOff();
        demon.depricatedFeature();
        //demon.newFeature(); error

        // downcasting
        SRT23 demonDown = (SRT23) demon;
        demonDown.openDoor(2);
        demonDown.ignite();
        demonDown.getRpm();
        demonDown.powerMode();
        demonDown.getRpm();
        demonDown.cutOff();
        demonDown.depricatedFeature();
        demonDown.newFeature();
    }
}

package OOPS.Jcars.Model;

import OOPS.Jcars.Factory.Engine.V8;
import OOPS.Jcars.Utils.Car.Car;

public class Dodge extends V8 implements Car {
    private final String MODEl="Dodge";
    @Override
    public String getModel() {
        return MODEl;
    }
}

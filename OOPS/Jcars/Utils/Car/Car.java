package OOPS.Jcars.Utils.Car;

public interface Car {
    default void runCar() {
        System.out.println(this.getClass().toString()+":: running");
    }
    String getModel();
    String MODEl = "";
}
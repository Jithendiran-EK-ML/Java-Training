package OOPS.Jcars.Factory.Engine;

import OOPS.Jcars.Utils.Engine.Gasoline;

public abstract class Engine implements Gasoline{
    
    static final int MINRPM = 10;
    static final int MaxRPM = 10000;

    static final float MINFUEL = 10f;
    static final float MAXFUEL = 60f;

    private int noOfCylinders;

    // This function will cut off the car engine
    @Override
    public void cutOff() {
        System.out.println(this.getClass().toString()+" : Engine Kill");
    }

    /**
     * This function will set cylinder count
     * @param count
     */
    public void setCylinder(int count) {
        noOfCylinders = count;
    }

    /**
     * This function will get cylinder count
     * @return
     */
    public int getCylinder() {
        return noOfCylinders;
    }

    abstract void pullFuel(float value);
    abstract void run();
}

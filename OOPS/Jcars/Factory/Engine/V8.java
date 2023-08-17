package OOPS.Jcars.Factory.Engine;

public class V8 extends Engine {
    private int rpm;
    private float fuel;
    // run time polymorphism
    static final int MINRPM = 50;
    static final int MAXRPM = 50000;

    static final float MINFUEL = 10f;
    static final float MAXFUEL = 100f;

    // This function will start the engine
    @Override
    public void ignite() {
        setStandBymode();
        System.out.println(getClass().toString()+" :: Engine start");
    }

    // This function will get the current RPM
    @Override
    public int getRpm() {
       return rpm;
    }

    // This function will set RPM
    @Override
    public void setRpm(int rmp) {
        rpm = rmp;
    }

    /**
     * This function will pull the fuel
     * @param value
     */
    @Override
    void pullFuel(float value) {
        this.fuel = value;
    }

    // This function set engine in eco mode
    public void setStandBymode() {
        pullFuel(MINFUEL);
        setRpm(MINRPM);
        run();
    }
    
    // This function will set engine in power mode
    public void powerMode() {
        pullFuel(MAXFUEL);
        setRpm(MAXRPM);
        run();
    }

    // This function will run the engine
    @Override
    void run(){
        System.out.println(this.getClass().toString()+" :: Engine fuel : "+fuel+", RPM : "+rpm);
    }
}

package OOPS.Jcars.Factory.GearBox;

import OOPS.Jcars.Utils.GearBox.GearBox;

public class Gear4 implements GearBox {
    private int gear = 0;
    private final Type type;
    private Gear gearDirection;
    private static final int MAXGEAR = 4;

    enum Type {
        AUTO,
        MANUAL
    }

    public Gear4() {
        type = Type.MANUAL;
    }

    public Gear4(boolean isAuto){
        if(isAuto) {
            type = Type.AUTO;
        } else {
            type = Type.MANUAL;
        }
    }

    /**
     * This function will set gear direction
     * @param direction
     */
    @Override
    public void setDirection(Gear direction) {
        gearDirection = direction;
    }

    /**
     * This function will return the gear direction
     * @return 
     */
    @Override
    public Gear getDirection() {
        return gearDirection;
    }
    
    /**
     * This function will set gear
     * @param gear
     */
    @Override
    public void setGear(int gear) {
        if(gear > MAXGEAR) gear = MAXGEAR;
        else if (gear < 0) gear = 0;
        else this.gear = gear;
    }

    /**
     * This function will get gear
     * @return
     */
    @Override
    public int getGear() {
        return gear;
    }

    /**
     * This function will return the type of the gear
     * @return
     */
    public Type getType() {
        return type;
    }
}

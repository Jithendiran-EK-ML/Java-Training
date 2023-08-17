package OOPS.Jcars.Utils.GearBox;

public interface GearBox {
    enum Gear {
        REVERSE,
        FORWORD
    }
    enum Type {
        MANUAL
    }

    int getGear();
    Gear getDirection();
    void setGear(int gear);
    void setDirection(Gear direction);
}

package Jcars.Utils.Streeing;

public interface Handle {
    enum Direction {
        STRAIGHT,
        LEFT,
        RIGHT
    }

    Direction direction=Direction.STRAIGHT;
    void setDirection(Direction direction);
    default Direction getDirection() {
        return direction;
    }
}

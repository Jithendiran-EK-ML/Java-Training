package Jcars.Factory.Streeing;

import Jcars.Utils.Streeing.Handle;

public abstract class Streeing implements Handle {

    /**
     * This function will set the streeing direction
     * @param direction
     */
    @Override
    public void setDirection(Direction direction) {
        // direction only modify here
        System.out.println(this.getClass().toString()+" :: Straignt");
        // don't know how it is modify
       direction = direction;
    }
    
    // This function will rotate the streeing to straight
    public void rotateStaight() {
        // direction = Direction.STRAIGHT;
        // The final field Handle.direction cannot be assignedJava(33554512)
        setDirection(Direction.STRAIGHT);
    }

    abstract void rotateLeft(float degree);
    abstract void rotateRight(float degree);

}

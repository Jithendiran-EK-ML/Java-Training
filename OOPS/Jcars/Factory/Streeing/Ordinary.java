package OOPS.Jcars.Factory.Streeing;

public class Ordinary extends Streeing {

    private float degree;
    
    /**
     * This function will rotate the streeing to left with degree input
     * @param degree
     */
    @Override
    void rotateLeft(float degree) {
        this.degree = degree;
        System.out.println(this.getClass().toString()+":: Rotating left "+degree+" deg");
    }

    /**
     * This function will rotate the streeing to right with degree input
     * @param degree
     */
    @Override
    void rotateRight(float degree) {
        this.degree = degree;
        System.out.println(this.getClass().toString()+":: Rotating Right "+degree+" deg");
    }
    
}

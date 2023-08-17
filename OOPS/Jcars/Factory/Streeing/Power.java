package OOPS.Jcars.Factory.Streeing;

public class Power extends Ordinary {
    private boolean isLocked;

    private float offSet;
    // This function will lock the streeing
    public void lock() {
        isLocked = true;
    }

    // This function will unlock the streeing
    public void unLock() {
        isLocked = false;
    }

    /**
     * This function will get the status of the streeing
     * @return
     */
    public boolean islocked() {
        return isLocked;
    }

    /**
     * This function set the power streeing offset
     * @param offset
     */
    public void setSmootOffset(float offset) {
        this.offSet = offset;
    }

    // This function will get the power streeing offset
    public float getSmootOffset() {
        return offSet;
    }
}

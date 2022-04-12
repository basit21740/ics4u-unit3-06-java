/*
 * This is a Jet class.
 *
 * @author  Abdul Basit Butt
 * @version 1.0
 * @since   2022-02-03
 */

/** Jet class based off of Airplane. */
public class Jet extends Airplane {

    /** Speed multiplier. */
    private static final int MULTIPLIER = 2;

    /**
     * Sets the jet's speed.
     *
     * @param speed the new speed
     * */
    public void setSpeed(final int speed) {
        super.setSpeed(speed * MULTIPLIER);
    }

    /** Accelerates the jet's speed. */
    public void accelerate() {
        super.setSpeed(getSpeed() * MULTIPLIER);
    }
}

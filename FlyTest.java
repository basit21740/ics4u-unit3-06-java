/*
 * This is the FlyTest program.
 *
 * @author  Abdul Basit Butt
 * @version 1.0
 * @since   2022-03-04
 */

/** FlyTest program. */
final class FlyTest {

    /**
     * Prevents instantiation.
     * Throw an exception IllegalStateException when called.
     *
     * @throws IllegalStateException
     *
     */
    private FlyTest() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * Stub program for Jet and Airplane classes.
     *
     * @param args No args will be used
     * */
    public static void main(final String[] args) {

        final int biplaneSpeed = 212;
        final int boeingSpeed = 422;
        final int topBoundSpeed = 5000;
        final int topBoundCounter = 4;

        final Airplane biplane = new Airplane();
        biplane.setSpeed(biplaneSpeed);
        System.out.println(biplane.getSpeed());

        final Jet boeing = new Jet();
        boeing.setSpeed(boeingSpeed);
        System.out.println(boeing.getSpeed());

        int counter = 0;
        while (counter < topBoundCounter) {
            boeing.accelerate();
            System.out.println(boeing.getSpeed());

            if (boeing.getSpeed() > topBoundSpeed) {
                biplane.setSpeed(biplane.getSpeed() * 2);
            } else {
                boeing.accelerate();
            }
            counter++;
        }
        System.out.println(biplane.getSpeed());
    }
}

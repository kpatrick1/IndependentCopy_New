package us.kpatrick;

/**
 * This is a testing class used to make sure a arraylist works.
 * @author Our Group
 * @version 1.0
 */
public class Dummy implements StringExpressable {
    private String thing;

    /**
     * Constructor to make a Dummy.
     * @param thing A String
     */
    public Dummy(String thing) {
        this.thing = thing;
    }

    /**
     * This method returns the thing.
     * @return The string stored in thing.
     */
    public String stringable(){
        return thing;
    };

    /**
     * This overrides the toString method to just show thing.
     * @return The string stored in thing.
     */
    @Override
    public String toString() {
        return thing;
    }
}

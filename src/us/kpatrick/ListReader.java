package us.kpatrick;

/**
 * This class takes from the array and reads the first element.
 * @author Our Group
 * @version 1.0
 */
public class ListReader implements Reader{

    /**
     * This returns the element in the array
     * @return The element as a string
     */
    public String readln(){

        return Driver.array.get(0).toString();
    }

}

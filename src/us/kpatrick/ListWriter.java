package us.kpatrick;
/**
 * This class writes the String into the array
 * @author Our Group
 * @version 1.0
 */
public class ListWriter implements Writer{

    /**
     * This method writes the string into the array.
     * @param line The string that was read
     */
    public void writeln( String line ){

        StringExpressable holder = new Dummy(line);

        Driver.array.add(holder);

    }

}

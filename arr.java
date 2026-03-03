/**
 * OOPSBannerApp UC4 - OOPS BAnner Display APllication
 * 
 * This calss demonstrates a simple Java application that displays the Object Oriented Programming System OOPS acronym to the console.
 * 
 * @author Allen Paul D
 * @version 1.0
 */

public class OOPSBannerApp
{
    public static void main(String[] args) 
    {
    // Step 1: Create array for 7 lines
        String[] lines = new String[7];

        // Step 2: Store OOPS banner using String.join()
        lines[0] = String.join("   ", " ***** ", " ***** ", " ******", " ***** ");
        lines[1] = String.join("   ", "*     *", "*     *", "*      ", "*     *");
        lines[2] = String.join("   ", "*     *", "*     *", "*      ", "*     *");
        lines[3] = String.join("   ", "*     *", "*     *", "*****  ", " ***** ");
        lines[4] = String.join("   ", "*     *", "*     *", "*      ", "      *");
        lines[5] = String.join("   ", "*     *", "*     *", "*      ", "*     *");
        lines[6] = String.join("   ", " ***** ", " ***** ", "*      ", " ***** ");

        // Step 3: Print using for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }  
}

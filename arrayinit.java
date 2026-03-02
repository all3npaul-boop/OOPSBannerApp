/**
 * OOPSBannerApp UC5 - Render OOPS as Banner using Inline Array Initialization
 * 
 * This use case extends UC4 by defining and populating the String array
 * at the time of declaration using String.join() to create each line
 * of the banner in a concise and readable format.
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline declaration and initialization of banner lines
        String[] lines = {
            String.join("   ",
                " *** ",
                " *** ",
                " *****",
                " *****"
            ),
            String.join("   ",
                "*   *",
                "*   *",
                "*    ",
                "*    "
            ),
            String.join("   ",
                "*   *",
                "*   *",
                " *****",
                " *****"
            ),
            String.join("   ",
                "*   *",
                "*   *",
                "     *",
                "     *"
            ),
            String.join("   ",
                "*   *",
                "*   *",
                "*   *",
                "*   *"
            ),
            String.join("   ",
                "*   *",
                "*   *",
                "*   *",
                "*   *"
            ),
            String.join("   ",
                " *** ",
                " *** ",
                " *****",
                " *****"
            )
        };

        // Enhanced for-loop to print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}

/**
 * OOPSBannerApp - UC4
 * Render OOPS as Banner using String Array and Loop
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {

            String.join(" ", " ***** ", " ***** ", " ***** ", " ***** "),
            String.join(" ", "*     *", "*     *", "*     *", "*      "),
            String.join(" ", "*     *", "*     *", " ***** ", " ***** "),
            String.join(" ", "*     *", "*     *", "*      ", "      *"),
            String.join(" ", "*     *", "*     *", "*      ", "      *"),
            String.join(" ", "*     *", "*     *", "*      ", "*     *"),
            String.join(" ", " ***** ", " ***** ", "*      ", " ***** ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}


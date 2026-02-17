/**
 * OOPSBannerApp UC3 - OOPS Banner using String.join()
 *
 * Prints the word OOPS in banner format using String.join()
 * instead of string concatenation.
 *
 * @author Gitika
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join("", " ***** ", " ***** ", " ***** ", " ***** "));
        System.out.println(String.join("", " *   * ", " *   * ", " *   * ", " *     "));
        System.out.println(String.join("", " *   * ", " *   * ", " ***** ", " ***** "));
        System.out.println(String.join("", " *   * ", " *   * ", " *     ", "     * "));
        System.out.println(String.join("", " *   * ", " *   * ", " *     ", "     * "));
        System.out.println(String.join("", " ***** ", " ***** ", " *     ", " ***** "));
    }
}

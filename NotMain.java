import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NotMain {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit w3schools!");
        boolean found = matcher.find();

        if (found) {
            System.out.println("Found a match!");
        }
        else {
            System.out.println("No match found!");
        }
    }
}

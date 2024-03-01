import java.util.regex.*;

public class pass {
    public static void main(String[] args) {
        String password = "YourPassword123!";
        if (isValidPassword(password)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    public static boolean isValidPassword(String password) {
        // Minimum length check
        if (password.length() < 8) {
            return false;
        }

        // Regex patterns to check for uppercase, lowercase, digit, and special character
        String uppercasePattern = "(?=.*[A-Z])";
        String lowercasePattern = "(?=.*[a-z])";
        String digitPattern = "(?=.*[0-9])";
        String specialCharPattern = "(?=.*[@#$%^&+=!])"; // Add more special characters as needed

        // Combine patterns
        String combinedPattern = uppercasePattern + lowercasePattern + digitPattern + specialCharPattern + ".+";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(combinedPattern);

        // Match the password against the pattern
        Matcher matcher = pattern.matcher(password);

        return matcher.matches() && !password.contains(" ");
    }
}

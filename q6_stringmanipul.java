import java.util.Scanner;

public class q6_stringmanipul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int length = inputString.length();
        System.out.println("Length of the string: " + length);

        String uppercase = inputString.toUpperCase();
        String lowercase = inputString.toLowerCase();
        System.out.println("Uppercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);

        System.out.print("Enter the starting index for the substring: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter the ending index for the substring: ");
        int endIndex = scanner.nextInt();
        scanner.nextLine();

        if (startIndex >= 0 && startIndex < length && endIndex >= startIndex && endIndex <= length) {
            String substring = inputString.substring(startIndex, endIndex);
            System.out.println("Substring: " + substring);
        } else {
            System.out.println("Invalid substring indices.");
        }

        System.out.print("Enter a substring to search : ");
        String searchString = scanner.nextLine();
        boolean containsSubstring = inputString.contains(searchString);
        System.out.println("Contains substring? " + containsSubstring);

        System.out.print("Enter thestring to replace: ");
        String replaceString = scanner.nextLine();
        System.out.print("Enter the replacement string: ");
        String replacement = scanner.nextLine();
        String replacedString = inputString.replace(replaceString, replacement);
        System.out.println("Replaced string: " + replacedString);

        System.out.print("Enter the delimiter for splitting the string: ");
        String delimiter = scanner.nextLine();
        String[] splitStrings = inputString.split(delimiter);
        System.out.println("Split strings:");
        for (String str : splitStrings) {
            System.out.println(str);
        }

        String trimmedString = inputString.trim();
        System.out.println("Trimmed string: " + trimmedString);

        System.out.print("Enter a prefix to check: ");
        String prefix = scanner.nextLine();
        boolean startsWithPrefix = inputString.startsWith(prefix);
        System.out.println("Starts with prefix? " + startsWithPrefix);

        System.out.print("Enter a suffix to check: ");
        String suffix = scanner.nextLine();
        boolean endsWithSuffix = inputString.endsWith(suffix);
        System.out.println("Ends with suffix? " + endsWithSuffix);

    }
}
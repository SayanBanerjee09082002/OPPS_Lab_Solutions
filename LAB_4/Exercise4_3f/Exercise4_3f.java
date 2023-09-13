package LAB_4.Exercise4_3f;

public class Exercise4_3f {
    public static void main(String[] args) {
        char[] ch = { 'M', 'y', ' ', 'n', 'a', 'm', 'e', ' ', 'i', 's', ' ', 'S', 'a', 'y', 'a', 'n' };

        for (char c : ch) {
            System.out.print(c + " ");
        }
        System.out.println();

        String str = new String(ch);
        System.out.println("Converted String: " + str);

        // compareToIgnoreCase
        int compareResult = str.compareToIgnoreCase("hello, world");
        System.out.println("compareToIgnoreCase result: " + compareResult);

        // toLowerCase
        String lowerCaseStr = str.toLowerCase();
        System.out.println("toLowerCase result: " + lowerCaseStr);

        // toUpperCase
        String upperCaseStr = str.toUpperCase();
        System.out.println("toUpperCase result: " + upperCaseStr);

        // trim
        String trimmedStr = "   Trim me   ";
        String trimmedResult = trimmedStr.trim();
        System.out.println("Trimmed result: " + trimmedResult);

        // replace
        String replacedStr = str.replace('o', '0');
        System.out.println("Replace result: " + replacedStr);
    }
}

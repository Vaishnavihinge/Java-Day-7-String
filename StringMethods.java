public class StringMethods {
    public static void main(String[] args) {
        String originalString = " Hello, World! ";
        System.out.println("Original String: " + originalString);

        System.out.println("Length: " + originalString.length());

        String trimmedString = originalString.trim();
        System.out.println("Trimmed String: " + trimmedString );

        String upperCaseString = trimmedString.toUpperCase();
        System.out.println("Upper Case: " + upperCaseString );

        String lowerCaseString = trimmedString.toLowerCase();
        System.out.println("Lower Case: " + lowerCaseString );

        System.out.println("Character at index 7: " + trimmedString.charAt(7) + "");

        System.out.println("Index of 'World': " + trimmedString.indexOf("World") + "");

        System.out.println("Contains 'Hello': " + trimmedString.contains("Hello") + "");

        System.out.println("Substring from index 7: " + trimmedString.substring(7) + "");

    }
}

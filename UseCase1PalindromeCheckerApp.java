public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args) {

        // Hardcoded input string
        String input = "madam";
        String reversed = "";

        // Iterate from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed using equals()
        boolean isPalindrome = input.equals(reversed);

        // Display the result
        System.out.println("Input text    : " + input);
        System.out.println("Reversed text : " + reversed);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
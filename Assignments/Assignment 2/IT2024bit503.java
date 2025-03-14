public class IT2024bit503 {
    static String s = "";
    static int sum = 0;
    static String[] arr;
    static int totalSubstrings = 0;
    static int index = 0; 
    static int palindromeCount = 0;

    public static String SumOfDigit(int number) {
        return SumOfDigitHelper(number);
    }

    private static String SumOfDigitHelper(int number) {
        if (number > 0) {
            s = (number % 10) + (s.isEmpty() ? "" : "+") + s; 
            sum += number % 10;
            return SumOfDigitHelper(number / 10);
        }
        return s + "=" + sum;
    }

    public static String isPlindrome(String inputString) {
        return isPlindromeHelper(inputString, 1);
    }

    private static String isPlindromeHelper(String inputString, int pos) {
        if (inputString.length() <= 1) {
            return "It is palindrome";
        }
        if (inputString.charAt(0) != inputString.charAt(inputString.length() - 1)) {
            return "In this String the character at position " + pos +
                    " is not matching with the character at position " + (pos + inputString.length() - 1) + ".";
        }
        return isPlindromeHelper(inputString.substring(1, inputString.length() - 1), pos + 1);
    }

    public static void Task3(String inputString) {
        totalSubstrings = (inputString.length() * (inputString.length() + 1)) / 2;
        arr = new String[totalSubstrings]; // Initialize array
        index = 0; // Reset index
        palindromeCount = 0; // Reset palindrome count

        generateSubstrings(inputString, 0, 1);
        // Call the method to check palindromes in substrings recursively
        checkPalindromesInSubstrings(0);

        System.out.println("Total number of substrings in the string are: " + totalSubstrings);
        System.out.println("Number of palindromic substrings: " + palindromeCount);

    }

    private static void generateSubstrings(String str, int start, int end) {
        // Base case for recursion: if start reaches the length of the string, return.
        if (start >= str.length()) {
            return;
        }

        // Generate substrings starting from 'start' to the end of the string
        if (end <= str.length()) {
            arr[index++] = str.substring(start, end);
            generateSubstrings(str, start, end + 1); // Recur with the next end index
        } else {
            // Move to the next starting position
            generateSubstrings(str, start + 1, start + 2);
        }
    }

    private static void checkPalindromesInSubstrings(int i) {
        // Base case: if all substrings have been checked
        if (i >= arr.length) {
            return;
        }

        // Check if the current substring is a palindrome
        if (isPalindrome(arr[i])) {
            palindromeCount++;
        }

        // Recur for the next substring
        checkPalindromesInSubstrings(i + 1);
    }

    private static boolean isPalindrome(String str) {
        return isPalindromeHelper(str, 0, str.length() - 1);
    }

    private static boolean isPalindromeHelper(String str, int left, int right) {
        // Base case: if the left index crosses the right, it means the string is a palindrome
        if (left >= right) {
            return true;
        }
        
        // If characters at left and right are different, it's not a palindrome
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        
        // Recur for the next pair of characters
        return isPalindromeHelper(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide three arguments: an integer, a string for palindrome check, and a string for substrings.");
            return;
        }
        System.out.println("Task 1");
        System.out.println(SumOfDigit(Integer.parseInt(args[0])));

        System.out.println("Task 2");
        System.out.println(isPlindrome(args[1]));

        System.out.println("Task 3");
        Task3(args[2]);
    }
}

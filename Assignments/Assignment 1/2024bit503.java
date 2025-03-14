class IT2024bit503 {
    static int i = 1;
    static String result = "";

    public static String reverse(String inputString) {
        if (inputString.length() >= i) {

            result = result + inputString.charAt(inputString.length() - i);
            i++;
            reverse(inputString);

        }
        return result;
    }

    public static int sumOfDigits(int number) {
        if (number < 10) {
            return number;
        }
        return number % 10 + sumOfDigits(number / 10);
    }

    public static boolean isPalindrome(String inputString) {
        if (inputString.length() <= 1) {
            return true;
        }
        if (inputString.charAt(0) != inputString.charAt(inputString.length() - 1)) {
            return false;
        }
        return isPalindrome(inputString.substring(1, inputString.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println(reverse("Utsav 2025"));
        System.out.println(sumOfDigits(1213));
        System.out.println(isPalindrome("bggb"));
    }
}
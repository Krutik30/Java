class p85 {
    public static boolean isPalindrome(String s) {
        return isPalindromeHelper(s, 0, s.length() - 1);
    }

    private static boolean isPalindromeHelper(String s, int low, int high) {
        if (high <= low)
            return true;
        else if (s.charAt(low) != s.charAt(high))
            return false;
        else
            return isPalindromeHelper(s, low + 1, high - 1);
    }

    public static void main(String[] args) {
        System.out.println("good: " + isPalindrome("good"));
        System.out.println("goog: " + isPalindrome("goog"));
        System.out.println("saras: " + isPalindrome("saras"));
        System.out.println("sarras: " + isPalindrome("sarras"));
    }
}

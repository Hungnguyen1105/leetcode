package Algorithm.leetcode;

public class PalindromeNumber {
    //Ex2. Given an integer x, return true if x is a palindrome, and false otherwise.
    public boolean isPalindrome(int x){
        if (x<0 || (x%10==0 && x!=0)){
           return false;
        }
        int reversedNum = 0;
        while(x > reversedNum){
            reversedNum = reversedNum * 10 + x %10;
            x = x /10;
        }
        return x == reversedNum || x == reversedNum/10;
    }
    public static void main (String[]args){
        PalindromeNumber solution = new PalindromeNumber();
        System.out.println(solution.isPalindrome(122));   // Output: true
        System.out.println(solution.isPalindrome(-122));  // Output: false
        System.out.println(solution.isPalindrome(10));    // Output: false

    }
}

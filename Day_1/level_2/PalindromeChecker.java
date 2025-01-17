/*
Program to Check Palindrome String
Problem Statement: 	Create a PalindromeChecker class with an attribute text. Add methods to:
Display the result.
Explanation: The PalindromeChecker class holds the text attribute. The methods operate on this attribute to verify its palindrome status and display the result.
*/
public class PalindromeChecker {
    private String text;
    PalindromeChecker(String s ){
        this.text = s;
    }
//    Check if the text is a palindrome.
    public boolean checkPalindrome(){
        int n = this.text.length() - 1;
        for (int i=0;i<n;i++) {
            if (this.text.charAt(i)!=this.text.charAt(n-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        PalindromeChecker obj = new PalindromeChecker("ABCA");
        if (obj.checkPalindrome()){
            System.out.println("Text "+obj.text+" is Palindrome");
        }else {
            System.out.println("Text "+obj.text+" is not Palindrome");
        }
    }
}



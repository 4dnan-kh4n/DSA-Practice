package DSAPractice.Recursion;

public class palindromeString {
    public boolean isPalindrome(String str, int start){
        if (start>=str.length()/2){
            return true;
        }
        if (str.charAt(start) != str.charAt(str.length()-start-1)){
            return false;
        }
        return isPalindrome(str,start+1);
    }


    public static void main(String[] args) {
        String str = "Madam";
        str = str.toLowerCase();
        int start = 0;
        palindromeString obj = new palindromeString();

        if(obj.isPalindrome(str,start)){
            System.out.println("Yes this string is Palindrome");
        }
        else {
            System.out.println("No this string is not Palindrome");
        }
    }
}

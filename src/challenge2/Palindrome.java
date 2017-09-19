package challenge2;


public class Palindrome {

    public static void main(String[] args) {
        // TODO code application logic here
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome(1232122));
        System.out.println(p.isPalindrome("abcba"));
        
         
        
    }
    private String isPalindrome(int i)
    {
        Integer i1=new Integer(i);
        return isPalindrome(i1.toString());
    }
 private String isPalindrome(String s)
 {
        boolean b = true;
        int n=s.length();
        for(int i=0;i<=n/2;i++)
            if(s.charAt(i)!=s.charAt(n-i-1))
                b = false;
          
        
       
        if(b)
            return "Palindrome";
        else 
            return "Not a Palindrome";  
       
 }
    
}
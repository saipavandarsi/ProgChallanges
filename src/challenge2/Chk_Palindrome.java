package challenge2;

public class Chk_Palindrome {

	public Chk_Palindrome() {
		// TODO Auto-generated constructor stub
	}
	
	public void isPalindromeNum(int number){
		int reminder = 0;
		int sum = 0;
		int temp = number;
		while(number > 0){
			reminder = number % 10;
			sum = (sum * 10) + reminder ;
			number = number /10;
		}
		
		if(sum == temp)
			System.out.println("Yes.." + temp + " is a palindrome");
		else 
			System.out.println("No.." + temp + " is not a palindrome");
	}
	public static void main(String[] args) {
		Chk_Palindrome palcls = new Chk_Palindrome();
		palcls.isPalindromeNum(454);
		palcls.isPalindromeNum(123);
	}
}

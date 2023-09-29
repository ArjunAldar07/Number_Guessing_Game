package NumberGame;

import java.util.Scanner;

public class Number {
	public static void meth1()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("<<<<WELCOME TO NUMBER GUESSING GAME >>>>");
		System.out.println(" || You Have To Maximum 5 triels ||");
		int max=5;
		int number=(int) (1+ (100 *Math.random()));
		System.out.println(number);
		int guess;
		
		for(int i=1;i<=max;i++)
		{
			System.out.println("Enter Guess Number Between 1 to 100");
			guess=sc.nextInt();
			System.out.println("Your  Triel is "+(i));
			
			if(guess==number)
			{
				System.out.println("Congratulation you Guess is Correct");
				System.out.println("======>YOU WON<======");
				break;
			}
			else if(number < guess && (i!= max-1))
			{
				System.out.println("You are number is Grater");
			}
			else if(number >guess && (i!= max-1))
			{
				System.out.println("You are number is Smaller");
			}
		
			if(i==max)
			{
				System.out.println("Your triel was finised:");
			}
			
		}
		
		
		
	}

	public static void main(String[] args) {
		Number.meth1();
		
	}

}

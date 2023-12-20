

import java.util.Scanner;

public class Number_Guess_Game
{
	static 
	{
		System.out.println("_________________________");
		System.out.println("Welcome to the Game......");
	}
	Scanner sc = new Scanner(System.in);
	public static void number()
	{
		int a = 80;
		System.out.println("Guess the number : ");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		
		if(b==a)
		{
			System.out.println("Wow!!!....Right Guessed");
		}
		else {
		if(b>80)
		{
			System.out.println("uff!!!The number is too High ");
			System.out.println("_____________________________");
			number();
		}
		else if (b<80)
		{
			System.out.println("uff!!!The number is too Low");
			System.out.println("___________________________");
			number();
		}
		}
	}
	public static void main(String[] args) 
	{
		number();
		while (true) {
			System.out.println("_________________________________");
		System.out.println("_________________________________");
		System.out.println("Do you want to play again");
		System.out.println("Enter 1 : Yes ");
		System.out.println("Enter 2 : No  ");
		
		Scanner sc1 = new Scanner(System.in);
		int c = sc1.nextInt();
		
		if(c == 1)
		{
		 number();
		}
		else if (c ==2)
		{
			System.out.println("Thank You So Much!!");
			break;
		}
		
		}
	}
	
}


import java.util.Scanner;

public class Guess
{
	public static void main(String[] args)
	{
		int atempt = 1;
		int userGuess = 0;
		int guess = (int) (Math.random() * 99 + 1);


		Scanner userin = new Scanner(System.in);
		System.out.println("Guess and win a prize")

		do{
			System.out.print("Enter a guess within 1 - 100\n")
			if(userin.hasNextInt()){
				userGuess = userin.NextInt();
				if(userGuess == guess)
				{
					System.out.println("correct");
					break;
				}
				else if(userGuess < guess)
				System.out.println("Your guess is smaller");
				else if(userGuess > guess)
				System.out.println("Your guess is greater")
				if(atempt == 5)
				{
					System.out.println("You have exceeded the maxiumum attempt. Try again");
					break;
				}
				attempt++;
			}else{
				System.out.println("Enter a valid interger");
				break;
			}
			while(userGuess != guess)
		}
	}
}
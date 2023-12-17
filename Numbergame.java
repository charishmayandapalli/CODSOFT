import java.util.Scanner;

public class Numbergame {
	public static void guessingNumber()
	{
		Scanner sc = new Scanner(System.in);
		int min=1;
		int max=100;
		int round=0;
		int totalscore=0;
		int K = 3;
		int i, guess;
		System.out.println("Welcome to Number Guessing Game!");
		do
		{
		int number = min + (int)(max * Math.random());

	    System.out.println("Round"+(round+1)+":guess the number between"+min+"and"+max);
		for (i = 0; i < K; i++) {

			System.out.println("Guess the number:");
			guess = sc.nextInt();
			if (number == guess) {
				System.out.println("Congratulations!"+ " You guessed the correct number in"+i+"attempts.\n");
				break;
			}
			else if (number > guess
					&& i != K - 1) {
				System.out.println("Too high.Try again.");
			}
			else if (number < guess
					&& i != K - 1) {
				System.out.println("Too low.Try again.");
			}
		}
        if (i == K-1) {
			System.out.println("Sorry,you've reached the maximum attemps.The correct number was:"+number+"\n");
		}
	System.out.print("DO you want to play again?(yes/no):");
	String playagain=sc.next();
    if(playagain.equalsIgnoreCase("no"))
	{
		System.out.println("Thanks for playing! your total score is:"+totalscore);
		break;
	}
	else{
		round++;
	}
}while(true);
sc.close();
	}
	public static void main(String arg[])
	{
     guessingNumber();
	}
}



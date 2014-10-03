import java.util.Scanner;

public class BinarySearch
{
	public static void main(String args[])
	{
		System.out.println("Choose a range");
		Scanner s = new Scanner(System.in);
		int range = s.nextInt();

		System.out.println("Please choose a number between 0 and " + range);

		while(!s.nextLine().equals("go"))
		{
			System.out.println("Please enter 'go' to start");
		}
		long start = System.currentTimeMillis();
		int maxRange = range;
		int minRange = 0;
		int guess = 0;
		int attempt = 1;
		String answer;

		boolean correct = true;

		while(correct)
		{
			guess = ((maxRange - minRange)/2)+minRange;
			System.out.println("My guess is " + guess + ", is this correct or is number higher or lower");
			answer = s.nextLine();

			if(answer.equals("correct"))
			{
				correct = false;

			}
			else if(answer.equals("higher"))
			{
				minRange = guess;
				attempt++;
			}
			else if(answer.equals("lower"))
			{
				maxRange = guess;
				attempt++;
			}
			else
			{
				System.out.println("Please enter correct, higher or lower as a valid response");
			}

		}

		System.out.println("It took me " + attempt + " attempts to guess " + guess);
		long elapsed = System.currentTimeMillis() - start;
		System.out.println("Time = " + elapsed);

	}
}
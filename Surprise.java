import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Surprise {

	public static void main(String[] args) {
	
		new Surprise().start();
	}
	
	void start()
	{
		
		
		System.out.println("SURPRICE!! ");
		
		System.out.println(" MENU ");
		
		System.out.println("Q1. -> ");
		System.out.println("Q2. -> Fibonacci Primes");
		System.out.println("Q3. -> Anagram or Not");
		System.out.println("Q4. -> Pairs of Array by K");
		
		System.out.println("Enter your preference! ");
		Scanner sc = new Scanner(System.in);
		Scanner sString = new Scanner(System.in);
		
		int n = sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println(new FourPlay().startGame(1111, new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1))));
			break;
		case 2:
			System.out.println("Printing Fibonacci Prime Number: ");
			System.out.println( new FibonacciPrime().start().toString());
			break;
		case 3:
			System.out.println("Selected Anagram: ");
			System.out.print("Enter your First String! ");
			String v1 = sString.nextLine().trim();
			System.out.print("Enter your Second String! ");
			String v2 = sString.nextLine().trim();
			System.out.println(new Anagram().start(v1, v2));
			break;
		case 4:
			List<Integer> fOne = new ArrayList<Integer>();
				System.out.println("Please enter the number elements!");
				int z = sc.nextInt();
				System.out.println("Kindly input your values one by one");
				for(int q =0; q <= z; q++)
				{
					fOne.add(sc.nextInt());
				}
				System.out.println("Kindly input your K here");
				int k = sc.nextInt();
			System.out.println("The pairs are"+
					new ArrayPairs().start(fOne, k) );
			break;
		default:
			System.out.println("Please Try again! ");
		}
		
		
	}

}

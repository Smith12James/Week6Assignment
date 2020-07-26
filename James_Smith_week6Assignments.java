//James Smith

import java.util.Scanner;
import java.util.Random;

public class James_Smith_week6Assignments {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		String menu = "Please choose option 1, 2, or 3: ";
		
		System.out.print(menu);
		int choice = 0;
			
		choice = input.nextInt();
	
		if (choice == 1) {
			
			forLoop();
			
		} else if (choice == 2) {
			
			whileLoop();
			
		} else if (choice == 3) {
			
			doWhile();
			
		} else {
		
			System.out.print("Re-run the program and pick a number between 1 and 3! ");
		}
		
		input.close();
		System.out.println("Goodbye!");
	
	}
	
	private static void forLoop() {
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		String border = "---------------------------------------------------------";
		String intro = "Part 1: for loop: Average of randomly generated integers";
		String bottom = "Enter the bottom number of the range: ";
		String top = "Enter the top number of the range: ";
		String amount = "Enter how many numbers to generate: ";
		String randNum = "Generated Random Numbers: ";
		String ave = "Average of generated numbers: ";
		
		
		
		System.out.print(border + "\n" + intro + "\n" + border + "\n" + bottom);
		int bottomNum = input.nextInt();
		System.out.print(top);
		int topNum = input.nextInt();
		System.out.print(amount);
		int generate = input.nextInt();
		System.out.print(randNum);
		int sum = 0;
		
		
		int numList[] = new int[generate];
		
		
		for (int i = 0; i < generate; i++) {
			
			int randomNum = rand.nextInt(topNum - bottomNum + 1) + bottomNum;
			numList[i] = randomNum;
			System.out.print(randomNum + " ");
			
		}
		
		for( int num : numList) {
	          sum = sum+num;
	    }
		System.out.print("\n" + ave + (sum / generate) + "\n");
		input.close();
		
	}
	
	public static void whileLoop() {
		
		Scanner input = new Scanner(System.in);
		
		String intro = "Part 2: while loop: Average of user-entered integers using While loop";
		String border = "-------------------------------------------------------------------------";
		String exit = "Enter integers to average. Enter -1 to finish.";
		String enter = "Entry ";
		String enteries = "Number of entries: ";
		String end = "Average of user-entered numbers: ";
		int num = 0;
		int sum = 0;
		int i = 1;
		
		System.out.print(intro + "\n" + border + " \n" + exit + " \n");
		
		while (num != -1) {
			
			System.out.print(enter + i + ": ");
			num = input.nextInt();
			i++;
			sum = (num + sum);
		
		}
		input.close();
		
		System.out.println(enteries + (i - 2));
		// i - 2 to offset the final negative one and the last loop run.
		System.out.print(end);
		System.out.println((sum + 1) / (i - 2));
		// sum + 1 to offset the -1 to end the program
		System.out.println(border);
		
	}

	public static void doWhile() {
		
		Scanner input = new Scanner(System.in);
		
		String main = "Part 3: do-while loop: Display menuy until user chooses to exit";
		String mainBorder = "-------------------------------------------------------------------------";
		String border = "==============================\nMENU\n";
		String intro = "Enter 1, 2, 3, or 4 to Exit: ";
		int choice = 0;
		
		System.out.println(main);
		System.out.println(mainBorder);
		
		do {
			
			System.out.print(border + intro);
			choice = input.nextInt();
			
		} while (choice != 4);

		input.close();
	}

}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int compPoints = 0;
		int playerPoints = 0;
		
		Scanner scanner = new Scanner(System.in);
		String answer = "";
		
		do {
			compPoints = 0;
			playerPoints = 0;
			
			for (int i = 0; i < 5; i++) {
				
				int compThrow = (int)(Math.random() * 6) + 1;
				System.out.println("Press Enter to roll the dice...");
				scanner.nextLine(); // waiting for Enter
				int playerThrow = (int)(Math.random() * 6) + 1;
				System.out.println("===== Round " + (i + 1) + " =====");

				if (compThrow > playerThrow) {
					System.out.println("You: " + playerThrow + " | Computer: " + compThrow);
					compPoints++;
				} else if (playerThrow > compThrow) {
					System.out.println("You: " + playerThrow + " | Computer: " + compThrow);
					playerPoints++;
				} else {
					System.out.println("You: " + playerThrow + " | Computer: " + compThrow);
				}
				System.out.println();
			}
			
			if (compPoints > playerPoints) {
				System.out.println("The Computer wins.");
			} else if (playerPoints > compPoints ){
				System.out.println("You win.");
			} else {
				System.out.println("Draw.");
			}
			
			System.out.println("Final score after 5 rounds:");
			System.out.println("Player: " + playerPoints + " | Computer: " + compPoints);
			System.out.println();
			
			System.out.println("Do you want to play again? (Yes/No)");
			answer = scanner.nextLine().toLowerCase();
		} while (answer.equals("yes"));
		
		scanner.close();
	}

}

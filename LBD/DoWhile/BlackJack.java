import java.util.Random;
import java.util.Scanner;
public class BlackJack
{
	public static void main(String[] args)
	{
		Random rng = new Random();
		Scanner keyboard = new Scanner(System.in);
		String done = "no"; //variable to break the while loop
		while (done == "no")
		{
			int win = 0;
			while (win != 1)
			{
				System.out.println("How many players?");
				System.out.println("1. 1 Player");
				System.out.println("2. 2 Players");
				int numOfPlayers = keyboard.nextInt();
				if (numOfPlayers == 1)
				{
					//initial card draw and game setup
					int playerCard1 = 2 + rng.nextInt(10);
					int playerCard2 = 2 + rng.nextInt(10);
					int playerTotal = playerCard1 + playerCard2;
					System.out.println("you were dealt a " + playerCard1 + " and "
					+ playerCard2);

					//System.out.println(playerCard1 + " " + playerCard2); //test stub


					int dealerCard1 = 2 + rng.nextInt(10);
					int dealerCard2 = 2 + rng.nextInt(10);
					System.out.println("the dealer was dealt a " + dealerCard2 
					+ " and the other card is face down");
					int dealerTotal = dealerCard1 + dealerCard2;
					String playerTurn = "yes";
					while (playerTurn == "yes")
					{
						if (playerTotal > 21)
						{
							System.out.println("Dealer wins!");
							return; //game over
						}
						int playerHitStay = 0;
						System.out.println("What would you like to do?");
						System.out.println("1. Hit");
						System.out.println("2. Stay");
						playerHitStay = keyboard.nextInt();
						if (playerHitStay == 1)
						{
							int newCard = 2 + rng.nextInt(10);
							playerTotal = playerTotal + newCard;
							System.out.println("you were dealt " + newCard);
							System.out.println("your total is now: " + playerTotal);
						}
						else if (playerHitStay == 2)
						{
							playerTurn = "no";
						}
					}
/**********
Dealer Turn
**********/
					if (dealerTotal < playerTotal) //dealer needs to hit
					{
						System.out.println("The dealer's hidden card was a "+ dealerCard1);
						System.out.println("The dealer's total is " + dealerTotal);
						while (dealerTotal < playerTotal)
						{
							int newCard = 2 + rng.nextInt(10);
							System.out.println("The dealer was dealt a " + newCard);
							dealerTotal = dealerTotal + newCard; 
							System.out.println("The dealer's total is " + dealerTotal);

							if (dealerTotal > 21)
							{
								System.out.println("Dealer total is: " + dealerTotal);
								System.out.println("Player wins!");
								return; //game over
							}
							if (dealerTotal >= playerTotal)
							{
								System.out.println("Dealer total is: " + dealerTotal);
								System.out.println("Dealer wins!");
								return; //game over
							}

						}
					}
					else if (dealerTotal > playerTotal)
					{
						System.out.println("The dealer's hidden card was a "+ dealerCard1);
						System.out.println("The dealer's total is " + dealerTotal);
						System.out.println("Dealer wins!");
					}
					else if (dealerTotal == playerTotal)
					{
						System.out.println("The dealer's hidden card was a "+ dealerCard1);
						System.out.println("The dealer's total is " + dealerTotal);
						System.out.println("Push, Dealer wins!");
					}				
						
				}
				else if (numOfPlayers == 2)
				{
					//2 player mode here
				}

			}
		}
	}
}

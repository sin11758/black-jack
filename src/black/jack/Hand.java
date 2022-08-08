package black.jack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Navjot Singh
 * @author Gurminder Singh
 * @author Harman Sandhu
 */
public class Hand {
	private int sum;
	private List<Card> cardsInHand = new  ArrayList<Card>();

	/**
	 *
	 * @param card1
         * @param card2
	 */
	public Hand(Card card1,Card card2) {
		this.cardsInHand.add(card1);
		this.cardsInHand.add(card2);
	}


	public List<Card> getCardsInHand() {
		return this.cardsInHand;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getSum() {
		return sum;
	}

	/**
	 *
	 * @param card
	 */
	public void addCardsInHand(Card card) {
		this.cardsInHand.add(card);
	}

	public void sumOfCards() {
		sum = 0;
		int k = 0;
		for (int i = 0; i < cardsInHand.size(); i++) {
			if (cardsInHand.get(i).getIsFaceUp() == false) {
				System.out.print("One card is face down");
			}else if (cardsInHand.get(cardsInHand.size()-1).getIntNumber() == 11 && cardsInHand.size() >2) {
				while(k == 0){
					Scanner keyIn = new Scanner(System.in);
						System.out.print("Select Value of Ace from 1 and 11: ");
						String ace = keyIn.next();
						if (ace.equals("1") ||ace.equals("11")) {
							int ace2 = Integer.parseInt(ace);
							sum += ace2;
							k = 1;
						} else {
							System.out.println("Value of Ace is not valid");
							System.out.print("Select Value of Ace from 1 and 11: ");
						}

				}
			} else {
				sum += cardsInHand.get(i).getIntNumber();
			}
		}
		System.out.println(" " +getSum());
	}


	public void getCards() {
		for (int i = 0; i < cardsInHand.size(); i++) {
			System.out.print("\t\t");
			cardsInHand.get(i).showCard();
		}
	}
}
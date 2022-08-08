

package black.jack;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Navjot Singh
 * @author Gurminder Singh
 * @author Harman Sandhu
 */

public class BlackJack{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner keyIn = new Scanner(System.in);
            //number of player.
            int playerNo = totalPlayer(keyIn);

            // selecting dealer.
            int dealer = selectingDealer(playerNo);

            //array of players include bettors and dealer with the help of polymorphism.
            Player[] players = new Player[playerNo];

            int cardNumber = 0;
            //Creating a deck of 52 cards and suffling it.
            Deck deck = new Deck();
            deck.suffelDeck();

            // creating bettor and dealer objects.
            assignName(keyIn, playerNo, dealer, players, cardNumber, deck);

            // creating a table object.
            Table table = new Table(playerNo, players);

            // Check if bust
            isBust(players, table,dealer);

            //showing information of each player.
            table.showTable();

            //Entering bet and show information of each player.
            enterBet(keyIn, dealer, players, table);


            //Distributing two cards to eack player
            distribute(dealer, players, deck, cardNumber);
            cardNumber += 2*playerNo;
            // Check if bust
            isBust(players, table,dealer);



            //showing information of each player.
            table.showTable();
            int k = 0;
            while ( k<6) {
                // Check if bust
                isBust(players, table,dealer);

                //Moves
                enteringMove(keyIn, dealer, players,deck,cardNumber);
                cardNumber++;


                //showing information of each player.
                table.showTable();

                // Check if bust
                isBust(players, table,dealer);

                // wining points
                winning(dealer, players,k);



                //showing information of each player.
                table.showTable();
                k++;
            }

            Positions position = new Positions(table);
            position.ShowPositions();
    }


    /**
     * @param dealer
     * @param players
     * @param k
     */

    private static void winning(int dealer, Player[] players,int k) {
        for (int j = 0; j < players.length; j++) {
            if (players[j].getBust().getIsBust()) {
                if (players[j] != players[dealer]) {
                    players[j].getBet().setBet(0);
                } else {
                    for (int i = 0; i < players.length; i++) {
                        if (players[i].getBust().getIsBust() != true) {
                            players[i].getBet().setBet(0);
                            if(k==5)players[i].getPoints().addPoints(players.length);
                            players[dealer].getPoints().addPoints(-1);
                            players[dealer].getBust().setIsAllBust(true);
                        }
                    }
                }
            } else if (players[j].getHand().getSum() > players[dealer].getHand().getSum()) {
                if(k==5)players[j].getPoints().addPoints(2);
                if(k==5)players[dealer].getPoints().addPoints(-1);
                players[j].getBet().setBet(0);
                players[j].getBust().setIsWin(true);

            }else if (players[j].getHand().getSum() == players[dealer].getHand().getSum()) {
                if(k==5)players[j].getPoints().addPoints(1);
                players[j].getBust().setIsWin(true);

            }
        }
    }

/**
     * @param keyIn
     * @param playerNo
     * @param dealer
     * @param players
     * @param cardNumber
     * @param deck
     *
     */


    private static void assignName(Scanner keyIn, int playerNo, int dealer, Player[] players, int cardNumber,
            Deck deck) {
        //name of players
        for (int i = 0; i < players.length; i++) {
            if (i == dealer) {
                System.out.print("Enter the name of player "+ (i+1) +": ");
                players[i] = new Dealer(keyIn.next(),new Points(10*playerNo/2),new Status(players),players,deck,cardNumber);
                players[i].setMoves(new Moves(players, dealer,i));

            } else {
                System.out.print("Enter the name of player "+ (i+1) +": ");
                players[i] = new Bettor(keyIn.next(),new Points(10),new Status(players));
                players[i].setMoves(new Moves(players, dealer,i));
            }
        }
    }

        /**
        * @param keyIn
        * @param dealer
        * @param players
        * @param deck
        * @param cardNumber
        *
     */


    private static void enteringMove(Scanner keyIn, int dealer, Player[] players,Deck deck,int cardNumber) {

        if (players.length*2 == cardNumber) {
            players[dealer].getHand().getCardsInHand().get(1).flipCard();

        }
        for (int i = 0; i < players.length; i++) {
            players[dealer].setTurn(i);
            players[i].getMoves();
            if (players[i].getBust().getIsBust() != true &&players[i].getBust().getIsStay() != true&&players[i].getBust().getIsWin() != true) {
                Moves moves = players[i].getMoves();

                if (players[i]==players[dealer]) {
                    List<Card> card = players[dealer].getHand().getCardsInHand();
                    if (card.size() == 2) {
                        if (players[dealer].getHand().getSum() + card.get(card.size()-1).getIntNumber() < 17 ) {
                            moves.setMove(Move.HIT);
                            moves.play();

                        }

                    } else {
                        if (players[dealer].getHand().getSum()  < 17 ) {
                            moves.setMove(Move.HIT);
                            moves.play();

                        }

                    }
                }else{
                    moves.showMoves();
                    while (true) {
                        String move = keyIn.next();
                        checkMove(move);
                        if (move.toUpperCase().equals("HIT")) {
                            moves.setMove(Move.HIT);
                            moves.play();
                            break;
                        } else if (move.toUpperCase().equals("STAY")) {
                            moves.setMove(Move.STAY);
                            moves.play();
                            break;
                        } else if (move.toUpperCase().equals("SURRENDER")) {
                            moves.setMove(Move.SURRENDER);
                            moves.play();
                            break;
                        } else {
                            System.out.println("Wrong Input!");
                        }
                    }
                }


            }
        }
    }

        /**
	     * @param move
        */
    public static boolean checkMove(String move) {
        if (move.toUpperCase().equals("HIT") || move.toUpperCase().equals("STAY") ||move.toUpperCase().equals("SURRENDER")) {
            return true;
        } else {
            return false;
        }
}
    /**
     * @param players
     * @param table
     * @param dealer
     */

    private static void isBust(Player[] players, Table table,int dealer) {

        for (int index = 0; index < players.length; index++) {
            if(table.getPlayer()[index].getHand()!= null){
                int sum = table.getPlayer()[index].getHand().getSum();
                if (sum > 21) {
                    players[index].getBust().setIsBust(true);
                }
                if(players[dealer] == players[index] && sum >= 17){
                    players[index].getBust().setIsStay(true);
                }
            }
        }
    }

  /**
     * @param dealer
     * @param players
     * @param deck
     * @param cardNumber
     */
    private static void distribute(int dealer, Player[] players, Deck deck, int cardNumber) {
        for (int i = 0; i < players.length; i++) {
            players[i].setHand(new Hand(deck.getCards().get(cardNumber),deck.getCards().get(cardNumber +1)));

            if(i == dealer){
                deck.getCards().get(cardNumber +1).flipCard();
            }
            cardNumber += 2;
        }
    }

 /**
     * @param dealer
     * @param players
     * @param table
     * @param keyIn
     */
    private static void enterBet(Scanner keyIn, int dealer, Player[] players, Table table) {
        for (int i = 0; i < players.length; i++) {
            if (i != dealer) {
                while (true) {
                    System.out.print(players[i].getName()+" enter the amount of bet from your points("+players[i].getPoints().getPoints()+"): ");
                    int bet =keyIn.nextInt();

                    if (checkbet(bet,players[i].getPoints().getPoints())) {
                        players[i].setBet(new Bet(bet));
                        players[i].getPoints().setPoints(players[i].getPoints().getPoints() - players[i].getBet().getBet());;
                        break;

                    } else {
                        System.out.println("invalid input");
                    }

                }
            }
        }

    }
     /**
	     * @param bet
	     * @param points
     */
    public static boolean checkbet(int bet, int points) {
        if (bet <= points && bet > 0) {
            return true;
        } else {
            return false;
        }
}


    /**
        * @param playerNo
     */

    private static int selectingDealer(int playerNo) {
        //select dealer
        int dealer = (int)(Math.random()*playerNo);
        return dealer;
    }


 /**
     * @param keyIn
     */

    private static int totalPlayer(Scanner keyIn) {
        //number of players
        while (true) {
            System.out.print("Please enter the number of players from 2 to 8: ");
            int playerNo = keyIn.nextInt();

            if (checkPlayerNumber(playerNo)) {
                return playerNo;
            } else {
                System.out.println("invalid input");
            }

        }
    }
     /**
	     * @param playerNo
     */
    public static boolean checkPlayerNumber(int playerNo) {
            if (playerNo >1 &&playerNo<=8 ) {
                return true;
            } else {
                return false;
            }
    }

}

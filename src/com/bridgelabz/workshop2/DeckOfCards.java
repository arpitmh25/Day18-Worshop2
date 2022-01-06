public class DeckOfCards {
    public ArrayList<String> cardsDeck = new ArrayList<>();
    private int player;

    public void deckOfCards() {

        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace"};
        int numOfCards = suits.length * ranks.length;
        System.out.println("\nNumber of cards in the deck:" + numOfCards);
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                cardsDeck.add(ranks[i] + "->" + suits[j]);
            }
        }
        toDisplay(cardsDeck);
    }

    public static void toDisplay(ArrayList<String> cardsDeck) {
        for (String element : cardsDeck) {
            System.out.println(element);
        }
        System.out.println();
    }

    public void noOfPlayers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of players");
        int player = scanner.nextInt();
        if (player >= 2 && player <= 4) {
            System.out.println("\n"+player + "PlAYER WILL PLAY GAME");
        } else {
            System.out.println("Please enter number of players");
        }
    }

    public void sequenceOfPlay() {
        System.out.println("\nSequence of cards are below : ");
        for (int i = 1; i <= player; i++) {
            System.out.println("\nPlayer " + i + " Getting card");
        }
    }
}

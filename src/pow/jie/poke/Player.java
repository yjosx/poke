package pow.jie.poke;

import java.util.Scanner;

public class Player {
    private String name;
    private String hand[];

    Player(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void showHand() {
        for (int i = 0; i < hand.length; i++) {
            System.out.print(hand[i] + ";");
            if (i % 4 == 3) System.out.println();
        }
        System.out.println();
    }

    public void drawCards() {
        int cardNum;
        System.out.println("³éÅÆÊýÁ¿ÊÇ");
        Scanner in = new Scanner(System.in);
        cardNum = in.nextInt();
        hand = new String[cardNum];
        for (int i = 0; i < cardNum; i++) {
            hand[i] = (String) Poker.card[0];
            Poker.card=Poker.remove(Poker.card);
        }
    }

}
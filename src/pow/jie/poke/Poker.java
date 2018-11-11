package pow.jie.poke;

import java.util.Random;

public class Poker {
    private static String value[] = {" A", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", "10", " J", " Q", " K"};
    private static String suit[] = {"spades  ", "clubs   ", "hearts  ", "diamonds"};
    private static String joker[] = {"blackJoker", "redJoker  "};
    static String[] card = new String[54];

    public Poker() {//创建一副套牌
        int i = 0, j, k;
        for (j = 0; j < value.length; j++) {
            for (k = 0; k < suit.length; k++, i++)
                card[i] = suit[k] + value[j];
        }
        for (i = 0; i < joker.length; i++)
            card[card.length - 2 + i] = joker[i];
    }

    void shuffle() {
        Random random = new Random();
        for (int i = 0; i < card.length; i++) {
            int p = random.nextInt(i + 1);
            String tmp = card[i];
            card[i] = card[p];
            card[p] = tmp;
        }
    }

    void printDeck() {
        for (int j = 0; j < card.length; j++) {
            System.out.print(card[j] + ";");
            if (j % 4 == 3)
                System.out.println();
        }
        System.out.println();
    }

    //这个方法移除抽了的卡。
    public static String[] remove(String array[]) {
        String[] arrNew = new String[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            arrNew[i] = array[i + 1];
        }
        return arrNew;
    }

}
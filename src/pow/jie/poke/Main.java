package pow.jie.poke;

public class Main {
    public static void main(String[] args) {
        Poker a = new Poker();
        String name1 = "jinke_zhao";
        String name2 = "Nicholas_chang";
        Player player1 = new Player(name1);
        Player player2 = new Player(name2);
        System.out.println("Game,スタート");
        System.out.println(player1.getName()+"对阵"+player2.getName());
        System.out.println("有请发牌员展示这次使用的套牌");
        a.printDeck();
        a.shuffle();
        System.out.println("牌已经洗好了");
        a.printDeck();
        System.out.print(player1.getName());
        player1.drawCards();
        System.out.println(player1.getName()+"的手牌为");
        player1.showHand();
        System.out.print(player2.getName());
        player2.drawCards();
        System.out.println(player2.getName()+"的手牌为");
        player2.showHand();
        System.out.println("To be continued...");
    }
}
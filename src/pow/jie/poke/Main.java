package pow.jie.poke;

public class Main {
    public static void main(String[] args) {
        Poker a = new Poker();
        String name1 = "jinke_zhao";
        String name2 = "Nicholas_chang";
        Player player1 = new Player(name1);
        Player player2 = new Player(name2);
        System.out.println("Game,�����`��");
        System.out.println(player1.getName()+"����"+player2.getName());
        System.out.println("���뷢��Աչʾ���ʹ�õ�����");
        a.printDeck();
        a.shuffle();
        System.out.println("���Ѿ�ϴ����");
        a.printDeck();
        System.out.print(player1.getName());
        player1.drawCards();
        System.out.println(player1.getName()+"������Ϊ");
        player1.showHand();
        System.out.print(player2.getName());
        player2.drawCards();
        System.out.println(player2.getName()+"������Ϊ");
        player2.showHand();
        System.out.println("To be continued...");
    }
}
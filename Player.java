import java.util.ArrayList;

/**
 * プレイヤーはモンスターデッキを持つ
 *
 * Deck：MonsterのArrayList
 */
public class Player {
    ArrayList<Monster> deck = new ArrayList<>();

    /**
     * デッキに新しいモンスターを5体追加します。
     */
    public void drawMonsters() {
        System.out.println("--- モンスターを引いています ---");
        for (int i = 0; i < 5; i++) {
            this.deck.add(new Monster());
            System.out.println("モンスターを1体引きました！");
        }
        System.out.println("--- モンスターを引く処理が完了しました ---");
    }

    /**
     * 現在のデッキにあるモンスターをすべて表示します。
     */
    public void showDeck() {
        if (deck.isEmpty()) {
            System.out.println("デッキにはモンスターがいません。");
            return;
        }
        System.out.println("--- デッキのモンスター一覧 ---");
        for (Monster m : this.deck) {
            System.out.println(m); // MonsterクラスのtoString()メソッドが呼ばれることを想定
        }
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        System.out.println("ゲームを開始します！");

        // Playerクラスのインスタンス（プレイヤーオブジェクト）を作成
        Player myPlayer = new Player();

        // プレイヤーにモンスターを引かせる
        myPlayer.drawMonsters();

        // デッキの中身を表示する
        myPlayer.showDeck();

        System.out.println("ゲームが終了しました！");

        // 追加でモンスターを引いてみる（オプション）
        System.out.println("\n--- 追加でモンスターを引いてみます ---");
        myPlayer.drawMonsters();
        myPlayer.showDeck();
    }
}

// 注意：このコードを実行するには、Monsterクラスが別途定義されている必要があります。
// 例:
// class Monster {
//     private String name;
//     public Monster() {
//         this.name = "Generic Monster"; // 簡単な初期化
//     }
//     @Override
//     public String toString() {
//         return "Monster: " + name;
//     }
// }
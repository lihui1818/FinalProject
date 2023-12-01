package src;
import java.util.Random;

// 魔王クラス
class DemonLord extends Character {
    // コンストラクタ
    public DemonLord(String name) {
        super(name, 100);
    }

    // 魔王専用の攻撃メソッド
    public int demonLordAttack() {
        Random rand = new Random();
        int damage = rand.nextInt(this.getHP() * 5) + 1;  // 1 から 最大攻撃力 * 5 までのダメージ
        System.out.println(getName() + "の攻撃！ " + damage + " のダメージを与えた！");
        return damage;
    }

    // 逃げるメソッド
    public void runAway() {
        System.out.println(getName() + "は逃げ出した！");
        // 逃げる処理を実装
    }
}

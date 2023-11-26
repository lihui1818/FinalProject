package src;
import java.util.Random;
import java.util.Scanner;

public class RPGGame {
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 勇者の誕生
    System.out.println("新しい冒険が始まる！勇者の名前を入力してください：");
    String heroName = scanner.nextLine();
    Hero hero = new Hero(heroName,100);

    // 王様との会話
    King king = new King("王様",100);
    king.assignMission();
    hero.talk("了解しました！冒険の旅に出発します。");

    // 冒険の途中...
    // スライム、ゴブリン、狼男のいずれかの敵に出会う
    Character enemy = getRandomEnemy();
    System.out.println("敵が現れた！");

    // バトル開始
    while (hero.isAlive() && enemy.isAlive()) {
        // プレーヤーが行動を選ぶ
        System.out.println("何をしますか？（1: 戦う, 2: 逃げる, 3: 休む）");
        int choice = scanner.nextInt();

        if (choice == 1) {
            // 勇者が戦う
            hero.attack(enemy);
        } else if (choice == 2) {
            // 逃げる
            hero.runAway();
            break;
        } else if (choice == 3) {
            // 休む
            hero.rest();
        } else {
            System.out.println("無効な選択です。もう一度選んでください。");
        }

        // 敵の行動（仮）
        if (enemy instanceof Slime) {
            ((Slime) enemy).attack(hero);
        } else if (enemy instanceof Goblin) {
            ((Goblin) enemy).attack(hero);
        } else if (enemy instanceof Werewolf) {
            ((Werewolf) enemy).attack(hero);
        }
    }

    // バトル終了後の処理
    if (hero.isAlive()&&!enemy.isAlive()) {
        System.out.println("勇者は敵を倒して勝利しました！");
    } else {
        System.out.println("勇者は敵に敗れました。ゲームオーバー！");
    }

    // 魔法使いに出会う
    Mage mage = new Mage("魔法使い");
    mage.talk("勇者よ、私と一緒に旅をしよう。");
    if (mage.inviteToParty()) {
        hero.talk("了解しました！一緒に冒険しましょう。");
    } else {
        hero.talk("申し訳ありませんが、今は一人での冒険を選びます。");
    }

    // スーパー勇者になる
    if (hero.isAlive()) {
        System.out.println("スライム、ゴブリン、狼男を全て倒し、魔法使いと仲間になりました！");
        SuperHero superHero = new SuperHero(heroName + "（スーパー勇者）",100);

        // スーパー勇者の冒険
        // スライム、ゴブリン、狼男、魔王のいずれかの敵に出会う
        enemy = getRandomEnemy();
        System.out.println("新たな敵が現れた！");

        // スーパー勇者のバトル開始
        while (superHero.isAlive() && enemy.isAlive()) {
            // プレーヤーが行動を選ぶ
            System.out.println("何をしますか？（1: 戦う, 2: 逃げる, 3: 休む, 4: 空を飛ぶ）");
            int choice = scanner.nextInt();

            if (choice == 1) {
                // スーパー勇者が戦う
                superHero.attack(enemy);
            } else if (choice == 2) {
                // 逃げる
                superHero.runAway();
                break;
            } else if (choice == 3) {
                // 休む
                superHero.rest();
            } else if (choice == 4) {
                // 空を飛ぶ
                ((SuperHero) superHero).fly();
            } else {
                System.out.println("無効な選択です。もう一度選んでください。");
            }

            // 敵の行動（仮）
            if (enemy instanceof Slime) {
                ((Slime) enemy).attack(superHero);
            } else if (enemy instanceof Goblin) {
                ((Goblin) enemy).attack(superHero);
            } else if (enemy instanceof Werewolf) {
                ((Werewolf) enemy).attack(superHero);
            }
        }

        // バトル終了後の処理
        if (superHero.isAlive()) {
            System.out.println("スーパー勇者は敵を倒して勝利しました！");
        } else {
            System.out.println("スーパー勇者は敵に敗れました。ゲームオーバー！");
        }
    }

    // お姫様登場
    Princess princess = new Princess("お姫様",100);
    princess.talk("勇者よ、あなたの冒険を見守っていました。お礼を言いに来ました。");
    princess.cheer();
    scanner.close();
    // 冒険終了
    System.out.println("冒険が終了しました!");
}

// ランダムに敵を生成するメソッド
private static Character getRandomEnemy() {
    Random random = new Random();
    int enemyType = random.nextInt(3); // 0, 1, 2のいずれか

    switch (enemyType) {
        case 0:
            return new Slime("スライム");
        case 1:
            return new Goblin("ゴブリン");
        case 2:
            return new Werewolf("狼男");
        default:
            return new Slime("スライム");
    }
}
}
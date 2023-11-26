package src;

import java.util.Random;

class Hero extends Character {
    private int experience;
    private int maxExperience;

    public Hero(String name, int hp) {
        super(name, hp);
        this.experience = 0;
        this.maxExperience = 100;
    }

    public int getExperience() {
        return experience;
    }

    public void increaseExperience(int amount) {
        experience += amount;
    }

    public void rest() {
        // 休息ロジック、HPを回復
        int healAmount = new Random().nextInt(10) + 1;
        setHP(getHP() + healAmount);
        System.out.println(getName() + "は休憩して " + healAmount + " HP回復した。 残りHP: " + getHP());
    }
    
    public void runAway() {
        System.out.println(getName() + " は逃げ出した！");
    }

    public void levelUp() {
        System.out.println(getName() + " はレベルアップした！");
        // ここで、必要に応じてアップグレード処理ロジックを追加できます
        maxExperience += 50; // アップグレードごとに経験値の上限が 50 ずつ増加します
        this.setHP(100);// アップグレード後に完全な健康状態が回復しました
    }
}
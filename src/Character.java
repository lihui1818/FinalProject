package src;

import java.util.Random;

class Character {
    private String name;
    private int hp;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return hp;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void talk(String message) {
        System.out.println(name + ": " + message);
    }

    public void attack(Character enemy) {
        // 単純な攻撃ロジック、ランダムにダメージを与える
        int damage = new Random().nextInt(10) + 1;
        System.out.println(name + "の攻撃！ " + enemy.getName() + "に " + damage + " ダメージ！");
        enemy.takeDamage(damage);
    }

    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) {
            hp = 0;
        }
        System.out.println(name + "は " + damage + " ダメージ受けた。 残りHP: " + hp);
    }
}
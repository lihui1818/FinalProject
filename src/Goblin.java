package src;

import java.util.Random;

class Goblin extends Character {
    public Goblin(String name) {
        super(name, 40);
    }

    public void attack(Hero hero) {
        Random random = new Random();
        int damage = random.nextInt(15) + 5; // 5から20のダメージをランダムに決定
        hero.takeDamage(damage);
    }
}
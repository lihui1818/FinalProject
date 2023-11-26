package src;

import java.util.Random;

class Slime extends Character {
    public Slime(String name) {
        super(name, 30);
    }

    public void attack(Hero hero) {
        Random random = new Random();
        int damage = random.nextInt(10) + 1; // 1から10のダメージをランダムに決定
        hero.takeDamage(damage);
    }
}
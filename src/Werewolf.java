package src;

import java.util.Random;

class Werewolf extends Character {
    public Werewolf(String name) {
        super(name, 60);
    }

    public void attack(Hero hero) {
        Random random = new Random();
        int damage = random.nextInt(20) + 10; // 10から30のダメージをランダムに決定
        hero.takeDamage(damage);
    }
}
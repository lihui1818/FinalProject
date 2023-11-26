package src;

import java.util.Random;

// 魔法使いクラス
class Mage extends Character {
	public Mage(String name) {
	    super(name, 50);
	}
	
	public void castSpell(Character enemy) {
	    Random random = new Random();
	    int damage = random.nextInt(30) + 10; // 10から40のダメージをランダムに決定
	    enemy.takeDamage(damage);
	}
	
	public boolean inviteToParty() {
	    Random random = new Random();
	    return random.nextBoolean();
	}
}
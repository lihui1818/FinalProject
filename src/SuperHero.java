package src;

//スーパー勇者クラス
class SuperHero extends Hero {
	private int flyingTurns; // 空を飛ぶ継続ターン数

	public SuperHero(String name, int maxHP) {
		super(name, maxHP);
	}

	public int getFlyingTurns() {
		return flyingTurns;
	}

	public void setFlyingTurns(int flyingTurns) {
		this.flyingTurns = flyingTurns;
	}

	// 空を飛ぶメソッド
	public void fly() {
		if (flyingTurns > 0) {
			System.out.println(getName() + "は空を飛んでいます。");
			flyingTurns--;
		} else {
			System.out.println(getName() + "はもう地上にいます。");
		}
	}

	// 着陸するメソッド
	public void land() {
		System.out.println(getName() + "は着陸しました。");
		flyingTurns = 0; // 着陸したら飛ぶ継続ターン数をリセット
	}
}
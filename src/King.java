package src;

class King extends Character {
    public King(String name, int hp) {
        super(name, hp);
    }

    public void giveMission() {
        System.out.println("国王：“勇者よ、お前の使命は魔王を倒し、姫を救うことだ！”");
    }
    public void assignMission() {
        talk("勇者よ、お前に使命を授けよう。魔王を倒し、お姫様を助け出せ！");
    }
}
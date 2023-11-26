package src;

class Princess extends Character {
    public Princess(String name, int hp) {
        super(name, hp);
    }

    public void cheer() {
    	talk("勇者、がんばって！私の祈りがあなたと共にあります。");
    }
}
class Zergling {
    public int hp;
    public int mana;

    public Zergling() {
        this.hp = 80;
        this.mana = 200;
    }

    public void attack() {
        hp += 1;
        mana -= 10;
    }

    public void move() {
        hp -= 10;
        mana += 5;
    }

    public void status() {
        System.out.println(hp + " " + mana);
    }
}

class Main {
    public static void main(String[] args) {
        Zergling z1 = new Zergling();
        Zergling z2 = new Zergling();

        z1.hp = 10;
        z2.mana = 20;

        z1.attack();
        z2.attack();
    }
}
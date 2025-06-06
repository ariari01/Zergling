public class Zergling {
    int hp = 80;
    int mana = 200;

    void attack() {
        hp += 1;
        mana -= 10;
    }

    void move() {
        hp -= 10;
        mana += 5;
    }

    void status() {
        System.out.println("현재 HP는 " + hp + " MANA는 " + mana + " 입니다.");
    }
}

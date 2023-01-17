public class Monk extends Hero{
    int magic;

    public Monk(String name, int attack, int protection, int[] damage, int health, int speed, int magic) {
        super(name, attack, protection, damage, health, speed);
        this.magic = magic;
    }

    public Monk(String name){
        super(name,12,7,new int[] {-4,-4},30,5);
        this.magic = 1;
    }
    @Override
    public String toString() {
        return super.toString() + ".  Magic: " + magic;
    }
}

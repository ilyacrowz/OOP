package Task004.Weapons;

import java.util.Random;

// меч
public class Sword extends Weapon {

    public Sword(int pointOfDamage) {
        super(pointOfDamage);
    }

    @Override
    public String toString() {
        return String.format("Sword damage  = %d", pointOfDamage);
    }

    @Override
    public int damage() {
        return new Random().nextInt(0, pointOfDamage);
    }

}
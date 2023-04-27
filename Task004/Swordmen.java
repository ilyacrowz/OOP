package Task004;

import Task004.Shield.SmallShield;
import Task004.Weapons.Sword;

// меченосец
public class Swordmen extends Warrior {

    public Swordmen(String name, int healthPoint, Sword sword, SmallShield smallShield ) {
        super(name, healthPoint, sword, smallShield);
    }

    @Override
    public String toString() {
        return "Swordmen" + super.toString();
    }
    
    public int shotArmor(){
        return ((SmallShield)getDefend()).getArmor();
    }
 
}
public class DeathTouch extends Creature {

    public DeathTouch(String name, float health) {
        super(name, health);
    }

    @Override
    public float attack() {
        // 20% chance of missing
        if (Rand.randomInt(0, 10) < 2) {
            setAction(getName() + " missed!");
            return 0;
        }

        // 10% chance of using DeathTouch ability (does a lot of damage)
        if (Rand.randomInt(0, 10) < 1) {
            float power = Rand.randomFloat(20, 60);
            setAction(getName() + " attacked with DeathTouch power " + power + "!");
            return power;
        }

        // otherwise, do damage between 10-20
        float power = Rand.randomFloat(10, 20);
        setAction(getName() + " attacked with power " + power + "!");
        return power;

    }
}

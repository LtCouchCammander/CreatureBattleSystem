public class DeathTouch extends Creature {

    @Override
    public float attack() {
        // 20% chance of missing
        if (Rand.randomInt(0, 10) < 2) {
            action = name + " missed!";
            return 0;
        }

        // 10% chance of using DeathTouch ability (does a lot of damage)
        if (Rand.randomInt(0, 10) < 1) {
            float power = Rand.randomFloat(20, 60);
            action = name + " attacked with DeathTouch power " + power + "!";
            return power;
        }

        // otherwise, do damage between 10-20
        float power = Rand.randomFloat(10, 20);
        action = name + " attacked with power " + power + "!";
        return power;

    }
}

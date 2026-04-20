public class HexProof extends Creature {

    // HexProof has upgraded creature abilities

    // Returns the damage done by the Creature
    @Override
    public float attack() {

        // 10% chance of missing
        if (Rand.randomInt(0, 10) < 1) {
            action = name + " missed!";
            return 0;
        }

        // otherwise, do damage between 15-40
        float power = Rand.randomFloat(15, 40);
        action = name + " attacked with power " + power + "!";
        return power;
    }

    @Override
    public void defend(float incomingPower) {

        // 40 % chance of reducing damage taken
        if (Rand.randomInt(0, 10) < 4) {
            incomingPower = incomingPower * 0.8f;
            action = name + " defended and reduced damage taken to " + incomingPower;
        }
        else
        {
            action = name + " did not defend.";
        }

        health -= incomingPower;
    }
}

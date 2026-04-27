public class HexProof extends Creature {

    public HexProof(String name, float health) {
        super(name, health);
    }

    // HexProof has upgraded creature abilities

    // Returns the damage done by the Creature
    @Override
    public float attack() {

        // 10% chance of missing
        if (Rand.randomInt(0, 10) < 1) {
            setAction(getName() + " missed!");
            return 0;
        }

        // otherwise, do damage between 15-40
        float power = Rand.randomFloat(15, 40);
        setAction(getName() + " attacked with power " + power + "!");
        return power;
    }

    @Override
    public void defend(float incomingPower) {

        // 40 % chance of reducing damage taken
        if (Rand.randomInt(0, 10) < 4) {
            incomingPower = incomingPower * 0.8f;
            setAction(getName() + " defended and reduced damage taken to " + incomingPower);
        }
        else
        {
            setAction(getName() + " did not defend.");
        }

        setHealth(getHealth() - incomingPower);
    }
}

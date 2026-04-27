public class Planeswalker extends Creature {

    public Planeswalker(String name, float health) {
        super(name, health);
    }

    @Override
    public void defend(float incomingPower) {

        // 10 % chance of reducing damage taken
        if (Rand.randomInt(0, 10) < 1) {
            incomingPower = incomingPower * 0.8f;
            setAction(getName() + " defended and reduced damage taken to " + incomingPower);
        }
        // 20% chance of healing instead of taking damage
        else if (Rand.randomInt(0, 10) < 2) {
            setHealth(getHealth() + incomingPower);
            setAction(getName() + " used PlaninsWalker ability and use attack damage " + incomingPower + " to heal itself instead.");
        }
        else {
            setAction( getName() + " did not defend.");
        }

        setHealth(getHealth() - incomingPower);
    }
}

public class Main {
    public static void main(String[] args) {

        // set up the creatures
        DeathTouch a = new DeathTouch();
        Planeswalker b = new Planeswalker();
        HexProof c = new HexProof();

        // set up the battle
        BattleSystem battleSystem = new BattleSystem();

        // Randomly pick players and run battle
        switch (Rand.randomInt(1, 3)) {
            case 1:
                a.name = Input.getUserString("Enter creature or player name to battle: ");
                a.health = 100;
                b.name = Input.getUserString("Enter creature or player name to battle: ");
                b.health = 100;
                battleSystem.battle(a, b);
                break;
            case 2:
                a.name = Input.getUserString("Enter creature or player name to battle: ");
                a.health = 100;
                c.name = Input.getUserString("Enter creature or player name to battle: ");
                c.health = 100;
                battleSystem.battle(a, c);
                break;
            case 3:
                b.name = Input.getUserString("Enter creature or player name to battle: ");
                b.health = 100;
                c.name = Input.getUserString("Enter creature or player name to battle: ");
                c.health = 100;
                battleSystem.battle(b, c);
                break;
        }
    }
}

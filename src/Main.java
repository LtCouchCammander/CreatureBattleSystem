public class Main {
    public static void main(String[] args) {

        // set up the creatures
        DeathTouch a;
        Planeswalker b;
        HexProof c;

        // set up the battle
        BattleSystem battleSystem = new BattleSystem();

        // Randomly pick players and run battle
        switch (Rand.randomInt(1, 3)) {
            case 1:
                a = new DeathTouch(Input.getUserString("Enter creature or player name to battle: "), 100);
                b = new Planeswalker(Input.getUserString("Enter creature or player name to battle: "), 100);
                battleSystem.battle(a, b);
                break;
            case 2:
                a = new DeathTouch(Input.getUserString("Enter creature or player name to battle: "), 100);
                c = new HexProof(Input.getUserString("Enter creature or player name to battle: "), 100);
                battleSystem.battle(a, c);
                break;
            case 3:
                b = new Planeswalker(Input.getUserString("Enter creature or player name to battle: "), 100);
                c = new HexProof(Input.getUserString("Enter creature or player name to battle: "), 100);
                battleSystem.battle(b, c);
                break;
        }
    }
}

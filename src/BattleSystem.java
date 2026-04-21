public class BattleSystem {
    public void battle(Creature a, Creature b) {
        while (a.health > 0 && b.health > 0) {
            float attackPower = a.attack();
            b.defend(attackPower);
            System.out.println(a.readAction());
            System.out.println(b.readAction());

            System.out.println(a);
            System.out.println(b);
            System.out.println();

            // swap turns
            Creature temp = a;
            a = b;
            b = temp;
        }

        if (a.health > 0) {
            System.out.println("Congratulations " + a.name + ", You Won!!!");
        }
        else {
            System.out.println("Congratulations " + b.name + ", You Won!!!");
        }
    }
}

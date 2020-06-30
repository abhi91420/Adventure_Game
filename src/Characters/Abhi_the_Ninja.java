package Characters;

public class Abhi_the_Ninja implements Character {
    private int health = 100;
    private int attack = 19;
    private int heal = 20;

    @Override
    public int health() {
        return health;
    }

    @Override
    public void duck() {
        System.out.println("Ducked Fucked");
    }

    @Override
    public void jump() {
        System.out.println("Jumping aagu 1 sec");
    }

    @Override
    public int attack() {
        return attack;
    }

    @Override
    public void power() {
        System.out.println("ABBAHH Meripichesav nu!");
    }

    @Override
    public int heal() {
        return heal;
    }
    public void info() {
        System.out.println("HERE ARE YOUR STATS");
        System.out.println("-------------------------");
        System.out.println("Health : "+ health);
        System.out.println("Attack : "+ attack);
        System.out.println("heal   : "+ heal);
    }
}

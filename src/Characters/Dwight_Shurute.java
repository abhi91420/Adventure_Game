package Characters;

public class Dwight_Shurute implements Character {
    private int health = 100;
    private int attack = 15;
    private int heal = 40;

    @Override
    public int health() {
        return health;
    }

    @Override
    public void duck() {
        System.out.println("Jim let me duck");
    }

    @Override
    public void jump() {
        System.out.println("Michel jim pulled my pants when i jumped");
    }

    @Override
    public int attack() {
        return  attack;
    }

    @Override
    public void power() {
        System.out.println("Calls Angela your screwed now");
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

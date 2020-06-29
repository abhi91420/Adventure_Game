public class Margarita_Pizza implements Character {
    private int health = 120;
    private int attack = 16;
    private int heal = 20;

    @Override
    public int health() {
        return health;
    }

    @Override
    public void duck() {
        System.out.println("pizza ducked pineapple mukka bokka");
    }

    @Override
    public void jump() {
        System.out.println("Pizza jumped burned 5 calores!");
    }

    @Override
    public int attack() {
        return attack;
    }

    @Override
    public void power() {
        System.out.println("Pizza is now Cheese burst");
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

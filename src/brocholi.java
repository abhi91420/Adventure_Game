public class brocholi implements Enemies{
    private int attack = 10;
    private int health = 30;

    @Override
    public int health() {
        return health;
    }

    @Override
    public int attack() {
        return attack;
    }

    public void name(){
        System.out.print("Bitch Brocholi");
    }
    @Override
    public void display() {
        System.out.println("A female bitch Brocoli just appeared ewww!");
    }
}

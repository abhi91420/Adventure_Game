package Enemy;

public class tofu implements Enemies{
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
        System.out.print("UGly Enemy.tofu");
    }
    public void display(){
        System.out.println("THE Enemy.tofu was so UGLY Abhi was jealous");
    }
}

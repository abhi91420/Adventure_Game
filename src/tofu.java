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
        System.out.print("UGly tofu");
    }
    public void display(){
        System.out.println("THE tofu was so UGLY Abhi was jealous");
    }
}

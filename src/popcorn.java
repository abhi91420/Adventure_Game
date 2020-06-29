public class popcorn implements Enemies{
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
        System.out.print("Burnt caramel?");
    }
    @Override
    public void display() {
        System.out.println("A burnt Caramel has appeared ITS like BURNT BURNT");
    }
}

public class parrot implements Enemies{
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
        System.out.print("Chilipi chilaka");
    }
    @Override
    public void display() {
        System.out.println("EYYYY!!! Donga chi po babu");
    }
}

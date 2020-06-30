package Characters;

import java.util.Scanner;

public class Mini_mini implements Character {
    private int health = 1000;
    private int attack = 100;
    private int heal = 100;

    @Override
    public int health() {
        return health;
    }

    @Override
    public void duck() {
        System.out.println("You are a Duck rey XD");
    }

    @Override
    public void jump() {
        System.out.println("YOU are the Jumped");
    }

    @Override
    public int attack() {
        return attack;
    }

    @Override
    public void power() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your power");
        System.out.println("1.invisible");
        System.out.println("2.Brute Strength");
        int i = sc.nextInt();
        if (i == 1) {
            System.out.println("Ayya EDIKI poyinav!!!");
        } else if (i == 2) {
            System.out.println("BIG GUNS ARE OUT !!!!! RUN !!");
        } else {
            System.out.println("Kantichupu tho champesta");
        }

    }

    @Override
    public int heal() {
        return heal;
    }

    @Override
    public void info() {
        System.out.println("HERE ARE YOUR STATS");
        System.out.println("-------------------------");
        System.out.println("Health : "+ health);
        System.out.println("Attack : "+ attack);
        System.out.println("heal   : "+ heal);
    }
}

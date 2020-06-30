import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Character c;
        int kill_count = 0;
        //welcome screen
        displayScreens ds = new displayScreens();
        try {
            ds.welcome_Screen();
        }catch (Exception e){
            System.out.println("...Loading");
        }//choose character
        try {
            System.out.println("Choose Your Gundu");
            System.out.println("-------------------------------------------");
            Thread.sleep(1000);
            System.out.println("1.Mini Mini");
            Thread.sleep(1000);
            System.out.println("2.Abhi the Ninja");
            Thread.sleep(1000);
            System.out.println("3.Dwight Assistance to the regional Manager");
            Thread.sleep(1000);
            System.out.println("4.Pizza tho kottichkuntava");
            System.out.println("-------------------------------------------");
            Thread.sleep(1000);
            System.out.println("Enter your choice : ");
            int choice = inp.nextInt();
            System.out.println("============================================");
            switch (choice) {
                case 1 -> {
                    System.out.println("You Won the game duh!? you chose : PAPAYI");
                    c = new Mini_mini();
                }
                case 2 -> {
                    System.out.println("Really ? : ABHI?");
                    System.out.println("Are you sure?");
                    inp.next();
                    System.out.println("NE istam");
                    c = new Abhi_the_Ninja();
                }
                case 3 -> {
                    System.out.println("Michellll!!!!! Im Here!");
                    c = new Dwight_Shurute();
                }
                case 4 -> {
                    System.out.println("Dominos Your Pizza is here to kill!!!");
                    c = new Margarita_Pizza();
                }
                default -> c = new Mini_mini();
            }
            System.out.println("============================================");

            //character info
            Thread.sleep(3000);
            c.info();
            System.out.println("--------------------------------------------");
            int char_health = c.health();
            int char_attack = c.attack();
            int char_heal = c.heal();

            //enemies list
            List<Enemies> elist = new ArrayList<>();
            elist.add(new popcorn());
            elist.add(new tofu());
            elist.add(new parrot());
            elist.add(new brocholi());

            //enter dungeon
            boolean exit = false;
            int rand;
            Thread.sleep(3000);
            System.out.println("^^^^^^^^^^^^^^^Enemies are Entering ^^^^^^^^^^^^^^^^^^");
            Thread.sleep(3000);
            while (!exit) {
                rand = (int) (Math.random() * elist.size());
                var a = elist.get(rand);
                System.out.println("-------------------------------------------");
                System.out.print("ENEMY :");
                a.name();
                System.out.println(" has appeared");
                System.out.println("-------------------------------------------");
                Thread.sleep(500);
                a.display();
                Thread.sleep(1000);
                System.out.println("-------------------------------------------");
                int enemy_attack = a.attack();
                int enemy_health = a.health();
                Thread.sleep(1000);
                //player makes a choice
                char_health =choice(char_health, char_attack, char_heal, enemy_attack, enemy_health, c);
                //exit game
                exit = char_health == 0;

            }
            Thread.sleep(2000);
            //print score
            System.out.println("You killed :" + kill_count + " Enemies");
            //thank you message
            Thread.sleep(2000);
            ds.exit_screen();
            Thread.sleep(5000);
            }catch (Exception e){
            System.out.println("..loading");
        }

    }
    public static int choice(int ch, int ca, int ce, int ea, int eh, Character c){            // check enemy health

        // check player health is 0
        try {
            while (eh != 0 && ch != 0) {

                Thread.sleep(2000);
                System.out.println("==========================================");
                System.out.println("WHAT rey what do you want to do?");
                System.out.println("1.Attack");
                System.out.println("2.Heal");
                System.out.println("3.Power");
                System.out.println("4.Jump");
                System.out.println("5.Duck");
                System.out.println("6.run");
                System.out.println("-----------------------------------------");
                System.out.println("Ikkada nokkandi  : ");

                Scanner sc = new Scanner(System.in);
                var choice = sc.nextInt();
                System.out.println("++++++++++++++++++++++++++++++++++++++++++");
                switch (choice) {
                    case 1 -> {
                        eh -= ca;
                        ch -= ea;
                        if (eh < 0) {
                            eh = 0;
                        }
                        if (ch < 0) {
                            ch = 0;
                        }
                        Thread.sleep(1000);
                        System.out.println("You Attacked !\nCurrent status:");
                        Thread.sleep(1000);
                        System.out.println("Enemy health : " + eh);
                        System.out.println("Your health : " + ch);
                    }
                    case 2 -> {
                        System.out.println("enemy attacked but you healed too");
                        ch -= ea;
                        ch += ce;
                        System.out.println("Your health now : " + ch);
                    }
                    case 3 -> {
                        c.power();
                        eh = 0;
                    }
                    case 4 -> c.jump();
                    case 5 -> c.duck();
                    case 6 -> System.out.println("Ekka dikki cha ra itu XD");
                    default -> System.out.println("OKAY");
                }
                System.out.println("++++++++++++++++++++++++++++++++++++++++++");
            }
            Thread.sleep(1000);
            System.out.println("ENEMY SUCKED ASS!! it died");
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println("......loading");
        }
        return ch;
    }}

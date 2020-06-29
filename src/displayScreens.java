public class displayScreens {
    public void welcome_Screen() throws InterruptedException {
        System.out.println("        .........");
        System.out.println("      .............");
        System.out.println("      ... ..... ...");
        System.out.println(" X    ... X ... X...     X");
        System.out.println("   X   .............   X");
        System.out.println("     X  ..  ..  ..  X ");
        System.out.println("       X..  ..  ..X");
        System.out.println("          X  X");
        System.out.println("        X       X");
        Thread.sleep(5000);
        drawLine();
        System.out.println("                       Melcow To AssLicker");
        drawLine();
        Thread.sleep(5000);
        System.out.println("NOTE - typo *k " );
        System.out.println("-------------------------------------------");
        Thread.sleep(5000);
        drawLine();
        drawLine();
        System.out.println("GAME STARTED");
        drawLine();
        drawLine();
        Thread.sleep(5000);
    }
    public void exit_screen(){
        drawLine();
        System.out.println("YOU SUCK! GAME OVER unless you are a unicorn or a werewolf pls dont kill me");
        drawLine();
    }
    public static void drawLine(){
        System.out.println("===============================================================================");

    }

}

package game;

public class PlayNinjaVsAliens {
    public static void main(String[] args) {

       NVA nva = new NVA();
       Scanner scanner = new Scanner(System.in);

       System.out.println("Lets play a game.");
       System.out.println("What is your name?");
       String name = scanner.nextLine();
       System.out.println("Welcome, "+name);

       System.out.println("Are you a Ninja or Alien? [ninja/alien]");
       String playerType = scanner.nextLine();

       System.out.println("Okay ninja, choose your weapon [blade/star]");
       System.out.println("Okay alien, choose your weapon [claw/laser]");
       String weapon = scanner.nextLine();

       System.out.println("Choose your location? [forest/space]");
       String location = scanner.nextLine();

       System.out.println("Choose your special attack? [speed/power/pain]");
       String special = scanner.nextLine();
    }
}

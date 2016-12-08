package game;

public class PlayNinjaVsAliens {
    public static void main(String[] args) {

       NVA nva = new NVA();
        Scanner scanner = new Scanner(System.in);

        NVA nva = new NVA();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lets play a game.");
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Welcome, " + name);

        String playerType = "";
        while (!(playerType.equalsIgnoreCase("ninja") || playerType.equalsIgnoreCase("alien"))) {
            System.out.println("Are you a Ninja or Alien? [ninja/alien]");

            playerType = scanner.nextLine();

            if (playerType.equalsIgnoreCase("ninja")) {
                System.out.println("Noble choice, the Ninja is stealthy and fast.");

            } else if (playerType.equalsIgnoreCase("alien")) {
                System.out.println("Powerful choice, the Alien is scary and strong.");

            } else {
                System.out.println("Invalid player type.");
            }
        }
        String weapon = "";
        while (!((playerType.equalsIgnoreCase("ninja") && ((weapon.equalsIgnoreCase("blade")) || (weapon.equalsIgnoreCase("star")))) ||
                ((playerType.equalsIgnoreCase("alien") && ((weapon.equalsIgnoreCase("claw")) || (weapon.equalsIgnoreCase("laser"))))))) {
            if (playerType.equalsIgnoreCase("ninja")) {
                System.out.println("Okay ninja, choose your weapon [blade/star]");
            } else {
                System.out.println("Okay alien, choose your weapon [claw/laser]");
            }
            weapon = scanner.nextLine();

            if (playerType.equalsIgnoreCase("ninja") && weapon.equalsIgnoreCase("blade")) {
                System.out.println("The ninja blade is close range, but deals more damage");
            } else if (playerType.equalsIgnoreCase("ninja") && weapon.equalsIgnoreCase("star")) {
                System.out.println("The ninja star does less damage, but keeps you at a safer range");
            } else if (playerType.equalsIgnoreCase("alien") && weapon.equalsIgnoreCase("claw")) {
                System.out.println("The alien claw is  close range, but deals more damage");
            } else if (playerType.equalsIgnoreCase("alien") && weapon.equalsIgnoreCase("laser")) {
                System.out.println("The alien laser does less damage, but keeps you at a safer range");
            } else {
                System.out.println("Invalid weapon.");
            }

            String location = "";
            while (!((playerType.equalsIgnoreCase("ninja") && ((location.equalsIgnoreCase("forest")) || (location.equalsIgnoreCase("space")))) ||
                    ((playerType.equalsIgnoreCase("alien") && ((location.equalsIgnoreCase("forest")) || (location.equalsIgnoreCase("space"))))))) {
                if (playerType.equalsIgnoreCase("ninja")) {
                    System.out.println("Okay ninja, Choose your location? [forest/space]");
                } else {
                    System.out.println("Okay alien, Choose your location? [forest/space]");
                }
                location = scanner.nextLine();

                if (playerType.equalsIgnoreCase("ninja") && location.equalsIgnoreCase("forest")) {
                    System.out.println("The forest gives the ninja a slight stealth advantage.");
                } else if (playerType.equalsIgnoreCase("ninja") && location.equalsIgnoreCase("space")) {
                    System.out.println("Space gives the alien a slight strength advantage.");
                } else if (playerType.equalsIgnoreCase("alien") && location.equalsIgnoreCase("forest")) {
                    System.out.println("The forest gives the ninja a slight stealth advantage.");
                } else if (playerType.equalsIgnoreCase("alien") && location.equalsIgnoreCase("space")) {
                    System.out.println("Space gives the alien a slight strength advantage.");
                } else {
                    System.out.println("Invalid Location.");
                }
                String special = "";
                while (!((playerType.equalsIgnoreCase("ninja") && ((special.equalsIgnoreCase("speed")) || ((special.equalsIgnoreCase("power")) || (special.equalsIgnoreCase("pain")))) ||
                        ((playerType.equalsIgnoreCase("alien") && ((special.equalsIgnoreCase("speed")) || ((special.equalsIgnoreCase("power")) || (special.equalsIgnoreCase("pain"))))))))) {
                    if (playerType.equalsIgnoreCase("ninja")) {
                        System.out.println("Okay ninja, Choose your special attack? [speed/power/pain]");
                    } else {
                        System.out.println("Okay alien, Choose your special attack? [speed/power/pain]");
                    }
                    special = scanner.nextLine();

                    if (playerType.equalsIgnoreCase("ninja") && special.equalsIgnoreCase("speed")) {
                        System.out.println("Speed gives the the player a high chance of making a second hit at 20% damage on the first hit.");
                    } else if (playerType.equalsIgnoreCase("ninja") && special.equalsIgnoreCase("power")) {
                        System.out.println("Power gives the the player a medium chance of doing an additional 50% damage on a hit.");
                    } else if (playerType.equalsIgnoreCase("ninja") && special.equalsIgnoreCase("pain")) {
                        System.out.println("Pain has a small change of inflicting a permanent penalty on the opponent, decreasing their overall effectiveness by 10%.");
                    } else if (playerType.equalsIgnoreCase("alien") && special.equalsIgnoreCase("speed")) {
                        System.out.println("Speed gives the the player a high chance of making a second hit at 20% damage on the first hit.");
                    } else if (playerType.equalsIgnoreCase("alien") && special.equalsIgnoreCase("power")) {
                        System.out.println("Power gives the the player a medium chance of doing an additional 50% damage on a hit.");
                    } else if (playerType.equalsIgnoreCase("alien") && special.equalsIgnoreCase("pain")) {
                        System.out.println("Pain has a small change of inflicting a permanent penalty on the opponent, decreasing their overall effectiveness by 10%.");
                    } else {
                        System.out.println("Invalid Special.");
                    }
                }
            }
        }
    }
}

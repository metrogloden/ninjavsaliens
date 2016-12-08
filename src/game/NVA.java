package game;

import game.Players.Alien;
import game.Players.Ninja;

public class NVA {

    private Ninja ninja = new Ninja();

    public Ninja getNinja() {
        return ninja;
    }

    public void setNinja(Ninja ninja) {
        this.ninja = ninja;
    }

    private Alien alien = new Alien();

    public Alien getAlien() {
        return alien;
    }

    public void setAlien(Alien alien) {
        this.alien = alien;
    }

    public void startBattle() {

        PlayNinjaVsAliens PlayNVA = new PlayNinjaVsAliens();

        System.out.println(" ");
        System.out.println("**********************************************");
        System.out.println("Time to play!");
        System.out.println(" ");
        while (alien.getHealth() > 0 && ninja.getHealth() > 0) {
            int alienDamageReceived = alien.alienDamageReceivedCalculator(ninja.ninjaDamageGivenCalculator());
            System.out.println(ninja.getPlayerName() + " attacks with the " + ninja.getPlayerWeapon() + " and deals " + alienDamageReceived + " points of damage.");
            int ninjaDamageReceived = ninja.ninjaDamageReceivedCalculator(alien.alienDamageGivenCalculator());
            System.out.println(alien.getPlayerName() + " attacks with the " + alien.getPlayerWeapon() + " and deals " + ninjaDamageReceived + " points of damage.");
            System.out.println(ninja.getPlayerName() + " Heath: " + ninja.getHealth() + "  vs  " + alien.getPlayerName() + " Health: " + alien.getHealth());

            System.out.println(" ");
            System.out.println("Press [enter] to take another turn.");
            String turn = PlayNVA.scanner.nextLine();
            System.out.println(" ");
        }

        System.out.println("**********************************************");
        if (ninja.getHealth() > 0) {
            System.out.println(ninja.getPlayerName() + " Wins!!!");
            System.out.println("Health Remaining: " + ninja.getPlayerName());
        } else if (alien.getHealth() > 0) {
            System.out.println(alien.getPlayerName() + " Wins!!!");
            System.out.println("Health Remaining: " + alien.getPlayerName());
        } else {
            System.out.println("Everyone Died!!!");
            System.out.println(ninja.getPlayerName() + " and " + alien.getPlayerName() + " both lose.");
        }
        System.out.println("**********************************************");
    }
}


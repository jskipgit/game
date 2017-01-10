package com.ironyard;

import java.util.Scanner;

public class Main {
    static final String MAGE = "M";
    static final String WARRIOR = "W";

    public static void main(String[] args) {

	// write your code here
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();

        System.out.printf("Hello %s, lets play a game!\n", name);

        System.out.println("Choose your character: ");
        System.out.printf("Type '%s' for Mage or '%s' for Warrior. ", MAGE, WARRIOR);

        String characterChoice = scanner.next();

        if(characterChoice.equals(MAGE))
        {
            // this means user chose Mage
            System.out.println("You have powerful spells!");
        }
        else if(characterChoice.equals(WARRIOR))
        {
            System.out.println("You are strong and brave!");
        }
        else
        {
            System.out.println("You are poor at following directions and fall off a cliff, goodbye.");
            System.exit(0);
        }

        // lets meet and attack a demon and always win

        if(characterChoice.equals(MAGE))
        {
            // this means user chose Mage
            System.out.println("You attacked the demon with your wind spell and blew him off the cliff!");
        }
        else
        {
            // we are a warrior
            System.out.println("You attached the demon with your axe and slayed him.");
        }
    }
}

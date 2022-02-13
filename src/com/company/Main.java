package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Boss boss = new Boss();
//        boss.sethIt(100);
//        boss.sethEalth(500);
//        System.out.println("Boss  /" + "health = " + boss.gethEalth() + boss.gethIt());

        Boss boss = new Boss();
        boss.sethIt(100);
        boss.sethEalth(500);
        System.out.println(boss.printInfo());

        Skeleton skeleton = new Skeleton();
        skeleton.setStrely(45);
        System.out.println(skeleton.printInfo());

    }
}

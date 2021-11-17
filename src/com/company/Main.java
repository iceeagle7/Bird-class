package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bird bird1 = new Bird("raven");
        Bird bird2 = new Bird("pigeon");

        bird1.fly();
        bird2.eat();

        System.out.println(bird1.equals(bird2));
        System.out.println(bird1);
        System.out.println(bird2);
    }
}

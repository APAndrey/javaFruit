package com.company;

public class Main {

    public static void main(String[] args) {

        Fruit redApple = new Fruit();
        redApple.setType(FruitType.APPLE);
        redApple.setColor(Color.RED);
        redApple.setWeight(0.146);
        redApple.setPriceKg(10.49);
        System.out.println("redApple: " + redApple);

        Fruit greenApple = new Fruit();
        greenApple.setType(FruitType.APPLE);
        greenApple.setColor(Color.GREEN);
        greenApple.setWeight(0.156);
        greenApple.setPriceKg(11.54);
        System.out.println("greenApple: " + greenApple);


        Fruit lemon = new Fruit();
        lemon.setType(FruitType.LEMON);
        lemon.setColor(Color.YELLOW);
        lemon.setWeight(0.112);
        lemon.setPriceKg(40.50);
        System.out.println("lemon: " + lemon);


        Fruit banana = new Fruit();  // Fruit banana = null;
        banana.setType(FruitType.BANANA);
        banana.setColor(Color.YELLOW);
        banana.setWeight(0.110);
        banana.setPriceKg(25.30);
        System.out.println("banana: " + banana);
    }
}

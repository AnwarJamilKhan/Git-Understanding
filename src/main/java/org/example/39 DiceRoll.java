package org.example;

class DiceRoll {

    int roll()
    {
        double random = Math.random() * 6;
        int currentRoll = (int) Math.ceil(random);
        return currentRoll;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the World of Random number generator");
        DiceRoll diceroll = new DiceRoll();
        for (int i = 0; i < 10; i++) {
            System.out.println(diceroll.roll());
        }

    }

}

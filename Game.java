package com.akanksha;

public class Game {
    private Player playerA;
    private Player playerB;

    public Game(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public void start() {
        while (playerA.isAlive() && playerB.isAlive()) {
            takeTurn();
        }

        if (playerA.isAlive()) {
            System.out.println("Player A wins!");
        } else {
            System.out.println("Player B wins!");
        }
    }

    private void takeTurn() {
        Player attacker = (playerA.getHealth() <= playerB.getHealth()) ? playerA : playerB;
        Player defender = (attacker == playerA) ? playerB : playerA;

        int attackRoll = Dice.roll();
        int defenseRoll = Dice.roll();

        int attackDamage = attackRoll * attacker.getAttack();
        int defenseValue = defenseRoll * defender.getStrength();
        int damage = Math.max(0, attackDamage - defenseValue);

        defender.setHealth(defender.getHealth() - damage);

        System.out.println("Attacker: " + (attacker == playerA ? "Player A" : "Player B"));
        System.out.println("Attack Roll: " + attackRoll + ", Attack Damage: " + attackDamage);
        System.out.println("Defense Roll: " + defenseRoll + ", Defense Value: " + defenseValue);
        System.out.println("Damage Dealt: " + damage);
        System.out.println("Defender Health: " + defender.getHealth());
        System.out.println();
    }

}

# Magical-Arena
## Overview
The Magical Arena Game is a turn-based combat simulation where two players with predefined attributes battle until one player's health reaches zero. 

## How to Run

### Prerequisites
- Java 11 or higher
- Gradle

### Steps
1. Clone the repository.
2. Navigate to the project directory.
3. Build the project using Gradle:
4. Run the game: ./gradlew run

    ### Running Tests
   5. To run the unit tests, use: ./gradlew test


## Game Mechanics
- *Players:* Each player has three attributes: health, strength, and attack.
- *Turns:* The player with the lower health attacks first. If both have the same health, a random player is chosen to start.
- *Attack and Defense:*
  - The attacker rolls a 6-sided die, and the result is multiplied by the attack value to determine the damage.
  - The defender rolls a 6-sided die, and the result is multiplied by the strength value to determine the defended damage.
  - The difference between the attack damage and the defended damage is subtracted from the defender's health.

## Example
Player A (50 health, 5 strength, 10 attack) vs Player B (100 health, 10 strength, 5 attack).

### Initial State
- Player A: 50 health
- Player B: 100 health

### Turn 1
- Player A attacks with a roll of 5.
- Player B defends with a roll of 2.
- Player A deals 50 damage (5 * 10).
- Player B defends 20 damage (2 * 10).
- Player B's health is reduced by 30 (100 - 30 = 70).

### Turn 2
- Player B attacks with a roll of 4.
- Player A defends with a roll of 3.
- Player B deals 20 damage (4 * 5).
- Player A defends 15 damage (3 * 5).
- Player A's health is reduced by 5 (50 - 5 = 45).

And so on, until one player's health reaches zero

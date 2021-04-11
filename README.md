# Pokemon-Trade

Write a program that fulfills all the following requirements.

Program Flow:
•	Trainer A has a Pikachu and Trainer B has a Squirtle
•	The two trainers will swap Pokémon.

Pokémon Features:
•	Create the Pokémon classes (Pikachu and Squirtle)
•	It should be easy to extend to support other Pokémon types.

Pokémon attributes and behavior:
•	Life Points - A "life" value that will be initialized to a random value between 50 and 100 at time of creation.
•	Attack - When it attacks, the attack value is randomized between 25 and 40
•	Defend - When attacked, the defending Pokémon will have a 33% chance to avoid (zero) damage. If not avoided the attack damage is taken from the pokémon’s life points

Pikachu attributes and behavior:
•	It has a 25% chance of increasing attack damage by 50%

Squirtle attributes and behavior
•	Avoid chance of 50%
•	Life value range of 70 - 100

Pokémon Trainer Features:
•	Create a trainer class with a name and pokémon partner

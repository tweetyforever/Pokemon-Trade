
public class Game {

	public static void main(String[] args) {
		Pokemon squirtle = new Squirtle();
		Trainer B = new Trainer("B", squirtle);
		
		Pokemon pikachu = new Pikachu();
		Trainer A = new Trainer("A", pikachu);
		
		A.orderPokemon();		
		B.orderPokemon();		
	}

}

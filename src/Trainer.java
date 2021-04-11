
public class Trainer {
	private static String name;
	private static Pokemon pokemon;
	
	public Trainer(String name, Pokemon pokemon) {
		this.name = name;
		this.pokemon = pokemon;
	}
	
	public void setPokemon(Pokemon other) {
		pokemon = other;
	}
	
	public Pokemon getPokemon() {
		return pokemon;
	}
	
	public void swap(Pokemon other) {
		pokemon = other;		
	}
	
	public void orderPokemon() {
		pokemon.scream();
	}
}

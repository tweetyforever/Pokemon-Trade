
public class Squirtle extends Pokemon{
	private static double lifePoints = ((Math.random() * 30) + 70);
	
	public Squirtle() {
		super(lifePoints);
	}
	
	@Override
	public void defend(double attackPower) {
		double defendChance = Math.random();
		
		if(defendChance > 0.5) {
			lifePoints -= attackPower;
		}
	}
	
	@Override
	public void scream() {
		System.out.println("I am squirtle");
	}
}

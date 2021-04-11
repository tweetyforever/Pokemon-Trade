
public class Pikachu extends Pokemon{
	private static double lifePoints = ((Math.random() * 50) + 50);

	public Pikachu() {
		super(lifePoints);
	}
	
	@Override
	public double attack() {
		double attackPower = super.attack();
		if(Math.random() <= 0.25) {
			attackPower *= 1.5;
		}		
		return attackPower;
	}
	
	@Override
	public void scream() {
		System.out.println("I am pikachu");
	}
}

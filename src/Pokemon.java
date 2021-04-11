
public abstract class Pokemon {
	private static double lifePoints;
	
	public Pokemon(double lifePoints) {
		this.lifePoints = lifePoints;
	}
	
	public double attack() {
		return ((Math.random() * 15) + 25);
	}
	
	public void defend(double attackPower) {
		double defendChance = Math.random();
		
		if(defendChance > 0.33) {
			lifePoints -= attackPower;
		}
	}
	
	public abstract void scream(); 
}

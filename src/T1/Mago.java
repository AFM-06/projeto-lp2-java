package T1;

public class Mago extends Personagem {
	
	public Mago() {
		super(80,"Mago",22);
	}
	
	@Override 
	public void ataqueEspecial(){
		int cura = 45;
		this.vida+=cura;
		System.out.println("Os poderes dos xãmas da natureza aumentaram a vida do mago em "+cura+" pontos.");
	}
}

package T1;

public class Arqueiro extends Personagem {
	
	public Arqueiro() {
		super(110,"Arqueiro",10);
	}
	
	@Override 
	public void ataqueEspecial(){
		this.dano+=20;
		System.out.println("O arqueiro melhorou seu foco, agora seu dano é "+this.dano+".");
	}
}

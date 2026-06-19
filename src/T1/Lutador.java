package T1;

public class Lutador extends Personagem {
	
	public Lutador() {
		super(120,"Lutador",15);
	}
	
	@Override 
	public void ataqueEspecial(){
		this.dano*=2;
		this.vida-=13;
		System.out.println("A fúria do lutador aumentou o seu dano em dobro,"
				+ " agora ele bate "+this.dano+" de dano mas piorou sua saude,"
				+ " e sua vida baixou para "+this.vida+".");
	}
}

package T1;

public abstract class Personagem {
	protected int vida;
	protected String nome;
	protected int dano;
	
	public void ataqueBasico(Personagem alvo) {
		alvo.vida-=this.dano;
		System.out.println(alvo.nome+" recebeu "+this.dano+" de dano.\n");
	}
	public abstract void ataqueEspecial();
	
	public Personagem(int vida, String nome, int dano) {
        this.vida = vida;
        this.nome = nome;
        this.dano = dano;
	}
}

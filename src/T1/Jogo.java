package T1;
import java.util.Scanner;

public class Jogo {
	//Scanner
	Scanner ler = new Scanner(System.in);
	
	//Atributos
	private Personagem jogador1;
	private Personagem jogador2;
	private int escolha_ataque;
	private int escolha_personagem;
	
	
	
	
	
	
	
	
	
	
	// Escolher vocações dos personagens
	public Personagem escolherVocacao() {
		System.out.println("-------------ESCOLHA UM PERSONAGEM---------------------");
		System.out.println("[1] -> Lutador");
		System.out.println("[2] -> Mago");
		System.out.println("[3] -> Arqueiro");
		System.out.println("-------------------------------------------------------\n");
		escolha_personagem = ler.nextInt();
		
		switch (escolha_personagem) {
			case 1:
				System.out.println("Você escolheu um Lutador.\n");
				return new Lutador();
				
			case 2:
				System.out.println("Você escolheu um Mago.\n");
				return new Mago();
			
			case 3:
				System.out.println("Você escolheu um Arqueiro.\n");
				return new Arqueiro();
	
			default:
				return null;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Metodo para não repetir o código de impressão 2x, tudo que é repetido pode virar função.
	public void turnoJogador(Personagem atacante, Personagem alvo) {
		System.out.println("------------------------------------------------------");
		System.out.println(atacante.nome+"                      ALVO: "+alvo.nome); 
		System.out.println("HP: "+atacante.vida+"                      HP: "+alvo.vida);
		System.out.println("HABILIDADE:");
		System.out.println("[1]Ataque básico -> "+atacante.dano+" de dano.");
		System.out.println("[2]Ataque especial");
		System.out.println("------------------------------------------------------\n");
		
		escolha_ataque = ler.nextInt();
		
		if(escolha_ataque == 1) {
			atacante.ataqueBasico(alvo);
			
		}else if(escolha_ataque == 2){
			atacante.ataqueEspecial();
			
		}else {
			System.out.println("Comando errado, jogada perdida!/n");
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	public void batalhaJogadores() {
		//Define os personagens
		jogador1 = escolherVocacao();
		jogador2 = escolherVocacao();
		
		//Turnos até algum guerreiro falecer bravamente em batalha
		while(jogador1.vida>0 && jogador2.vida>0) {
			
			turnoJogador(jogador1, jogador2);
			
			//Jogador 2 pode nao resistir a lapada e morrer antes de acabar o turno
			if(jogador2.vida<=0) {
				break;
				}
			
			turnoJogador(jogador2, jogador1);
			
		}
		
		// FIM
		if(jogador1.vida<=0) {
			System.out.println("Vitória do jogador 2, "+jogador2.nome+".");
		}else if(jogador2.vida<=0) {
			System.out.println("Vitoria do jogador 1, "+jogador1.nome+".");
		}
	}
}

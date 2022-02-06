package avaliacao1;

//Impostando bibliotecas
import java.util.Scanner;

public class TesteQuiz {
	
	public static void main(String[] args) {
		
		//instancias
		Pergunta pergunta = new Pergunta(); 
		Resposta resposta = new Resposta();
		Scanner scanner = new Scanner(System.in); 
		
		//declaração de variaveis
		int acertos = 0, erros = 0, i = 0;
		String nomeUsuario;
		String[] respostaDoUsuario = new String[4];
		
		System.out.println("Informe seu nome para começar o Quiz: ");
		nomeUsuario = scanner.nextLine();
		
		for(i = 0 ; i < 4 ; i++) {
			do {
				
				try {
					
					System.out.println(pergunta.fazPerguntas(i));
					respostaDoUsuario[i] = scanner.nextLine().substring(0,1); // substring vai pegar apenas o primeiro caracterer
					
				} catch (Exception e) {
					
					System.out.println("ERRO no sistema");
				}
		
				//caso for diferente das alternativas, vai voltar para mesma questao
			}while(!respostaDoUsuario[i].equals("a") != !respostaDoUsuario[i].equals("b") != !respostaDoUsuario[i].equals("c") != !respostaDoUsuario[i].equals("d") !=
					!respostaDoUsuario[i].equals("e"));
			
			if(respostaDoUsuario[i].equals(resposta.confirmaRespostas(i))) { //caso a resposta do usuario foi igual da resposta
				
				System.out.println("\nParabéns, "+nomeUsuario+" voce acertou!\n");
				acertos++;
				
			}else {
				
				System.out.println("EROOOOuu.\n\n");
				erros++;
			}
		
		}
		System.out.println("Nome: "+nomeUsuario);
		System.out.println("Acertos: "+acertos);
		System.out.println("Erros: "+erros);
	}
}

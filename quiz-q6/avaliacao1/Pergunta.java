package avaliacao1;

public class Pergunta {
	
	public String fazPerguntas(int i) {
		
		String[] perguntas = new String[4];
		
		perguntas[0] = "1) Qual o nome do presidente do Brasil que ficou conhecido como Jango?.\n"
				+ "a) Jânio Quadros\n"
				+ "b) Jacinto Anjos\n"
				+ "c) Getúlio Vargas\n"
				+ "d) João Figueiredo\n"
				+ "e) João Goulart";
		
		perguntas[1] = "2) Em que período da pré-história o fogo foi descoberto?.\n"
	
				+ "a) Neolítico\n"
				+ "b) Paleolítico\n"
				+ "c) Idade dos Metais\n"
				+ "d) Período da Pedra Polida\n"
				+ "e) Idade Média";
		
		perguntas[2] = "3) Qual a montanha mais alta do Brasil?.\n"

				+ "a) Pico da Neblina\n"
				+ "b) Pico Paraná\n"
				+ "c) MOnte Roraima\n"
				+ "d) Pico Maior de Friburgo\n"
				+ "e) Pico da Bandeira";
		
		perguntas[3] = "4) Se 250 g de azeitonas custam R$ 4,60, qual será o preço de 3/4 de quilo de azeitonas?\n\n"
				+ "a) R$ 9,20\n"
				+ "b) R$ 10,60\n"
				+ "c) R$ 12,80\n"
				+ "d) R$ 13,80\n"
				+ "e) R$ 14,60";
		
		
		return perguntas[i] + "\n\nInforme a alternativa escolhida: ";
	}
		
}

package avaliacao1;

public class Cadastros {
	public static boolean login(String usuario, String senha) {
		
		int i=0;
		
		String[] usuariosCadastrados = {"ketson","compass","teste","adm"};
		
		String[] senhasCadastradaStrings = {"123456","admin","testando","adm"};
		
		//repetição que pega a quantidade de usuarios cadastrados, e vai fazer o loop, se encontrar nos vetores vai retornar true
		for(i = 0 ; i < usuariosCadastrados.length ; i++) {
			if(usuario.equals(usuariosCadastrados[i]) && senha.equals(senhasCadastradaStrings[i])) {
				return true;
			}
		}
		return false;
	}
	
}

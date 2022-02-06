package avaliacao1;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class TestaQuestao7 {

	public static void main(String[] args) {
		
		//instacias
		Scanner scanner = new Scanner(System.in);
		Usuario usuario = new Usuario();
		
		Calendar cal = Calendar.getInstance();
		int hora = cal.get(Calendar.HOUR_OF_DAY);
		
		//inputs
		System.out.println("Usuario: ");
		usuario.setUsuario(scanner.next());
		System.out.println("Senha: ");
		usuario.setSenha(scanner.next());

		if (Cadastros.login(usuario.getUsuario(), usuario.getSenha())) {
			if (hora >= 6 && hora < 12) 
				System.out.println("Bom dia, você se logou ao nosso sistema.");
			else if (hora >= 12 && hora < 18) 
				System.out.println("Boa tarde, você se logou ao nosso sistema");
			else if (hora >= 18 && hora < 24)
				System.out.println("Boa noite, você se logou ao nosso sistema");
			else 
				System.out.println("Boa madrugada, você se logou ao nosso sistema.");
		} else 
			System.out.println("Usuário e/ou senha incorretos.");

	}

}

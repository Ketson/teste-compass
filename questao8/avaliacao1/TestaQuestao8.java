package avaliacao1;

import java.util.Scanner;

public class TestaQuestao8 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double bonus;

		System.out.println("Insira o numero de funcionarios que deseja cadastrar:");
		Funcionario[] funcionarios = new Funcionario[entrada.nextInt()];
		entrada.nextLine();

		// for que vai rodar a quantidade de funcionarios que foi digitado pelo usuario
		for (int i = 0; i < funcionarios.length; i++) {
			funcionarios[i] = new Funcionario();

			System.out.println("Insira o nome do " + (i + 1) + "° funcionario:");
			funcionarios[i].setNome(entrada.nextLine());

			System.out.println("Insira o salario do " + (i + 1) + "° funcionario:");
			funcionarios[i].setSalario(entrada.nextDouble());
			entrada.nextLine();
		}

		// percorre todos os elementos do array funcionarios - funcionario é um elemento
		// do array funcioarios
		for (Funcionario funcionario : funcionarios) {

			System.out.println("Funcionario: " + funcionario.getNome());
			System.out.println("Salario: " + funcionario.getSalario());

			if (funcionario.getSalario() <= 1000) {
				bonus = funcionario.getSalario() * 0.2;

			} else if (funcionario.getSalario() <= 2000) {
				bonus = funcionario.getSalario() * 0.1;

			} else {
				bonus = funcionario.getSalario() * 0.1;

			}
			System.out.println("Funcionario: " + funcionario.getNome());
			System.out.println("Salario: " + funcionario.getSalario());
			System.out.println("Bonus/Desconto: " + bonus);
			System.out.println("Salario liquido: " + (funcionario.getSalario() + bonus) + "\n");

		}
	}

}

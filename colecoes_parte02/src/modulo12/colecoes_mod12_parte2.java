package modulo12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class colecoes_mod12_parte2 {

	public static void main(String[] args) {

		List<String> nomesMasculinos = new ArrayList<>();
		List<String> nomesFemininos = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite 3  nomes do sexo masculino :");
		while (nomesMasculinos.size() < 3) {
			String nome = scanner.nextLine().trim();
			if (!nome.isEmpty()) {
				nomesMasculinos.add(nome);
			} else {
				System.out.println("Nome inválido! Digite novamente:");
			}
		}

		System.out.println("Digite 3 nomes do sexo feminino:");
		while (nomesFemininos.size() < 3) {
			String nome = scanner.nextLine().trim();
			if (!nome.isEmpty()) {
				nomesFemininos.add(nome);
			} else {
				System.out.println("Nome inválido! Digite novamente:");
			}
		}

		System.out.println("\nNomes masculinos:");
		for (String nome : nomesMasculinos) {
			System.out.println(nome);
		}

		System.out.println("\nNomes femininos:");
		for (String nome : nomesFemininos) {
			System.out.println(nome);
		}

		scanner.close();
	}
}

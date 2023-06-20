package tarefa_colecoes;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;

public class parte02 {

	public static void main(String[] args) {
		

		  List<String> nomesMasculinos = new ArrayList<>();
	        List<String> nomesFemininos = new ArrayList<>();

	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite 4 nomes masculinos:");
	        for (int i = 0; i < 4; i++) {
	            String nomeMasculino = scanner.nextLine();
	            nomesMasculinos.add(nomeMasculino);
	        }

	        System.out.println("Digite 4 nomes femininos:");
	        for (int i = 0; i < 4; i++) {
	            String nomeFeminino = scanner.nextLine();
	            nomesFemininos.add(nomeFeminino);
	        }

	        // Ordenar os nomes em ordem alfabética
	        Collections.sort(nomesMasculinos);
	        Collections.sort(nomesFemininos);

	        System.out.println("\nNomes masculinos em ordem alfabética:");
	        for (String nome : nomesMasculinos) {
	            System.out.println(nome);
	        }

	        System.out.println("\nNomes femininos em ordem alfabética:");
	        for (String nome : nomesFemininos) {
	            System.out.println(nome);
	        }

	        scanner.close();
	    }
	}
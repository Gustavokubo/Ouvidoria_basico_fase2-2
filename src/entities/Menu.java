package entities;

import java.util.Scanner;

public class Menu {

	Scanner sc = new Scanner(System.in);

	public void menuIdentificacao() {
		
		System.out.println("|============================|");
		System.out.println("|    OUVIDORIA UNIFACISA     |");
		System.out.println("|============================|");
		System.out.println("|                            |");
		System.out.println("|  IDENTIFIQUE-SE COM O SEU  |");
		System.out.println("|       NOME E SEU CPF       |");
		System.out.println("|                            |");
		System.out.println("|============================|");
		System.out.println("");
		
	}
	
	
	public void menuPrincipal() {

		System.out.println("|============================|");
		System.out.println("|    OUVIDORIA UNIFACISA     |");
		System.out.println("|============================|");
		System.out.println("|          OPÇÕES:           |");
		System.out.println("|                            |");
		System.out.println("|1 - ADICIONAR MANIFESTAÇÃO  |");
		System.out.println("|                            |");
		System.out.println("|2 - LISTAR DE MANIFESTAÇÕES |");
		System.out.println("|                            |");
		System.out.println("|3 - SAIR DO SISTEMA         |");
		System.out.println("|                            |");
		System.out.println("|============================|");
		System.out.println("");
		System.out.print("Digite sua opção: ");

	}

	public void menuManifestacoes() {

		System.out.println("|============================|");
		System.out.println("|    OUVIDORIA UNIFACISA     |");
		System.out.println("|============================|");
		System.out.println("|          OPÇÕES:           |");
		System.out.println("|                            |");
		System.out.println("|1 - ADICIONE UMA RECLAMAÇÃO |");
		System.out.println("|                            |");
		System.out.println("|2 - ADICIONE UM ELOGIO      |");
		System.out.println("|                            |");
		System.out.println("|3 - ADICIONE UMA SUGESTÃO   |");
		System.out.println("|                            |");
		System.out.println("|============================|");
		System.out.println("");
		System.out.print("Digite sua opção: ");

	}
}

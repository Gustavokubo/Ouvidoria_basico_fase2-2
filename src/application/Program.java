package application;

import java.util.Scanner;

import entities.Elogio;
import entities.Manifestacao;
import entities.Menu;
import entities.Pessoa;
import entities.Reclamacao;
import entities.Sugestao;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int countManifestacao = 0;

		Menu menu = new Menu();

		menu.menuIdentificacao();
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("CPF: ");
		String cpf = sc.nextLine();
		Pessoa pessoa = new Pessoa(nome,cpf);

		int opcao = 1;
		while (opcao != 0) {
			System.out.println("");
			menu.menuPrincipal();
			opcao = sc.nextInt();
			

			switch (opcao) {

			case 1: {

				menu.menuManifestacoes();
				opcao = sc.nextInt();
				sc.nextLine();

				if (countManifestacao < 5) {

					// Código para chamar a opção Reclamação
					if (opcao == 1) {

						System.out.println("|=========================|");
						System.out.println("| Digite sua reclamação:  |");
						System.out.println("|=========================|");

						String Reclamacao = sc.nextLine();

						Reclamacao reclamacao = new Reclamacao(Reclamacao, pessoa);
						Manifestacao.inserir(reclamacao);
						Manifestacao.incrementaContador();
						countManifestacao++;

						System.out.println("");
						System.out.println("Reclamação cadastrada com sucesso!");
						System.out.println("");

						break;
					}

					// Código para chamar a opção Elogio.
					if (opcao == 2) {

						System.out.println("|=========================|");
						System.out.println("|    Digite seu elogio:   |");
						System.out.println("|=========================|");

						String Elogio = sc.nextLine();

						Elogio elogio = new Elogio(Elogio, pessoa);
						Manifestacao.inserir(elogio);
						Manifestacao.incrementaContador();
						countManifestacao++;

						System.out.println("");
						System.out.println("Elogio cadastrado com sucesso!");
						System.out.println("");

						break;
					}

					// Código para chamar a opção Sugestão.
					if (opcao == 3) {

						System.out.println("|=========================|");
						System.out.println("|   Digite sua sugestão:  |");
						System.out.println("|=========================|");

						String Sugestao = sc.nextLine();

						Sugestao sugestao = new Sugestao(Sugestao, pessoa);
						Manifestacao.inserir(sugestao);
						Manifestacao.incrementaContador();
						countManifestacao++;

						System.out.println("");
						System.out.println("Sugestão cadastrada com sucesso!");
						System.out.println("");
						break;
					}

				} else {
					System.out.println("Armazenamento cheio! Capacidade para 5 manifestações");
					sc.nextLine();
					System.out.println("Tecla Enter para Continuar!");
					sc.nextLine();
					break;
				}
			}

			case 2: {

				System.out.println("|==========================|");
				System.out.println("|  LISTA DE MANIFESTAÇÕES  |");
				System.out.println("|==========================|");

				Manifestacao.listar();
				
				break;
			}

			case 3: {
				opcao=0;
				
				System.out.println("Obrigado por utilizar nossos sistemas!");
			}

				sc.close(); // Fecha o Scanner

			} // Fecha o Switch
		} // Fecha o While
	} // Fecha o Main
} // Fecha a classe Program
